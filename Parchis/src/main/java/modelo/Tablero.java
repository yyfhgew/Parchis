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
            

    public Tablero() {
        
        casillas = new String[][] {
            {"1","1","1","0","0","1","1","1"},
            {"1","1","1","0","0","1","1","1"},
            {"1","1","1","0","0","1","1","1"},
            {"0","0","0","0","0","0","0","0"},
            {"0","0","0","0","0","0","0","0"},
            {"1","1","1","0","0","1","1","1"},
            {"1","1","1","0","0","1","1","1"},
            {"1","1","1","0","0","1","1","1"}
        };
    }

    
  public String[][] getCasillas() {
        return casillas;
        }
    }
 
    
    
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    

