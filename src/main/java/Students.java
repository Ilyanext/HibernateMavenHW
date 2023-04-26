// Импорт аннотаций
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Аннотация @Entity указывает, что данный класс является сущностью
// и должен быть связан с таблицей в базе данных.
@Entity

// Аннотация @Table используется для указания имени таблицы в базе данных,
// с которой будет связана данная сущность. Если аннотация отсутствует,
// будет использоваться имя класса в качестве имени таблицы.
@Table(name = "students")

public class Students {

    // Аннотация @Id указывает на то, что данное поле
    // является первичным ключом для данной сущности.
    @Id

    // Аннотация @GeneratedValue используется для указания стратегии
    // генерации значения первичного ключа. В данном случае выбрана стратегия
    // GenerationType.IDENTITY, что означает, что значение первичного ключа
    // будет генерироваться базой данных с помощью автоинкремента.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Аннотация @Column используется для указания имени столбца
    // в базе данных, с которым будет связано данное поле.
    // Если аннотация отсутствует, будет использоваться имя поля
    // в качестве имени столбца.
    @Column(name = "name")
    private String name;

    // Аннотация @Column указывает на связь поля
    // с определенным столбцом в таблице.
    @Column(name = "age")
    private int age;

    // Конструктор без параметров обязателен для сущностей JPA.
    public Students() {
    }

    // Геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

