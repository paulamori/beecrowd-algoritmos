import java.util.Scanner;
import java.util.Locale;

class Main {
    public static void main(String[] args) {
        double x1,x2,y1,y2,subX,subY,powX,powY,resultado;
       Scanner sc = new Scanner(System.in);
       Locale.setDefault(Locale.US);

      x1= sc.nextDouble();
      y1 = sc.nextDouble();
     x2= sc.nextDouble();
     y2=sc.nextDouble();

    subX=x2-x1;
    subY=y2-y1;

   powX=Math.pow(subX,2);
   powY=Math.pow(subY,2);

   resultado = Math.sqrt(powX+powY);

   System.out.printf("%.4f\n", resultado);
   sc.close():
    }
}
