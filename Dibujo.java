import java.awt.*;
import java.awt.geom.*;
import java.util.Vector;

public class Dibujo extends Canvas {

    private Vector<Punto> puntosGraficar;
    
    public Dibujo() {

    }

    public void asignaPuntos(Punto p1, Punto p2) {

    }

    public void asignaPuntos(Vector<Punto> vectorPuntos) {
        puntosGraficar = vectorPuntos;
    }

    public void paint(Graphics g) {
        //  Escriba su código aquí
        g.translate(50, 50);   
        
        g.drawLine(-200, 0, 200, 0);
        g.drawLine(0, -200 , 0, 200);
        if (puntosGraficar != null) {
            g.setColor(Color.red);
            //for( int i = 0; i < 2; i++) {
                g.drawLine(puntosGraficar.get(0).getX(), puntosGraficar.get(0).getY(), 
                           puntosGraficar.get(1).getX(), puntosGraficar.get(1).getY());
            //}
        }
        
       
    }

}
