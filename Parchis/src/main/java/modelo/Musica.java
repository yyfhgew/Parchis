/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
/**
 *
 * @author gx160
 */
public class Musica {
private Clip clip;
private boolean reproducir= false;


    public Musica() {
    }
    
    
    
    public void encender(String ubicacion){
    
    try{
        if(!reproducir){
        File file = new File(ubicacion);
        
        
        
        AudioInputStream audioEtrada=AudioSystem.getAudioInputStream( file);
        
        //reproductor
        clip= AudioSystem.getClip();
        
        clip.open(audioEtrada);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        reproducir =true;
        
        
        }else{
        clip.stop();
        clip.close();
        reproducir=false;}
    }
        catch(Exception ex){
                ex.printStackTrace();
        }}
public void OtrasCanciones(){
    
    
    
}}