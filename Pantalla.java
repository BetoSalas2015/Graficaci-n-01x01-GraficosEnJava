public class Pantalla {
    
    private int pantalla[][];

    public Pantalla()
    {
        pantalla = new int[28][80];
    }

    public void defineFrontera()
    {
        pantalla[0][18] = 1;        
        pantalla[0][19] = 1;        
        pantalla[0][20] = 1;        
        pantalla[1][17] = 1;        
        pantalla[2][16] = 1;        
        pantalla[3][15] = 1;        
        pantalla[1][21] = 1;        
        pantalla[2][22] = 1;        
    }

    public void dibujaPantalla()
    {
        for (int i = 0; i < pantalla.length; i++) {
            for (int j = 0; j < pantalla[i].length; j++) {
                if (pantalla[i][j] == 1) {
                    System.out.print("1"); //   Pixel Prendido
                    
                } 
                else {
                    System.out.print("_");  //  Pixel apagado
                }
                
            }
            System.out.println("");         //  Siguiente renglon
        }
    }

    public static void main(String[] args) {
        Pantalla p = new Pantalla();
        p.defineFrontera();
        p.dibujaPantalla();
    }

}
