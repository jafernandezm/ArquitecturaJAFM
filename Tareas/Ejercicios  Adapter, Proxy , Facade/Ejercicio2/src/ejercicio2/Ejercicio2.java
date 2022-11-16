/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author PLANET-PC
 */
import java.util.Scanner;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Facade cola = new Facade();
        
        int operacion=0;
        do {

            System.out.println("Menu Cola\n"
            +"1. Insertar Elemento\n"
            +"2. Eliminar Elemento\n"
            +"3. Mostrar Cola\n"
            +"4. Mostrar Historial\n"
            +"5. Salir\n"+
            "Ingrese una opcion: ");
            
            
            
            operacion = sc.nextInt();
            
            switch(operacion) {
                case 1:
                    System.out.print("Ingrese numero para la cola: ");
                    int numero = sc.nextInt();
                    cola.insertar(numero);
                    break;
                case 2:
                    System.out.println("Elemento Eliminado");
                    cola.eliminar();
                    break;
                case 3:
                    cola.mostrar();
                    break;
                case 4:
                    System.out.println("Bitacora");
                    break;
                case 5:
                    System.out.println("Cerrando Programa");
                    
                    break;
            }
        } while(operacion !=5 );
    }
    
}
