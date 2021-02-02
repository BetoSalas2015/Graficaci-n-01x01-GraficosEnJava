import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Ejercicio01 extends Frame {

    public Ejercicio01() {

        addWindowListener( new CW() );
        setSize(400,400);
        setVisible(true);
    }

    private class CW extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
        }
    }

    public void paint(Graphics gc) {
        Color color = new Color(0x28, 0xBA,0x14);
        Graphics2D gc2d = ( Graphics2D ) gc;
        
        Line2D.Float l1 = new Line2D.Float(150,10,130,200);

        gc2d.draw( new Line2D.Float(0,0,230,200) );
        
        gc.setColor(color.red);
        gc2d.draw(l1);

        //gc.translate(200,200);
        /*gc.setColor(color);
        gc.drawString("Saludos Programas!!!!", 100, 100);
        gc.drawLine(0,0, 230, 200);
        
        gc.setColor(color.red);
        gc.fillOval(75,63, 100, 100);*/
    }

    public static void main(String args[])
    {
        Ejercicio01 ej = new Ejercicio01();
    }

}