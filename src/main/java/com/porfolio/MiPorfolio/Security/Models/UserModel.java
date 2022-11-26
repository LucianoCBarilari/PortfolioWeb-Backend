package com.porfolio.MiPorfolio.Security.Models;
/* */
import javax.persistence.*;
import javax.persistence.Table;
/*
 * Modelo de la tabla usuarios en la base de datos
 */

@Entity
@Table(name ="usuarios")
public class UserModel { 
//tabla
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private int id;

    @Column(length = 20, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(length = 10,nullable = false)
    private String AccessControl;


//Constructores
    public UserModel(){}
    public UserModel(int id,String username, String password, String AccessControl) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.AccessControl = AccessControl;
    }
//Getters And Setters    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAccessControl() {
        return AccessControl;
    }
    public void setAccessControl(String accessControl) {
        AccessControl = accessControl;
    }


}