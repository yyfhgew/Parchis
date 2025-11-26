/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
public class ElegirColor {

    private int azul;
    private int rojo;

    
    public ElegirColor() {
        azul = 0;
        rojo = 0;
    }

    
    public void elegirAzul() {
        azul = 1;
        rojo = 0;
    }

    
    public void elegirRojo() {
        rojo = 1;
        azul = 0;
    }

    
    public boolean esAzul() {
        return azul == 1;
    }

    
    public boolean esRojo() {
        return rojo == 1;
    }

    public void setAzul(int azul) {
        this.azul = azul;
    }

    public void setRojo(int rojo) {
        this.rojo = rojo;
    }

    public int getAzul() {
        return azul;
    }

    public int getRojo() {
        return rojo;
    }
    
}