/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */

   public class Puntajes {

    private int puntaje;

    public Puntajes() {
        puntaje = 5;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void sumarAcierto() {
        puntaje += 2;
    }

    public void restarFallo() {
        puntaje -= 3;
        if (puntaje < 0) puntaje = 0;
    }

    public boolean esGameOver() {
        return puntaje <= 0;
    }
}
