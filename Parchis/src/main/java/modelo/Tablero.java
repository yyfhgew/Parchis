/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author gx160
 */
// 
public class Tablero {
    private Dado dado;
    private Turno turno;
    private Reglas reglas;
    private Recorrido recorrido;
    private HiloCronometro cronometro;
    private Jugador jugador1;
    private Jugador jugador2;
    private Puntajes puntajeJugador1;
    private Puntajes puntajeJugador2;
    private Ficha[] fichasJugador1;
    private Ficha[] fichasJugador2;
    private Casillas[] casillas;
    private AreaPartida areaRojo;
    private AreaPartida areaAzul;

    public Tablero() {
    }

    public Tablero(Jugador jugador1, Jugador jugador2) {
        
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;

      
        this.dado = new Dado();
        this.reglas = new Reglas(dado, null);
        this.turno = new Turno(dado, 0, reglas);
        this.puntajeJugador1 = new Puntajes();
        this.puntajeJugador2 = new Puntajes();

        this.fichasJugador1 = new Ficha[4];
        this.fichasJugador2 = new Ficha[4];

        for (int i = 0; i < 4; i++) {
            fichasJugador1[i] = new Ficha();
            fichasJugador2[i] = new Ficha();
        }

     
        this.recorrido = new Recorrido( );
        reglas = new Reglas(dado, recorrido);

        //  casillas
        casillas = new Casillas[72];
        int[][] coordsRojo = recorrido.recorridoRojo();
        int[][] coordsAzul = recorrido.recorridoAzul();
        
        for (int i = 0; i < 36; i++) {
            casillas[i] = new Casillas(new Posicion(coordsRojo[i][0], coordsRojo[i][1]));
            casillas[i + 36] = new Casillas(new Posicion(coordsAzul[i][0], coordsAzul[i][1]));
        }

        //  áreas de partida
        areaRojo = new AreaPartida("Rojo", fichasJugador1, casillas[0]);
        areaAzul = new AreaPartida("Azul", fichasJugador2, casillas[36]);
    }

 

    public Reglas.ResultadoTurno moverFichaJugador(Ficha ficha) {
        // Obtener fichas 
        Ficha[] enemigas = obtenerFichasEnemigas(ficha);
        String color = fichaColor(ficha);

        //  turno según reglas
        Reglas.ResultadoTurno resultado = reglas.procesarTurno(ficha, enemigas, color);

     // si come ficha
        if (resultado.comio) {
            if (fichaPerteneceA(ficha, fichasJugador1)) puntajeJugador1.sumarAcierto();
            else puntajeJugador2.sumarAcierto();
        }

        return resultado;
    }

    private Ficha[] obtenerFichasEnemigas(Ficha ficha) {
        if (fichaPerteneceA(ficha, fichasJugador1)) return fichasJugador2;
        else return fichasJugador1;
    }

    private boolean fichaPerteneceA(Ficha ficha, Ficha[] fichas) {
        for (Ficha f : fichas) if (f == ficha) return true;
        return false;
    }

    private String fichaColor(Ficha ficha) {
        if (fichaPerteneceA(ficha, fichasJugador1)) return "Rojo";
        else return "Azul";
    }

  
    public void siguienteTurno() {
        turno.siguienteTurno();
    }

    public int getJugadorActual() {
        return turno.getJugadorActual();
    }

 
    public Jugador verificarGanador() {
        for (Ficha f : fichasJugador1) if (f.getIndiceCasilla() == 71) return jugador1;
        for (Ficha f : fichasJugador2) if (f.getIndiceCasilla() == 71) return jugador2;
        return null;
    }

    public boolean gameOverJugador1() {
        return puntajeJugador1.esGameOver();
    }

    public boolean gameOverJugador2() {
        return puntajeJugador2.esGameOver();
    }


    public Ficha[] getFichasJugador1() { return fichasJugador1; }
    public Ficha[] getFichasJugador2() { return fichasJugador2; }
    public Casillas[] getCasillas() { return casillas; }
    public Jugador getJugador1() { return jugador1; }
    public Jugador getJugador2() { return jugador2; }
    public Puntajes getPuntajeJugador1() { return puntajeJugador1; }
    public Puntajes getPuntajeJugador2() { return puntajeJugador2; }
}
