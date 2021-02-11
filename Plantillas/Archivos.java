import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.*;

public class Archivos extends JFrame{

    private Dibujo dibujo;
    private BufferedReader entrada;
    private String c, cad1, cad2;
    private StringTokenizer token;
    private Vector<Point> vectorPuntos;

    public Archivos() throws IOException {
        super("Lector de Archivos");
        dibujo = new Dibujo();
        add(dibujo,"Center");
        vectorPuntos = new Vector<Point>();

        //  Abrimos el archivo
        try {
            entrada = new BufferedReader(new FileReader("Coordenadas.txt") );

            while( (c = entrada.readLine()) != null ) {
                token = new StringTokenizer(c , ",");
                cad1 = token.nextToken();
                cad2 = token.nextToken();

                vectorPuntos.add(new Point(Integer.parseInt(cad1), Integer.parseInt(cad2)));
            }

        } catch (IOException e) {
            System.out.println( "Archivo no encontrado" );
        } finally {
            if(entrada != null)
                entrada.close();
        }
        
        dibujo.asignaPuntos(vectorPuntos);

        addWindowListener(new CW() );

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

        try {
            Archivos archivos = new Archivos();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
