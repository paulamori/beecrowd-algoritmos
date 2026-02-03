import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       int[] vetor = new int[5];
       int cha, aux=0, i=0;
       
       cha= sc.nextInt();
       
       while(i<vetor.length && sc.hasNextInt()){
           vetor[i]= sc.nextInt();
           i++;
       }
       
       for(i=0;i<vetor.length;i++){
           if(vetor[i]==cha){
               aux+=1;
           }
       }
       System.out.println(aux);
       sc.close();
 
    }
 
}
