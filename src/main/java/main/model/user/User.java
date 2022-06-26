package main.model.user;

import javax.persistence.*;

/**
 * Заглушка на будущий класс пользователя. (временно никакой информационной безопасности, потом будет лучше)
 */
@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue         private int id;
    @Column(name = "user_name") private String name;
    @Column(name = "password")  private String password;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
