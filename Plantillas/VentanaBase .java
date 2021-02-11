import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class VentanaBase extends Frame {

    public VentanaBase () {

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

    }

    public static void main(String args[])
    {
        VentanaBase  ej = new VentanaBase ();
    }

}
