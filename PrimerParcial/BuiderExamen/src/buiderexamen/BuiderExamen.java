/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buiderexamen;

/**
 *
 * @author ACER
 */
public class BuiderExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CasaMaster casaMasterEconimica = new CasaMaster(new CasaEconomica());
        
        casaMasterEconimica.BuildSandwich();
        Casa casa1 = casaMasterEconimica.getCasa();
        casa1.Mostrar();
    }
    
}
