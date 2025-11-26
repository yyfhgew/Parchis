/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parchis;

import controlador.Controlador;
import vista.GUIConfiguraciones;
import vista.GUIGameOver;
import vista.GUIInicioo;
import vista.GUITableroo;
import vista.GUIWinn;
import controlador.Controlador;
import modelo.*;
import modelo.Tablero;
/**
 *
 * @author gx160
 */




public class Parchis {

    public static void main(String[] args) {

       
        GUIInicioo guiInicio = new GUIInicioo();
        GUITableroo guiTablero = new GUITableroo();
        GUIGameOver guiGameOver = new GUIGameOver();
        GUIWinn guiWinn = new GUIWinn();
        GUIConfiguraciones guiConfig = new GUIConfiguraciones();
  Preguntas pregunta =new Preguntas();
        Dado dado = new Dado();
        Recorrido recorrido = new Recorrido(
                
                new AreaPartida("Rojo", new Ficha[4], new Casillas()),
                
                new AreaPartida("Azul", new Ficha[4], new Casillas())
        );
        Reglas reglas = new Reglas(dado, recorrido);
        Turno turno = new Turno(dado, 0, reglas);
        Puntajes puntajes = new Puntajes();
        Ficha ficha = new Ficha();
        Casillas[] casillas = new Casillas[72]; 
        Jugador jugador = new Jugador("Jugador");
        Tablero tablero=new Tablero();
        Controles controles = new Controles();
        Creditos creditos = new Creditos();
        Historia historia = new Historia();
        IniciarJuego iniciarJuego = new IniciarJuego();
        Musica musica = new Musica();
       
        pregunta = new Preguntas();

    
        Controlador controlador = new Controlador(
                guiInicio, guiTablero, guiGameOver, guiWinn, guiConfig,
                controles, creditos, dado, historia,
                jugador, pregunta, puntajes, reglas,
               tablero, musica, iniciarJuego, turno, ficha
        );

      
        guiInicio.setVisible(true);
    }
}
