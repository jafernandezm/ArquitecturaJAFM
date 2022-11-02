/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buiderexamen;

import enumerados.Color;
import enumerados.MaterialPuerta;

/**
 *
 * @author ACER
 */
public class Puerta {
    public double alto;
    public double ancho;
    public MaterialPuerta materialPuerta;
    public Color color;

    public Puerta(Double alto, Double ancho, MaterialPuerta materialPuerta) {
        this.alto = alto;
        this.ancho = ancho;
        this.materialPuerta = materialPuerta;
    }

    public Double getAlto() {
        return alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public MaterialPuerta getMaterialPuerta() {
        return materialPuerta;
    }

    public Color getColor() {
        return color;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public void setMaterialPuerta(MaterialPuerta materialPuerta) {
        this.materialPuerta = materialPuerta;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
}
