/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Amaya
 */
public class PnlFondoo extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
       Dimension tamanio = getSize();
       ImageIcon imagenFondo= new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg")).getImage());
       g.drawImage(imagenFondo.getImage(),0,0, tamanio.width, tamanio.height,null);
       setOpaque(false);
       
       super.paintComponent(g);
    }
}
