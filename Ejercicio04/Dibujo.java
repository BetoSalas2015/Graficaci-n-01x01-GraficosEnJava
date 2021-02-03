import java.awt.*;
import java.awt.geom.*;

public class Dibujo extends Canvas {

    private Punto punto1, punto2;
    
    public Dibujo() {

    }

    public void asignaPuntos(Punto p1, Punto p2) {
        punto1 = p1;
        punto2 = p2;
    }

    public void paint(Graphics g) {
        //  Escriba su código aquí
        g.translate(50, 50);   
        
        g.drawLine(-200, 0, 200, 0);
        g.drawLine(0, -200 , 0, 200);
        if (punto1 != null && punto2 != null) {
            g.setColor(Color.red);
            g.drawLine(punto1.getX(), punto1.getY(), punto2.getX(), punto2.getY());
        }
        
       
    }

}
