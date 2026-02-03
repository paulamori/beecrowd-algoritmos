import java.util.Scanner;


public class  Main{
    public static String calculo(String C, String D){
        int i= C.length()-1, j = D.length()-1, carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0){
            int soma= carry;
            if(i>=0)
                soma+=C.charAt(i--)-'0';
            if(j>=0)
                soma+=D.charAt(j--)-'0';
            sb.append(soma%2);
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        long A, B, resultado;
        String C,D,soma;
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            A= sc.nextLong();
            B= sc.nextLong();
            C= Long.toBinaryString(A);
            D= Long.toBinaryString(B);


            soma=calculo(C,D);
            resultado=Long.parseLong(soma,2);
            System.out.println(resultado);

        }

        sc.close();

    }
}
