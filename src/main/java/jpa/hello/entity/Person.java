package jpa.hello.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_PERSON")
public class Person {

    private Long id;
    private String firstName;
    private String lastName;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FIRST_NAME", length = 100, nullable = false, unique = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Person(id=%d, firstName=%s, lastName=%s", id, firstName, lastName);
    }

}
