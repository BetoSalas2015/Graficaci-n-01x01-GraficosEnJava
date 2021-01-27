import java.awt.*;
import java.awt.event.*;

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
        gc.setColor(color);
        gc.drawString("Saludos Programas!!!!", 100, 100);
        gc.drawLine(150,90, 230, 200);
    }

    public static void main(String args[])
    {
        Ejercicio01 ej = new Ejercicio01();
    }

}