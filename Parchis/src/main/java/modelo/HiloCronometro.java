/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import javax.swing.SwingUtilities;
import vista.GUITableroo;
       

/**
 *
 * @author gx160
 */

   public class HiloCronometro extends Thread {
    private boolean corriendo = true;
    private int segundos = 0;
    private GUITableroo gUITableroo; 

    public HiloCronometro(GUITableroo gUITableroo) {
        this.gUITableroo = gUITableroo;
    }

    public void detener() {
        this.corriendo = false;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public void run() {
        while (corriendo) {
            try {
                Thread.sleep(1000); // espera 1 segundo
                segundos++;

          
                SwingUtilities.invokeLater(() -> {
                    gUITableroo.lblCronometro.setText(
                        String.format("%02d:%02d", segundos / 60, segundos % 60)
                    );
                });

            } catch (InterruptedException ex) {
                System.out.println("Hilo cronómetro interrumpido");
            }
        }
    }
}