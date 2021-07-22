
package BarSuperior;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Created by: Geovanny Zambrano <z1705@outlook.com>
 * 
 * Date: 15 jul. 2021
 *
 */
public class BarSuperior extends JPanel {
    
    private int X;
    private int Y;
    
    private JFrame ventana;
    
    
    public BarSuperior(JFrame ventana){        
        this.ventana = ventana;
        super.setLocation(0, 0);
        agregarEventos();
    }

    @Override
    public void setSize(int withg,int heith){
        super.setSize(ventana.getWidth(), heith);
    }
    
    
    
    //Extrae la posicion del mouse cuando es das click
    private void MousePressed(MouseEvent e) {
        X = e.getX();
        Y = e.getY();
    }
    
    //Movera la ventana cuando arrastre el mouse
    private void MouseDragged(MouseEvent e) {
      int x = e.getXOnScreen();
      int y = e.getYOnScreen();
        ventana.setLocation(x - X, y - Y); 
    }

    //Accion a realizar cuando deja de precionar el mouse
    //Si el panel de arrastrado se oculta, automaticamente se repocicionara en zona visible, solo para la parte superior
    private void MouseReleased(MouseEvent e) {
      int nx = ventana.getX();
      int ny = ventana.getY();
      if (ny < 0)  ventana.setLocation(nx, 0); 
    }
    
    private void agregarEventos(){
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
              MousePressed(e);
            }
            public void mouseReleased(MouseEvent e){
                MouseReleased(e);
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                MouseDragged(e);
          }
        });
    }
    
}
