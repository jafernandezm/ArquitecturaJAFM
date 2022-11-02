/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buiderexamen;

/**
 *
 * @author ACER
 */
public class CasaMaster {
     private CasaBuider casaBuider;

        public CasaMaster(CasaBuider casaBuider)
        {
            this.casaBuider = casaBuider;
        }

        public void BuildSandwich()
        {
            casaBuider.construirGarage();
            casaBuider.construirParedes();
            casaBuider.construirPiso();
            casaBuider.construirTecho();

        }

        public Casa getCasa()
        {
            return casaBuider.getCasa();
        }
}
