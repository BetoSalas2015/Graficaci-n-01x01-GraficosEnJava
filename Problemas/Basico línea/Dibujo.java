import java.awt.*;
import java.awt.geom.*;
import java.util.Vector;

public class Dibujo extends Canvas {

    private Vector<Point> puntosGraficar;
    
    public Dibujo() {
        
    }

    public void asignaPuntos(Vector<Point> vectorPuntos) {
        puntosGraficar = vectorPuntos;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = ( Graphics2D ) g;
        int i;
        System.out.println(getHeight());
        //  Escriba su código aquí
        g.translate(250, 200);   
        //  Dibujo lo ejes coordenados
        g.drawLine(-300, 0, 300, 0);
        g.drawLine(0, -200 , 0, 200);
        if (puntosGraficar != null) {
            g.setColor(Color.red);
            for( i = 0; i < puntosGraficar.size() - 1 ; i++) {
                g2d.draw(new Line2D.Float(puntosGraficar.get(i),puntosGraficar.get(i + 1) ));
            }
            g2d.draw(new Line2D.Float(puntosGraficar.get(i),puntosGraficar.get(0) ));
        }
        
       
    }

}
