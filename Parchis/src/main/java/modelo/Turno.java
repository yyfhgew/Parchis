/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
public class Turno {

    private Dado dado;
    private int contadorTurno; 
    private Reglas reglas;

        public Turno(Dado dado, int contadorTurno, Reglas reglas) {
            this.dado = dado;
            this.contadorTurno = contadorTurno;
            this.reglas = reglas;
        }

   
    public int lanzar() {
        int valor = dado.lanzar(); 
        System.out.println("Dado: " + valor);
        return valor;
    }

    
    public void moverFicha(Ficha ficha, int pasos) {
        if (ficha == null) {
            System.out.println("No hay ficha seleccionada.");
            return;
        
        
    }}

   
    public void siguienteTurno() {
        contadorTurno = (contadorTurno + 1) % 2; 
        System.out.println("Turno del jugador " + (contadorTurno + 1));
    }

    
    public int getJugadorActual() {
        return contadorTurno;
    }
}