/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
public class Casillas {

    private Ficha ficha;       
    private Posicion posicion;  
    private String color;
//casilla tiene ficha,posicion y color
    public Casillas() {
    }

    public Casillas(Ficha ficha, Posicion posicion) {
        this.ficha = ficha;
        this.posicion = posicion;
    }

    public Casillas(Posicion posicion) {
        this.posicion = posicion;
    }

    public boolean estaVacia() {
        return (ficha == null);
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}