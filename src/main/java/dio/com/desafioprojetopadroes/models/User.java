package dio.com.desafioprojetopadroes.models;

import jakarta.persistence.*;
@Entity
@Table(name = "Table_User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_User")
    private Integer Id;
    @Column(length=50, nullable = false)
    private String name;
    @Column(unique = true)
    private String email;
    @Column(length=20, nullable = false)
    private String login;
    @Column(length=100, nullable = false)
    private String password;

    public User(){}

    public User(String name, String email, String login, String password){
        this.name = name;
        this.email = email;
        this.login = login;
        this.password = password;
    }
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
