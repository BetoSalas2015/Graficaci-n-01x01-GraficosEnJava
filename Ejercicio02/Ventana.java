import javax.swing.*;


import java.awt.event.*;
import java.awt.*;

public class Ventana extends JFrame {

    Dibujo dibujo, dibujo2;

    public Ventana() {
        super("Graficos en Java");
        dibujo = new Dibujo();
        dibujo2 = new Dibujo();

        setLayout(new GridLayout( 2, 1) );
        add(dibujo);
        add(dibujo2);

        addWindowListener( new CW() );

        setSize(400, 400);
        setVisible(true);
    }
    
    private class CW extends WindowAdapter
    {
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
        }
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }
}
