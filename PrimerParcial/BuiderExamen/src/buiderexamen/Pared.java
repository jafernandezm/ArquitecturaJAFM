/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buiderexamen;



import enumerados.Color;
import enumerados.MaterialPared;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Pared {
    public Color color;
    public MaterialPared materialPared;
    public ArrayList<Ventana> ventanas;
    ArrayList<Puerta> puertas;

    //public Pared(Color color,MaterialPared materialPared) {
    
    //}

    Pared(Color color, MaterialPared materialPared) {
        this.ventanas =new  ArrayList<Ventana>();
        this.puertas = new ArrayList<Puerta>();
        this.color=color;
        this.materialPared=materialPared; 
    }

    public Color getColor() {
        return color;
    }

    public MaterialPared getMaterialPared() {
        return materialPared;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMaterialPared(MaterialPared materialPared) {
        this.materialPared = materialPared;
    }

    //modificar ////////78///////
    public ArrayList<Ventana> getVentanas() {
        return ventanas;
    }

    public ArrayList<Puerta> getPuertas() {
        return puertas;
    }

    public void setVentanas(ArrayList<Ventana> ventanas) {
        this.ventanas = ventanas;
    }

    public void setPuertas(ArrayList<Puerta> puertas) {
        this.puertas = puertas;
    }
    
    
    
    
    
}
