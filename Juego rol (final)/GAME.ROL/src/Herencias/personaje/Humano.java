/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias.personaje;

import Herencias.arma.Espada;
import java.awt.Graphics;
import Herencias.armadura.Normal;
import Herencias.armadura.Principiante;
import Herencias.poder.Telequinesis;
import javax.swing.ImageIcon;
/**
 *
 * @author Estudiantes
 */
public class Humano extends Principal.Personaje {


    public Humano() {
        arma = new Espada();
        armadura = new Principiante();
        poder = new Telequinesis();
          skinM = new ImageIcon(getClass().getResource("/Imagenes/humano 1.png")).getImage();
        skinF = new ImageIcon(getClass().getResource("/Imagenes/humana 2.png")).getImage();
    }

    @Override
    public void dibujar(int x, int y, Graphics g) {
       arma.dibujar(x, y  , g);
        poder.dibujar(x + 250, y  , g);
        armadura.dibujar(x + 500, y  , g);
        g.drawImage(skinF, x + 320, y + 300, null);
        g.drawImage(skinM, x, y + 250, null);
    }
    
    
}
