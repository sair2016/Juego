/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Herencias.personaje.Elfo;
import Herencias.personaje.Humano;
import Herencias.personaje.Orco;
import Principal.Personaje;
import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author sair
 */
public class Lienzo extends Canvas {


    Personaje personaje;

    public Lienzo() {
  
    }
    
    public void getpersonaje (String c) 
    {
        switch (c) {
            case "Humano" : personaje = new Humano();
            break;
            case "Orco" : personaje = new Orco();
            break;
            case "Elfo" : personaje = new Elfo();
            break;
        }
    }

    @Override
    public void paint(Graphics g) {
      super.paint(g); //To change body of generated methods, choose Tools | Templates.
    personaje.dibujar(10, 10, g);
    }
}
