/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias.personaje;

import Herencias.arma.Guadana;
import Herencias.armadura.Normal;
import Herencias.poder.Elementos;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Orco extends Principal.Personaje {
    int strenght;
    public Orco(){
        arma = new Guadana();
        poder = new Elementos();
        armadura = new Normal();
          skinM = new ImageIcon(getClass().getResource("/Imagenes/orco.png")).getImage();
        skinF = new ImageIcon(getClass().getResource("/Imagenes/orca.png")).getImage();
    }

    @Override
    public void dibujar(int x, int y, Graphics g) {
        arma.dibujar(x, y, g);
        poder.dibujar(x + 250, y , g);
        armadura.dibujar(x + 500, y, g);
         g.drawImage(skinF, x + 300, y + 250, null);
        g.drawImage(skinM, x , y + 250, null);
    }
}
