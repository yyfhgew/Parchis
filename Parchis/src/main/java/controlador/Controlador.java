/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Controles;
import modelo.Creditos;
import modelo.Dado;
import modelo.Historia;
import modelo.Jugador;
import modelo.Jugar;
import modelo.Preguntas;
import modelo.Puntajes;
import modelo.Reglas;
import modelo.Tablero;
import vista.GUIGameOver;
import vista.GUIInicioo;
import vista.GUITableroo;
import vista.GUIWin;


/**
 *
 * @author gx160
 */
public class Controlador implements ActionListener{
    private GUIInicioo gUIInicioo ;
    private GUITableroo gUITableroo;
    private GUIGameOver gUIGameOver;
    private GUIWin gUIWin;
    private Controles controles;
 private Color color;
 private Creditos creditos;
 private Dado dado;
 private Historia historia;
 private Jugador jugador;
 private Preguntas preguntas;
 private Puntajes puntajes;
 private Reglas reglas;
 private Tablero tablero;
 private Jugar jugar; 
 
    public Controlador(GUIInicioo gUIInicioo) {
        this.gUIInicioo = gUIInicioo;
        this.gUITableroo=gUITableroo;
        this.gUIGameOver=gUIGameOver;
        this.gUIWin=gUIWin;
        this.color=color;
        this.creditos=creditos;
        this.dado=dado;
        this.historia=historia;
        this.tablero=tablero;
        this.reglas=reglas;
        this.jugador=jugador;
        this.preguntas=preguntas;
        this.puntajes=puntajes;
        this.tablero=tablero;
        this.controles=controles;
        
        gUIInicioo.btnHistoria.addActionListener(this);
         gUIInicioo.btnColor.addActionListener(this);
         gUIInicioo.btnJugar.addActionListener(this);
         gUIInicioo.btnCreditos.addActionListener(this);
         gUITableroo.btnArriba.addActionListener(this);
         gUITableroo.btnAbajo.addActionListener(this);
         gUITableroo.btnIzquierda.addActionListener(this);
          gUITableroo.btnDerecha.addActionListener(this);
    }
    
  
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
   
        if (e.getSource() == gUIInicioo.btnColor) {
            color.cambiarColor;
        }
         else if (e.getSource() ==  gUIInicioo.btnHistoria) {
            historia.mostrarHistoria();
            }
         else if (e.getSource() ==  gUIInicioo.btnCreditos) {
            creditos.mostrarCreditos();
            }
          else if (e.getSource() == gUITableroo.btnAbajo) {
            controles.Abajo();
        } else if (e.getSource() == gUITableroo.btnArriba) {
            controles.Arriba();
        }else if (e.getSource() == gUITableroo.btnIzquierda) {
            controles.Izquierda();
        }else if (e.getSource() == gUITableroo.btnDerecha) {
            controles.Derecha();
        }else if (e.getSource() == gUITableroo.btnLanzarDado) {
            dado.lanzarDado();
        
        }
    }
    }
     
     
             
     

