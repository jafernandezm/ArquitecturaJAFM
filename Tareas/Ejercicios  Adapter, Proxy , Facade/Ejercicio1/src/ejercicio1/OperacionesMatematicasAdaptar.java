/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author PLANET-PC
 */
public class OperacionesMatematicasAdaptar implements IOperacionesMatematicas {
    private OperacionesMatematicas operacionesMatematicas;

    public OperacionesMatematicasAdaptar() {
        this.operacionesMatematicas = new OperacionesMatematicas();
    }

    public int sumar(int a, int b) {
        int[] elementos = { a, b };
        return this.operacionesMatematicas.sumaelementos(elementos);
    }

    public int sumatoria(int n) {
        int[] elementos = new int[n];
        for (int i = 0; i < n; i++) {
            elementos[i] = i + 1;
        }
        return this.operacionesMatematicas.sumaelementos(elementos);
    }
}
