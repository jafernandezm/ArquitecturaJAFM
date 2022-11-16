/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author PLANET-PC
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int operaciones = 0;
        do {
            
            System.out.println("\nMENÚ DE OPCIONES\n"
                                +"\n1. Sumar\n"+
                                "\n2. Sumatoria\n"+
                                "\n3. Salir\n"+
                                "\nIngrese una opcion:");

            operaciones = sc.nextInt();
            switch (operaciones) {
                case 1:
                    IOperacionesMatematicas sumar = new OperacionesMatematicasAdaptar();
                    System.out.println("Ingrese el primer numero");
                    int a = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    int b = sc.nextInt();
                    System.out.println("La suma es: " + sumar.sumar(a, b));
                    break;
                case 2:
                    sumar = new OperacionesMatematicasAdaptar();
                    System.out.println("Ingrese el numero");
                    int n = sc.nextInt();
                    System.out.println("La sumatoria es: " + sumar.sumatoria(n));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }
        } while (operaciones != 3);
    }
    
}
