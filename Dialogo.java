import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
import java.awt.*;
import java.awt.geom.*;

public class Dialogo extends JFrame {

    Dibujo areaDibujo;
    JPanel panelDatos, panelPunto1, panelPunto2;
    JTextField punto1x, punto1y, punto2x, punto2y;
    JLabel lblPunto1, lblPunto2, lblMensaje;
    JButton btnGraficar, btnAgregar;
    Vector<Point> vectorPuntos;
    
    public Dialogo() {
        super("Graficos en Java");
        panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(10,1) );
        panelPunto1 = new JPanel();
        panelPunto1.setLayout(new GridLayout(1,2) );

        lblPunto1 = new JLabel("Punto: ");
        lblMensaje = new JLabel("");


        punto1x = new JTextField("0");
        punto1y = new JTextField("0");


        areaDibujo = new Dibujo();

        btnGraficar = new JButton("Graficar");
        btnAgregar = new JButton("Agregar Punto");

        panelPunto1.add(punto1x); panelPunto1.add(punto1y);


        panelDatos.add(lblPunto1);
        panelDatos.add(panelPunto1);

        panelDatos.add(btnAgregar);
        panelDatos.add(btnGraficar);
        panelDatos.add(lblMensaje);

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
            System.out.println("Error en la entrada");
            lblMensaje.setText("Error en la entrada.");
            JOptionPane.showMessageDialog(null, "Error: te equivoste en la entrada", "Error de datos", 
            JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] args) {
        Dialogo ventana = new Dialogo();
    }
}
