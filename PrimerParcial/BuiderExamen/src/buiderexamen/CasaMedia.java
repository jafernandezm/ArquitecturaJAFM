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

public class CasaMedia extends CasaBuider{

    @Override
    public void construirParedes() {
        casa.paredes = new Pared[4];
        casa.paredes[0] = new Pared(Color.amarillo, MaterialPared.adobe);
        casa.paredes[0].puertas.add(new Puerta(2.0,0.9, MaterialPuerta.madera));
        casa.paredes[1] = new Pared(Color.amarillo, MaterialPared.adobe);
        casa.paredes[1].ventanas.add(new Ventana(1.5, 1.5, TipoMarco.aluminio, Color.azul));
        casa.paredes[2] = new Pared(Color.amarillo, MaterialPared.adobe);
        casa.paredes[2].ventanas.add(new Ventana(1.5, 1.5, TipoMarco.aluminio, Color.azul));
        casa.paredes[3] = new Pared(Color.amarillo, MaterialPared.adobe);
    }

    @Override
    public void construirTecho() {
        casa.techo = new Techo(MaterialTecho.calamina, Color.azul);
        /*casa.techo.material = MaterialTecho.calamina;
        casa.techo.color = Color.azul;*/
    }

    @Override
    public void construirPiso() {
        casa.piso = new Piso(MaterialPiso.ceramica, Color.verde);
        /*casa.piso.material = MaterialPiso.ceramica;
        casa.piso.color = Color.verde;*/
    }

    @Override
    public void construirGarage() {
        casa.garaje = new Garaje(2,3,2);
    }
    
}
