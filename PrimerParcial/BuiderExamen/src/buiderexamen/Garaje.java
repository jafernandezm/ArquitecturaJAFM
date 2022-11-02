/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buiderexamen;

/**
 *
 * @author ACER
 */
public class Garaje {
    double Alto;
    double ancho;
    double largo;

    public Garaje(double Alto, double ancho, double largo) {
        this.Alto = Alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    

    public void setAlto(Double Alto) {
        this.Alto = Alto;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAlto() {
        return Alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public Double getLargo() {
        return largo;
    }
    
    
}
