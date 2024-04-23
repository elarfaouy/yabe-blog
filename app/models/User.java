package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
@Table(name="blog_users")
public class User extends Model {
    public String email;
    public String password;
    public String name;
    public Boolean isAdmin;

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}