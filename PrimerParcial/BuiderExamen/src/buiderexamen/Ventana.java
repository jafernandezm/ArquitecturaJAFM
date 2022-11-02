/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buiderexamen;

import enumerados.Color;
import enumerados.TipoMarco;

/**
 *
 * @author ACER
 */
class Ventana {
    public double alto;
    public double ancho;
    public TipoMarco marcoTipo;
    public Color color;

    public Ventana(double alto, double ancho, TipoMarco marcoTipo, Color color) {
        this.alto = alto;
        this.ancho = ancho;
        this.marcoTipo = marcoTipo;
        this.color = color;
    }
    
}
