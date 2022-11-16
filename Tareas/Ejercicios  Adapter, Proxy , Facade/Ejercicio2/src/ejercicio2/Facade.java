/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author PLANET-PC
 */
public class Facade {
   private ICola colaProxy;

    public Facade() {
        colaProxy = new ColaProxy(new Cola());
    }

    public void insertar(int num) {
        colaProxy.insertar(num);
    }	
    
    public void eliminar() {
        colaProxy.eliminar();
    }
    
    public void mostrar() {
        colaProxy.mostrar();
    }
}
