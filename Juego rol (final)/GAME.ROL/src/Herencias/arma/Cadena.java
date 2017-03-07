/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias.arma;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiantes
 */
public class Cadena extends Principal.Arma {
    public Cadena(){
        imagen =new ImageIcon(getClass().getResource("/Imagenes/cadena 2.png")).getImage();
    }

      @Override
    public void dibujar(int x, int y, Graphics g) {
        g.drawImage(imagen, x, y, null);
    }
}
