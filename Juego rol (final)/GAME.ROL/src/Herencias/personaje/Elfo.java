/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias.personaje;


import Herencias.arma.Cadena;
import Herencias.arma.Latigo;
import Herencias.armadura.Magica;
import Herencias.poder.Magia;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiantes
 */
public class Elfo extends Principal.Personaje {
    String magic;
    public Elfo( ){
        poder = new Magia();
        arma = new Cadena();
        armadura = new Magica();
        skinM = new ImageIcon(getClass().getResource("/Imagenes/elfo 2.png")).getImage();
        skinF = new ImageIcon(getClass().getResource("/Imagenes/elfa.png")).getImage();
    }
    @Override
    public void dibujar(int x, int y, Graphics g) {
        arma.dibujar(x, y , g);
        poder.dibujar(x + 250, y  , g);
        armadura.dibujar(x + 500, y  , g);
        g.drawImage(skinM, x  , y +300, null);
        g.drawImage(skinF, x + 330, y + 250, null);
        
    }
    
    
}
