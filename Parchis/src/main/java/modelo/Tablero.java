/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
public class Tablero {
    private String [][] casillas;
    private int filas=8;
    private int columnas=8;
            
    
   
    
    public void Tablero(int filas,int columnas){
        casillas=new String[filas][columnas];
    this.filas=filas;
    
    }
    
    
    //para que aparezca al inicio la lleno con 1
    private void inicializar() {
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            casillas[i][j] = "1"; 
    
    
    }
        
    }
    
    
    
    
    
    
    }}
    

