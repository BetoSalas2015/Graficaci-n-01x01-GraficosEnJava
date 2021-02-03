import javax.security.auth.PrivateCredentialPermission;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ventana extends JFrame {

    Dibujo areaDibujo;
    JPanel panelDatos, panelPunto1, panelPunto2;
    JTextField punto1x, punto1y, punto2x, punto2y;
    JLabel lblPunto1, lblPunto2;
    JButton btnGraficar;

    public Ventana() {
        super("Graficos en Java");
        panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(10,1) );
        panelPunto1 = new JPanel();
        panelPunto1.setLayout(new GridLayout(1,2) );
        panelPunto2 = new JPanel();
        panelPunto2.setLayout(new GridLayout(1,2) );

        lblPunto1 = new JLabel("Punto 1: ");
        lblPunto2 = new JLabel("Punto 2: ");

        punto1x = new JTextField("0");
        punto1y = new JTextField("0");
        punto2x = new JTextField("0");
        punto2y = new JTextField("0");

        areaDibujo = new Dibujo();

        btnGraficar = new JButton("Graficar");

        panelPunto1.add(punto1x); panelPunto1.add(punto1y);
        panelPunto2.add(punto2x); panelPunto2.add(punto2y);

        panelDatos.add(lblPunto1);
        panelDatos.add(panelPunto1);
        panelDatos.add(lblPunto2);
        panelDatos.add(panelPunto2);
        panelDatos.add(btnGraficar);

        add(panelDatos, "West");
        add(areaDibujo, "Center");

        btnGraficar.addActionListener(new BotonGrafica() );


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

            Punto p1 = new Punto(Integer.parseInt(punto1x.getText()),Integer.parseInt( punto1y.getText()));
            Punto p2 = new Punto(Integer.parseInt(punto2x.getText()), Integer.parseInt(punto2y.getText()));
   
            areaDibujo.asignaPuntos(p1, p2);
            areaDibujo.repaint();
        }

    }



    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }
}
