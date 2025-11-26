/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gx160
 */
public class Preguntas {

    String textoPregunta;
    boolean respuestaCorrecta;
    int puntaje;

    Preguntas(String texto, boolean respuestaCorrecta, int puntaje) {
        this.textoPregunta = textoPregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntaje = puntaje;
    }

    public Preguntas() {
    }

    public void listaPreguntas() {
        
        Preguntas[] preguntas = new Preguntas[]{
            // Fáciles 1 punto
            new Preguntas("Lina encontró un tablero de Parchís cubierto de polvo en el granero.", true, 1),
            new Preguntas("Las fichas del tablero tenían forma de semillas.", true, 1),
            new Preguntas("El tablero de Parchís de Lina era un tablero normal sin magia.", false, 1),
            new Preguntas("El Árbol Dorado le habló a Lina con voz profunda.", true, 1),
            new Preguntas("Lina estaba aburrida de estar en la ciudad.", true, 1),
            new Preguntas("Al final de la historia, el tablero seguía intacto en el granero.", false, 1),
            // Intermedias 2 puntos
            new Preguntas("Cada camino del tablero representaba una parte del mundo natural.", true, 2),
            new Preguntas("Lina debía responder preguntas del bosque mientras avanzaba.", true, 2),
            new Preguntas("Cada error hacía que Lina ganara más semillas.", false, 2),
            new Preguntas("Las flores cambiaban de color según su estado de ánimo.", true, 2),
            new Preguntas("Lina podía avanzar en el tablero sin resolver acertijos.", false, 2),
            new Preguntas("Al despertar, Lina estaba todavía dentro del mundo mágico del tablero.", false, 2),
            // Difíciles 3 puntos
            new Preguntas("El Árbol Dorado enseñaba a Lina a escuchar la naturaleza.", true, 3),
            new Preguntas("Los ríos que Lina vio no podían cantar ni moverse.", false, 3),
            new Preguntas("Cada respuesta correcta hacía florecer el camino de Lina.", true, 3),
            new Preguntas("Las semillas de las fichas no tenían ningún valor en el juego.", false, 3),
            new Preguntas("La historia muestra que la naturaleza necesita ser escuchada y respetada.", true, 3),
            new Preguntas("Cuando despertó, creció una planta con hojas doradas en el granero.", true, 3)
        };
        
        
    }
}
