/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author israc
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        
        Libro libros[] = null;
        System.out.print("Ingrese cuantos libros deseea registrar: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        do{
            System.out.println("1. Registre el libro");
            System.out.println("2. Prestar");
            System.out.println("3. Devolver");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.println("Eliga una de las opciones disponibles: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    libros = new Libro[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("DATOS DEL LIBRO " + (i+1) + " :");
                    System.out.print("Ingrese el titulo del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el nombre del autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese el estado del libro: ");
                    String estado = sc.nextLine();
                    System.out.print("Ingrese el numero de paginas del libro: ");
                    int paginas = sc.nextInt();
                    sc.nextLine();
                    libros [i]= new Libro(titulo, autor, estado, paginas); 
                }break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        libros[i].prestar();
                    }break;
                case 3:
                    for (int i = 0; i < n; i++) {
                        libros[i].devolver();
                    }break;
                case 4:
                    for (int i = 0; i < n; i++) {
                        libros[i].mostrarInfo();
                    }break;
                case 5:break;
                default:
                    System.out.println("Ingrese una opcion valida");break;
        }
        }while (op!=5);
        sc.close();
    }
    
}
