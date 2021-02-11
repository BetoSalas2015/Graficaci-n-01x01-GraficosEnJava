import javax.management.loading.PrivateClassLoader;
import javax.security.auth.PrivateCredentialPermission;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
import java.awt.*;
import java.awt.geom.*;

public class Ventana extends JFrame {

    Dibujo areaDibujo;
    JPanel panelDatos, panelPunto1, panelPunto2;
    JTextField punto1x, punto1y, punto2x, punto2y;
    JLabel lblPunto1, lblPunto2;
    JButton btnGraficar, btnAgregar;
    Vector<Point> vectorPuntos;
    
    public Ventana() {
        super("Graficos en Java");
        panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(10,1) );
        panelPunto1 = new JPanel();
        panelPunto1.setLayout(new GridLayout(1,2) );
        //panelPunto2 = new JPanel();
        //panelPunto2.setLayout(new GridLayout(1,2) );

        lblPunto1 = new JLabel("Punto: ");
        //lblPunto2 = new JLabel("Punto 2: ");

        punto1x = new JTextField("0");
        punto1y = new JTextField("0");
        //punto2x = new JTextField("0");
        //punto2y = new JTextField("0");

        areaDibujo = new Dibujo();

        btnGraficar = new JButton("Graficar");
        btnAgregar = new JButton("Agregar Punto");

        panelPunto1.add(punto1x); panelPunto1.add(punto1y);
        //panelPunto2.add(punto2x); panelPunto2.add(punto2y);

        panelDatos.add(lblPunto1);
        panelDatos.add(panelPunto1);
        //panelDatos.add(lblPunto2);
        //panelDatos.add(panelPunto2);
        panelDatos.add(btnAgregar);
        panelDatos.add(btnGraficar);

        add(panelDatos, "West");
        add(areaDibujo, "Center");

        btnGraficar.addActionListener(new BotonGrafica() );
        btnAgregar.addActionListener(new BotonAgregar() );

        vectorPuntos = new Vector<Point>();

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

    private class BotonGrafica implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            areaDibujo.asignaPuntos(vectorPuntos);
            areaDibujo.repaint();
        }
    }

    private class BotonAgregar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vectorPuntos.add(new Point(Integer.parseInt(punto1x.getText()),Integer.parseInt( punto1y.getText())));
        }

    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }
}
