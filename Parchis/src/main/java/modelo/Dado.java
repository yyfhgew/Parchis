/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Random;

/**
 *
 * @author gx160
 */
public class Dado {

    private int valor;  
    private Random random;
   
    
    public Dado() {
        random = new Random();
        valor = 1;
    }

    
    public void lanzarDado() {
        valor = random.nextInt(6) + 1;
    }

    
    public int getValor() {
        return valor;
    }
        
    }
    
