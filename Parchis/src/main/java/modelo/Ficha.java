/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.text.Position;
import modelo.Posicion;

/**
 *
 * @author gx160
 */
public class Ficha{
  
   private Posicion posicion;
      
   
     

    public Ficha() {
        
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    
    public Ficha(Posicion posicion) {
        this.posicion=posicion;
        
    }
    
     public Ficha(Posicion posicion, ImageIcon imagen) {
        this.posicion=posicion;
      
     }
    
    
 private int indiceCasilla = -1; 

public int getIndiceCasilla() {
    return indiceCasilla;
}

public void setIndiceCasilla(int indice) {
    this.indiceCasilla = indice;
}
    public void posicion() {
        this.posicion = posicion;
    }
    
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPasicionesJuadores (Posicion posicion) {
        this.posicion = posicion;
    }


  
    
    
    }


   
    

