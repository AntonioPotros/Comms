/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itson.comms.negocio;

import java.util.Date;

/**
 *
 * @author asterium
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de un objeto de tipo User y asignación de atributos
        User u1 = new User();
        // Asignación del nombre "Raul"
        u1.setName("Raul");
        // Asignación del apellido "Gutierrez"
        u1.setLast_Name("Gutierrez");
        // Asignación del ID 244352
        u1.setId(244352);
        // Asignación de la contraseña "1234"
        u1.setPassword("1234");
        
        User u2 = new User();
        u2.setName("Sooy");
        u2.setLast_Name("Danielaaaa");
        u2.setId(234458);
        u2.setPassword("4321");
        
        User u3 = new User();
        u3.setName("Armando");
        u3.setLast_Name("Eslavado");
        u3.setId(253425);
        u3.setPassword("142536");
        
        
        // Creación de un objeto de tipo Category y asignación del nombre
        Category category = new Category();
         // Asignación del nombre "Teoria de la relatividad"
        category.setName("Teoria de la relatividad");
        
        // Creación de un objeto de tipo Post y asignación de atributos
        Post post = new Post();
        // Asignación de la categoría "Fisica"
        post.setCategory("Fisica");
        // Asignación del usuario "Antonio Alatorre"
        post.setUser("Antonio Alatorre");
        // Asignación de 3 comentarios negativos
        post.setNegative_com(3);
        // Asignación de 50 comentarios positivos
        post.setPositive_com(50);
        // Asignación de la URL de la imagen
        post.setImage("https://m.media-amazon.com/images/I/412T45799AL._AC_UF894,1000_QL80_.jpg");
        
        // Creación de tres objetos de tipo Comments y asignación de comentarios
        // Asignación de comentario
        Comments c1 = new Comments();
        // Asignación de comentario
        c1.setComments("a Newton tambien se le vio como un \"Genio loco, que no teme pensar distinto\" ... veo cierta intencion de percibir a Newton como lo tradicional y a Einstein como lo innovador.. pero eso es un efecto social y temporal.. en su epoca Newton fue tan innovador como Einstein...");
        Comments c2 = new Comments();
        // Asignación de comentario
        c2.setComments("\"El genio loco que no teme a pensar distinto\" como adoro a Einstein");
        Comments c3 = new Comments();
        c3.setComments("Me acuerdo que la vida de Einstein que hizo nat geo fue muy interesante, era un tipo que a todo momento se preguntaba el porque de las cosas y se esforzaba por descubrir como funcionan las cosas. Fascinante.");
        
        // Creación de un objeto de tipo Date
        Date date = new Date();
        date.setTime(5_03);
        
        
        
        
        
        //Impresion en consola de los objetos anteriores
        System.out.println("Login"+"\n"+"ID: "+u1.getId()+"\n"+"Password: "+u1.getPassword());
        System.out.println("Bienvenido "+"\n"+post.getUser());
        System.out.println("Categoria: "+post.getCategory());
        System.out.println("Nombre del libro: "+category.getName());
        System.out.println(post.getImage());
        System.out.println("Caja de comentarios:"+"\n");
        System.out.println(
                "@"+u1.getName()+u1.getLast_Name()+": "+"\n"+c1.getComments()+"\n"
                +"@"+u2.getName()+u2.getLast_Name()+": "+"\n"+c2.getComments()+"\n"
                +"@"+u3.getName()+u3.getLast_Name()+": "+"\n"+c3.getComments()+"\n");
        System.out.println("Like:"+post.getPositive_com()+" "+"Dislike:"+post.getNegative_com());
        
        
        
        
        
        
        
        
    }
    
}
