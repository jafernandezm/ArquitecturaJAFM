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
/**
 *
 * @author ACER
 */
public class CasaLujo extends CasaBuider{
    
    @Override
    public void construirParedes() {
        casa.paredes = new Pared[4];
        
        
        casa.paredes[0] = new Pared(Color.amarillo, MaterialPared.adobe);
        
        
        
        
        casa.paredes[0].puertas.add(new Puerta(2.0, 1.5, MaterialPuerta.madera));
        casa.paredes[1] = new Pared(Color.amarillo, MaterialPared.adobe);
        casa.paredes[1].ventanas.add(new Ventana(1.0, 1.0, TipoMarco.madera, Color.azul));
        casa.paredes[2] = new Pared(Color.amarillo, MaterialPared.adobe);
        casa.paredes[2].ventanas.add(new Ventana(1.0, 1.0, TipoMarco.madera, Color.blanco));
        casa.paredes[3] = new Pared(Color.amarillo, MaterialPared.adobe);
        casa.paredes[3].puertas.add(new Puerta(2.0, 1.5, MaterialPuerta.madera));
    }

    @Override
    public void construirTecho() {
        Techo techo= new Techo(MaterialTecho.teja, Color.verde);
        casa.techo = techo;
        /*casa.techo.material = MaterialTecho.teja;
        casa.techo.color = Color.azul;*/
    }

    @Override
    public void construirPiso() {
        Piso piso= new Piso(MaterialPiso.porcelanato, Color.blanco);
        casa.piso = piso;
        /*casa.piso.material = MaterialPiso.porcelanato;
        casa.piso.color = Color.rojo;*/
    }

    @Override
    public void construirGarage() {
        
        casa.garaje = new Garaje(4,3,2);
    }
    
}
