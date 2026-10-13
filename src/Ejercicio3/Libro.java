/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author israc
 */
public class Libro {
    //Atributos
    String titulo, autor, estado;
    int paginas;
    
    //Constructores 
    public Libro() {
    }

    public Libro(String titulo, String autor, String estado, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.paginas = paginas;
    }
    
    //Metodos 
    public void prestar(){
        if (estado.equalsIgnoreCase("disponible")) {
            estado = "prestado";
            System.out.println("El libro " + titulo + " fue prestado con exito");
        }else if (estado.equalsIgnoreCase("prestado") && estado.equalsIgnoreCase("extraviado")) {
            System.out.println("El libro " + titulo + " no esta disponible ya que fue " + estado);
        }
    }
    public void devolver(){
        if (estado.equalsIgnoreCase("prestado")) {
            estado = "disponible";
            System.out.println("El libro" + titulo + " fue devuelto con exito");
        }
    }
    public void mostrarInfo(){
        System.out.println("=====INFORMACION LIBROS=====");
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El numero de paginas del libro es de: " + paginas);
        System.out.println("El estado en el que se encuentra el libro es: " + estado);
    }
}
