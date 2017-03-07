/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Image;
import logica.Dibujo;

/**
 *
 * @author Estudiantes
 */
public abstract class Personaje implements Dibujo{
    int life;
    String clan;
    protected Poder poder;
    protected Arma arma;
    protected Armadura armadura;
    protected Image skinF, skinM;
}
