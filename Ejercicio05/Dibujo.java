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
        int i;
        //  Escriba su código aquí
        g.translate(50, 50);   
        //  Dibujo lo ejes coordenados
        g.drawLine(-200, 0, 200, 0);
        g.drawLine(0, -200 , 0, 200);
        if (puntosGraficar != null) {
            g.setColor(Color.red);
            for( i = 0; i < puntosGraficar.size() - 1 ; i++) {
                g.drawLine(puntosGraficar.get(i).getX(), puntosGraficar.get(i).getY(), 
                           puntosGraficar.get(i + 1).getX(), puntosGraficar.get(i + 1).getY());
                //System.out.println(puntosGraficar.get(i).getX()+","+puntosGraficar.get(i).getY()
                                  //  + " a " + puntosGraficar.get(i+1).getX()+","+puntosGraficar.get(i+1).getY());
            }
            g.drawLine(puntosGraficar.get(i).getX(), puntosGraficar.get(i).getY(), 
                           puntosGraficar.get(0).getX(), puntosGraficar.get(0).getY());
        }
        
       
    }

}
