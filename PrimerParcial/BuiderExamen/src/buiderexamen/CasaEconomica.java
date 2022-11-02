/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buiderexamen;

import enumerados.Color;
import enumerados.MaterialPiso;
import enumerados.MaterialTecho;
import enumerados.MaterialPuerta;
import enumerados.MaterialPared;
import enumerados.TipoMarco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class CasaEconomica  extends CasaBuider {

    
    public void construirParedes() {
       
       //casa.paredes=new Pared[3];
       //pared 1
       casa.paredes[0] = new Pared( Color.azul, MaterialPared.adobe);
       Puerta puerta=new Puerta(3.0,0.9, MaterialPuerta.aglomerado);

       puerta.setMaterialPuerta(MaterialPuerta.aglomerado);
       casa.paredes[0].puertas.add(puerta);
       //pared 2
       casa.paredes[1]=new Pared(Color.azul,MaterialPared.adobe);
       Ventana ventana=new Ventana( 1.0, 1.0 ,TipoMarco.fierro,Color.anaranjado);
       
       //paredes 3 y 4
       casa.paredes[2]=new Pared(Color.azul,MaterialPared.adobe);
       casa.paredes[3]=new Pared(Color.azul,MaterialPared.adobe);
       
       
       //casa.paredesss=new ArrayList();
       //casa.paredes.add(new Pared( Color.azul, MaterialPared.adobe));
       
    }

    @Override
    public void construirTecho() {
        casa.techo=new Techo(MaterialTecho.teja, Color.verde);
        
        casa.techo.materialTecho=MaterialTecho.calamina;
        casa.techo.color=Color.amarillo;
        
        //casa.paredes=new Pared();
        
        
    
    }

    @Override
    public void construirPiso() {
        casa.piso=new Piso(MaterialPiso.cemento,Color.azul);
        casa.piso.material=MaterialPiso.cemento;
    }

    @Override
    public void construirGarage() {
        //casa.garaje=new Garaje();
        
    }
    
}
