/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author PLANET-PC
 */
public class OperacionesMatematicas {
     public int sumaelementos(int[] elementos) {
        int suma = 0;
        for (int i = 0; i < elementos.length; i++) {
            suma += elementos[i];
        }
        return suma;
    }
}
