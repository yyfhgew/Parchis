/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
public class IniciarJuego {

    private int puntajeJugador1;
    private int puntajeJugador2;
    private int turnoActual; 
    private Tablero tablero;
    private Ficha[] fichas;
    private Turno turno;

    public IniciarJuego() {
    }

    public IniciarJuego( Tablero tablero, Ficha[] ficha, Turno turno) {
        this.tablero = tablero;
        this.fichas = ficha;
        this.turno = turno;
    }

    public void iniciar() {
        
        puntajeJugador1 = 0;
        puntajeJugador2 = 0;
        turnoActual = 0; 

 
      

        System.out.println("¡Juego iniciado!");
    }

}