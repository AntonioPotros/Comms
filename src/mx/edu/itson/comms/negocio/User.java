/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itson.comms.negocio;

/**
 *
 * @author asterium
 */
public class User {
    // Declaración de variables de instancia privadas para almacenar información de un usuario
    
    // Nombre del usuario
    private String name; 
    // Apellido del usuario
    private String last_Name;
    //Contraseña del usuario
    private String password;
    // Identificación única del usuario
    private int id;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the last_Name
     */
    public String getLast_Name() {
        return last_Name;
    }

    /**
     * @param last_Name the last_Name to set
     */
    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
  
    
}
