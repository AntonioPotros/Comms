/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itson.comms.negocio;

import java.util.Date;

/**
 *
 * @author asterium
 */
public class Post {
    // Declaración de variables de instancia privadas para almacenar información de un post
    
    // Categoría del post
    private String category;
    // Usuario asociado al post
    private String user;
    // Cantidad de comentarios negativos
    private int negative_com;
    // Cantidad de comentarios positivos
    private int positive_com;
    // URL de la imagen asociada al post
    private String image;
    // Fecha del post
    private Date date = new Date();

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    

    /**
     * @return the negative_com
     */
    public int getNegative_com() {
        return negative_com;
    }

    /**
     * @param negative_com the negative_com to set
     */
    public void setNegative_com(int negative_com) {
        this.negative_com = negative_com;
    }

    /**
     * @return the positive_com
     */
    public int getPositive_com() {
        return positive_com;
    }

    /**
     * @param positive_com the positive_com to set
     */
    public void setPositive_com(int positive_com) {
        this.positive_com = positive_com;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    
    





}
