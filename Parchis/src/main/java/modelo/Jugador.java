/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
public class Jugador {
    
     private String nombre;
    private int fichaPosicion; 

    public Jugador(String nombre) {
        this.nombre = nombre;
        fichaPosicion = 0;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public int getFichaPosicion() {
        return fichaPosicion;
    }

    
    public void moverFicha(int pasos) {
        fichaPosicion += pasos;
    }

    
    public void reiniciarFicha() {
        fichaPosicion = 0;
    
}}
