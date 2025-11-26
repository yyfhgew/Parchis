/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
//la idea es que aqui se organice la logica del juego usando los objetos de las clases que hice
//que este sea el cerebro

/**
 *
 * @author gx160
 */
//la idea es que aqui se organice la logica del juego usando los objetos de las clases que hice
//que este sea el cerebro

public class AreaPartida {

    private String color;
    private Ficha[] fichas;
  private Casillas casillaPartida;

        public AreaPartida(String color, Ficha[] fichas, Casillas casillaPartida) {
            this.color = color;
            this.fichas = fichas;
            this.casillaPartida = casillaPartida;
           
        }

    public Casillas getCasillaPartida() {
        return casillaPartida;
    }

    public void setCasillaPartida(Casillas casillaPartida) {
        this.casillaPartida = casillaPartida;
    }
          
 

    public void setFicha(int indice, Ficha ficha) {
        this.fichas[indice] = ficha;
    }

    public Ficha getFicha(int indice) {
        return this.fichas[indice];
    }

    public int getCantidad() {
        return fichas.length;
    }

    public String getColor() {
        return color;
    }
                
            
}
