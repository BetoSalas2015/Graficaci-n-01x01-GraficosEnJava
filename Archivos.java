import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.*;

public class Archivos extends JFrame{

    private JTextArea editor;
    private BufferedReader entrada;
    private String c, cad1, cad2;
    private StringTokenizer token;
    private Vector<Point> vectorPuntos;

    public Archivos() throws IOException {
        super("Lector de Archivos");
        editor = new JTextArea();
        add(editor,"Center");
        vectorPuntos = new Vector<Point>();

        //  Abrimos el archivo
        try {
            entrada = new BufferedReader(new FileReader("Coordenadas.txt") );

            while( (c = entrada.readLine()) != null ) {
                editor.append(c + '\n');
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
