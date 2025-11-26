/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Controles;
import modelo.Creditos;
import modelo.Dado;
import modelo.Ficha;
import modelo.Historia;
import modelo.IniciarJuego;
import modelo.Jugador;
import modelo.Musica;
import modelo.Preguntas;
import modelo.Puntajes;
import modelo.Reglas;
import modelo.Tablero;
import modelo.Turno;
import vista.GUIGameOver;
import vista.GUIInicioo;
import vista.GUITableroo;
import vista.GUIWinn;
import vista.GUIConfiguraciones;

/**
 *
 * @author gx160
 */

public class Controlador implements ActionListener {

    private GUIInicioo gUIInicioo;
    private GUITableroo gUITableroo;
    private GUIGameOver gUIGameOver;
    private GUIWinn gUIWinn;
    private GUIConfiguraciones gUIConfiguraciones;
    private Controles controles;
    private Creditos creditos;
    private Dado dado;
    private Historia historia;
    private Jugador jugador;
    private Preguntas preguntas;
    private Puntajes puntajes;
    private Reglas reglas;
    private Tablero tablero;
    private Musica musica;
    private IniciarJuego iniciarJuego;
    private Turno turno;
    private Ficha ficha;
    

    public Controlador(GUIInicioo gUIInicioo, GUITableroo gUITableroo, GUIGameOver gUIGameOver, GUIWinn gUIWinn, GUIConfiguraciones gUIConfiguraciones,
                       Controles controles, Creditos creditos, Dado dado, Historia historia,
                       Jugador jugador, Preguntas preguntas, Puntajes puntajes, Reglas reglas,
                       Tablero tableroo, Musica musica,
                       IniciarJuego iniciarJuego, Turno turno, Ficha ficha
                       ) {

        this.gUIInicioo = gUIInicioo;
        this.gUITableroo = gUITableroo;
        this.gUIGameOver = gUIGameOver;
        this.gUIWinn = gUIWinn;
        this.gUIConfiguraciones = gUIConfiguraciones;
        this.controles = controles;
        this.creditos = creditos;
        this.dado = dado;
        this.historia = historia;
        this.jugador = jugador;
        this.preguntas = preguntas;
        this.puntajes = puntajes;
        this.reglas = reglas;
        this.tablero = tableroo;
        this.musica = musica;
        this.iniciarJuego = iniciarJuego;
        this.turno = turno;
        this.ficha = ficha;
       
gUIInicioo.btnHistoria.addActionListener(this);
        gUIInicioo.btnJugar.addActionListener(this);
        gUIInicioo.btnCreditos.addActionListener(this);
        gUITableroo.btnArriba.addActionListener(this);
        gUITableroo.btnAbajo.addActionListener(this);
        gUITableroo.btnIzquierda.addActionListener(this);
        gUITableroo.btnDerecha.addActionListener(this);
        gUITableroo.btnLanzarDado.addActionListener(this);
        gUIConfiguraciones.btnIniciar.addActionListener(this);
        gUIConfiguraciones.btnJugador1.addActionListener(this);
        gUIConfiguraciones.btnJugador2.addActionListener(this);
        gUIConfiguraciones.btnSonido.addActionListener(this);
        gUIWinn.btnReiniciar.addActionListener(this);
        gUIGameOver.btnReiniciar.addActionListener(this);
    }

    // Método para habilitar o deshabilitar controles del tablero
    private void habilitarControles(boolean estado) {
        gUITableroo.btnArriba.setEnabled(estado);
        gUITableroo.btnAbajo.setEnabled(estado);
        gUITableroo.btnIzquierda.setEnabled(estado);
        gUITableroo.btnDerecha.setEnabled(estado);
        gUITableroo.btnLanzarDado.setEnabled(estado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        
        // Inicio
        
        if (e.getSource() == gUIInicioo.btnHistoria) {
            historia.mostrarHistoria();

        } else if (e.getSource() == gUIInicioo.btnCreditos) {
            creditos.mostrarCreditos();

        } else if (e.getSource() == gUIInicioo.btnJugar) {
            gUIInicioo.setVisible(false);
            gUIConfiguraciones.setVisible(true); 

        } else if (e.getSource() == gUIConfiguraciones.btnIniciar) {
            gUIConfiguraciones.setVisible(false);
            gUITableroo.setVisible(true);
            iniciarJuego.iniciar();

        } else if (e.getSource() == gUIConfiguraciones.btnSonido) {
            musica.encender("direccion-del-archivo.wav");
        }

        
        // Tablero
        
        else if (e.getSource() == gUITableroo.btnArriba) {
            controles.Arriba();

        } else if (e.getSource() == gUITableroo.btnAbajo) {
            controles.Abajo();

        } else if (e.getSource() == gUITableroo.btnIzquierda) {
            controles.Izquierda();

        } else if (e.getSource() == gUITableroo.btnDerecha) {
            controles.Derecha();

        } else if (e.getSource() == gUITableroo.btnLanzarDado) {
            int resultadoDado = dado.lanzar();
            System.out.println("Dado: " + resultadoDado);

        }
        
        // Reinicio
        
        else if (e.getSource() == gUIWinn.btnReiniciar) {
            gUIWinn.setVisible(false);
            gUITableroo.setVisible(true);
            iniciarJuego.iniciar();

        } else if (e.getSource() == gUIGameOver.btnReiniciar) {
            gUIGameOver.setVisible(false);
            gUITableroo.setVisible(true);
            iniciarJuego.iniciar();
        }
    }
}








