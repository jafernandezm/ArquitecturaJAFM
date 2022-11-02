/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buiderexamen;

/**
 *
 * @author ACER
 */
abstract class CasaBuider {
    protected Casa casa;
    
    public Casa getCasa() {
        return casa;
    }

    public void createCasa() {
        casa = new Casa() {};
    }

    public abstract void construirParedes();
                                                    
    public abstract void construirTecho();

    
    public abstract void construirPiso();

    public abstract void construirGarage();

}
