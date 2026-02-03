import java.util.Scanner;

public class Main {
    public static int mdc(int a, int b){
        if(b==0){
            return a;
        }
        return mdc(b, a%b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int testes = sc.nextInt();
        
        int[] vetor = new int[testes];
        
        while(i<vetor.length && sc.hasNextInt()){
            int aux1 = sc.nextInt();
            int aux2= sc.nextInt();
            vetor[i]= mdc(aux1,aux2);
            i++;
        }
        for(i=0; i<vetor.length;i++){
            System.out.printf("%d\n", vetor[i]);
        }
        sc.close();
        
    }
}
