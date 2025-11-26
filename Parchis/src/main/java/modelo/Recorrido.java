/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
public class Recorrido {

   
    private AreaPartida partidaRojo;
 
    private AreaPartida partidaAzul;

    public Recorrido( AreaPartida partidaRojo, AreaPartida partidaAzul) {
        
        this.partidaRojo = partidaRojo;
      
        this.partidaAzul = partidaAzul;
    }

    Recorrido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public int[][] recorridoRojo() {

        int[][] recorrido = new int[72][2];

        int x = 550;
        int y = 140;

        int index = 0;
        recorrido[index++] = new int[]{x, y};

        // 3 abajo
        for (int i = 0; i < 3; i++) {
            y += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 8 izquierda
        for (int i = 0; i < 8; i++) {
            x -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 2 abajo
        for (int i = 0; i < 2; i++) {
            y += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 7 derecha
        for (int i = 0; i < 7; i++) {
            x += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 8 abajo
        for (int i = 0; i < 8; i++) {
            y += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 2 derecha
        for (int i = 0; i < 2; i++) {
            x += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 7 arriba
        for (int i = 0; i < 7; i++) {
            y -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 8 derecha
        for (int i = 0; i < 8; i++) {
            x += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 2 arriba
        for (int i = 0; i < 2; i++) {
            y -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 7 izquierda
        for (int i = 0; i < 7; i++) {
            x -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 8 arriba
        for (int i = 0; i < 8; i++) {
            y -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 1 izquierda
        x -= 30;
        recorrido[index++] = new int[]{x, y};

        // 8 abajo (meta)
        for (int i = 0; i < 8; i++) {
            y += 30;
            recorrido[index++] = new int[]{x, y};
        }

        return recorrido;
    }

    
    public int[][] recorridoAzul() {

        int[][] recorrido = new int[72][2];

        int x = 800;
        int y = 250;

        int index = 0;
        recorrido[index++] = new int[]{x, y};

        // 3 derecha
        for (int i = 0; i < 3; i++) {
            x += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 8 arriba
        for (int i = 0; i < 8; i++) {
            y -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 2 izquierda
        for (int i = 0; i < 2; i++) {
            x -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 7 abajo
        for (int i = 0; i < 7; i++) {
            y += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 8 izquierda
        for (int i = 0; i < 8; i++) {
            x -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 2 arriba
        for (int i = 0; i < 2; i++) {
            y -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 7 derecha
        for (int i = 0; i < 7; i++) {
            x += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 8 abajo
        for (int i = 0; i < 8; i++) {
            y += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 2 derecha
        for (int i = 0; i < 2; i++) {
            x += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 7 arriba
        for (int i = 0; i < 7; i++) {
            y -= 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 8 derecha
        for (int i = 0; i < 8; i++) {
            x += 30;
            recorrido[index++] = new int[]{x, y};
        }

        // 1 arriba
        y -= 30;
        recorrido[index++] = new int[]{x, y};

        // 8 meta (abajo)
        for (int i = 0; i < 8; i++) {
            y += 30;
            recorrido[index++] = new int[]{x, y};
        }

        return recorrido;
    }
}