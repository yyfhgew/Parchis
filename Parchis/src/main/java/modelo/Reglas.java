/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;
import modelo.Dado;
import modelo.Ficha;
import modelo.Posicion;

/**
 *
 * @author gx160
 */
 


 public class Reglas{

private Dado dado;
private Recorrido recorrido;
 private int[] seguras = {0, 8, 13, 21, 26, 34, 39, 47};

    public Reglas(Dado dado, Recorrido recorrido) {
        this.dado = dado;
        this.recorrido = recorrido;
    }
     
    
    
    public void mostrarReglas(){
        
        
    JOptionPane.showMessageDialog(null, "1. Tirar y mover\n" +
"\n" +
"Cada turno tirás el dado.\n" +
"\n" +
"Avanzás la ficha la cantidad de casillas que indica el dado.\n" +
"\n" +
" 2. Sacar ficha\n" +
"\n" +
"Para sacar una ficha desde la casa, necesitás un 5."+"\n" + 
"3. Comer fichas\n" +
"\n" +
"Si caés en una casilla donde hay una ficha de otro jugador:\n" +
"\n" +
"La comés\n" +
"\n" +
"Esa ficha vuelve a su casa\n" +
"\n" +
"Y vos avanzás 20 casillas extra\n" +
"\n" +
" 4. Casillas seguras\n" +
"\n" +
"Las casillas marcadas (generalmente con un círculo o color especial) son seguras.\n" +
"\n" +
"En una casilla segura no se puede comer ficha.\n" +
"\n" +
"5. Puentes\n" +
"\n" +
"Si dos fichas del mismo color están juntas en la misma casilla, forman un puente.\n" +
"\n" +
"El puente bloquea el paso a todos los demás.\n" +
"\n" +
"Para romper el puente, el mismo jugador debe mover una de sus fichas.\n" +
"\n" +
"✅ 6. Llegar a la meta\n" +
"\n" +
"Para entrar al pasillo final del color, debes dar una vuelta completa al tablero.\n" +
"\n" +
"Para entrar exactamente a la casilla final, se debe sacar el número exacto.\n" +
"\n" +
" 7. Turnos extra\n" +
"\n" +
"Si sacás un 6, obtenés otro turno.\n" +
"\n" +
"Pero si sacás tres 6 seguidos, la ficha que moviste vuelve a la salida");
    
}
    
    public ResultadoTurno procesarTurno(Ficha ficha, Ficha[] fichasEnemigas, String color) {

        ResultadoTurno resultado = new ResultadoTurno();
         int contadorSeis=0;
        int tiro = dado.lanzar();
        resultado.tiro = tiro;

       
        //  Tres 6 seguidos
        
        if (tiro == 6) {
            contadorSeis++;
            if (contadorSeis == 3) {
                // vuelve a la casa
                ficha.setIndiceCasilla(-1); 
                contadorSeis = 0;
                resultado.evento = "Tres 6 seguidos: Ficha regresa a casa";
                return resultado;
            }
        } else {
            contadorSeis = 0;
        }

       
        //  Sacar ficha
       
        if (ficha.getIndiceCasilla() == -1) {
            if (tiro == 5) {
                ficha.setIndiceCasilla(0); 
                resultado.nuevaCasilla = 0;
                resultado.evento = "Ficha salió con 5";
                return resultado;
            } else {
                resultado.evento = "No salió (se necesita 5)";
                return resultado;
            }
        }

       
        int actual = ficha.getIndiceCasilla();
        int destino = actual + tiro;

        // Máximo 71 
        if (destino > 71) {
            resultado.evento = "No puede entrar a meta sin número exacto";
            return resultado;
        }

        ficha.setIndiceCasilla(destino);
        resultado.nuevaCasilla = destino;

     
        // si come ficha
     
        if (!esSegura(destino)) {
            for (Ficha f : fichasEnemigas) {
                if (f.getIndiceCasilla() == destino) {

                    f.setIndiceCasilla(-1); // devuelta a casa
                    resultado.evento = "Comió ficha enemiga";
                    resultado.comio = true;

                    // Avanza +20
                    int extra = destino + 20;
                    if (extra <= 71) {
                        ficha.setIndiceCasilla(extra);
                        resultado.nuevaCasilla = extra;
                        resultado.evento += " y avanzó 20 más";
                    }

                    break;
                }
            }
        }

        
        // 4. Turno extra por sacar 6
        
        if (tiro == 6) {
            resultado.turnoExtra = true;
        }

        if (resultado.evento.equals("")) {
            resultado.evento = "Movimiento normal";
        }

        return resultado;
    }

   

    private boolean esSegura(int casilla) {
        for (int s : seguras) {
            if (s == casilla) return true;
        }
        return false;
    }

   
    public static class ResultadoTurno {
        public int tiro;
        public int nuevaCasilla = -1;
        public boolean turnoExtra = false;
        public boolean comio = false;
        public String evento = "";
    }
}

      