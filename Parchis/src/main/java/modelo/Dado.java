/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Random;
import javax.swing.JOptionPane;

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

    
    public int lanzar() {
        valor = random.nextInt(6) + 1;
        return valor;
    }

    
    public int getValor() {
        return valor;
  }
     
    
    public void mostrarValor(){
        
        JOptionPane.showMessageDialog(null,"salio el "+valor); 
    
    
}}