/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
public class Controles {

    int x;
    int y;

    public Controles() {
    }

    public void Arriba() {
        y = y + 1; //y++
    }

    public void Abajo() {
        y = y - 1;
    }

    public void Izquierda() {
        x = x - 1;
    }

    public void Derecha() {
        x = x + 1;

    }
}
