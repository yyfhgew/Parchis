/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Controlador;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gx160
 */
public class GUIInicio extends JFrame {
    
    private Controlador controlador;

    public GUIInicio(Controlador controlador) {

        this.controlador=controlador;
        
        setTitle(" Bienvenidos a Parchiland ");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);

        JButton btnColor = new JButton(" Seleccione su color favorito ");
        JButton btnHistoria = new JButton(" a. Historia del juego ");
        JButton btnInstrucciones = new JButton(" b. Instrucciones ");
        JButton btnCreditos = new JButton(" c. Creditos ");
        JButton btnJugar = new JButton(" d. Jugar ");

       
        
        
        panel.add(btnColor);
        panel.add(btnHistoria);
       panel.add(btnInstrucciones);
        panel.add(btnCreditos);
        panel.add(btnJugar);
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        btnColor.addActionListener(e -> controlador.cambiarColor());
        //tengo que hacer laclase y el metodo en el controlador,modelo y modificarlo
        btnHistoria.addActionListener(e -> controlador.presentarHistoria());
        btnInstrucciones.addActionListener(e -> controlador.presentarInstrucciones());
        btnCreditos.addActionListener(e -> controlador.presentarCreditos());
        btnJugar.addActionListener(e->controlador.iniciarJuego());
        
        setVisible(true);

    }
''
}
