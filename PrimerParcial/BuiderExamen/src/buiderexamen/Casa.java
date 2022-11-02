/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buiderexamen;

import java.util.List;

/**
 *
 * @author ACER
 */
public class Casa {

    public Pared paredes[]= new Pared[3];
    public Techo techo;
    public Piso piso;
    public Garaje garaje;
    public List<Pared> paredesss;
    
    public void Mostrar() {
        System.out.println("Paredes");
        for(int i = 0; i< paredes.length; i++){
            System.out.println("Pared" + i + ": " + paredes[i]);
        }
       
        System.out.println("Piso: " + piso);
    
        System.out.println("Techo: " + techo);
        
        System.out.println("Garaje: " + garaje);
        
    }
    


}
