/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublic;
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getanioPublic() {
        return anioPublic;
    }
    
    //Setters
    public void setAnioPublic (int anioPublic){
        if (anioPublic <= 2025) {
            this.anioPublic = anioPublic;
        } else {
            System.out.println(anioPublic + " es un año imposible\n");
        }
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublic);
    }
}
