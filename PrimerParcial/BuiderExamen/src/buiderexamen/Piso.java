/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buiderexamen;

import enumerados.Color;
import enumerados.MaterialPiso;

/**
 *
 * @author ACER
 */
public class Piso {
    MaterialPiso material;
    Color color;

    public Piso(MaterialPiso material, Color color) {
        this.material = material;
        this.color = color;
    }

    public void setMaterial(MaterialPiso material) {
        this.material = material;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public MaterialPiso getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }
    
    
}
