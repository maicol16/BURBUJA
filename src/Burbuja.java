import java.util.Scanner;

public class Burbuja {
    
    public static void main(String[] args) {
       
       
      Scanner ingreso = new Scanner(System.in);
      int i, j, aux;
        int LIMITE= 0;
      int a[] = new int[LIMITE];
      
     
      for(i = 0; i < LIMITE; i++){
        System.out.print("Ingresa un numero: ");
        a[LIMITE] = ingreso.nextInt();       
      }
     
      for(i = 1; i < LIMITE; i++){
        for(j = 0; j < LIMITE - 1; j++){
          if(a[j] > a[j + 1]){
            aux = a[j];
            a[j] = a[j + 1];
            a[j + 1] = aux;
            
          } 
        }
      }
      System.out.printf( "%d,%d,%d\n", a[LIMITE]);
    }
}

