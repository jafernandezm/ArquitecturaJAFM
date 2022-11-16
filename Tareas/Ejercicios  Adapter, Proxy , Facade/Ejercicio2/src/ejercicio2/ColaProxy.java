/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.logging.Logger;
/**
 *
 * @author PLANET-PC
 */
public class ColaProxy implements ICola{
        private ICola cola;
    private final static Logger LOGGER = Logger.getLogger(ColaProxy.class.getName());
    
    public ColaProxy(ICola cola) {
        this.cola = cola;
    }

    @Override
    public void insertar(int num) {
        LOGGER.info("----Cola Proxy - Insertar Elemento----");
        cola.insertar(num);
    }

    @Override
    public void eliminar() {
        LOGGER.info("----Cola Proxy - Eliminar Elemento----");
        cola.eliminar();
    }

    @Override
    public void mostrar() {
        LOGGER.info("----Cola Proxy - Mostrar Elementos de la Cola----");
        cola.mostrar();
    }

    @Override
    public void mostrarHistorial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
