/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */

public class CasillaEspecial extends Casillas {

    private String tipoCasilla; 

    
    public CasillaEspecial(String tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }

    public CasillaEspecial(String tipoCasilla, Posicion posicion) {
        super(posicion);
        this.tipoCasilla = tipoCasilla;
    }

    
    public CasillaEspecial(String tipoCasilla, Ficha ficha, Posicion posicion) {
        super(ficha, posicion);
        this.tipoCasilla = tipoCasilla;
    }

    public String getTipoCasilla() {
        return tipoCasilla;
    }

    public void setTipoCasilla(String tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }
}

