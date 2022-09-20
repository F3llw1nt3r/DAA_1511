package ordenamientoselection;
import java.util.Scanner;
public class Ordenamientoselection {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arre[] = new int [9];
        int min;
        int aux;
        int temp;
        System.out.println("Introduzca los elementos del arreglo: ");
        for(int i =0; i<9;i++){
        arre[i] = teclado.nextInt();
             }
        for(int i = 0;i<arre.length-1;i++)
         {
            min = arre[i];
            aux = i;
            for(int j = i+1;j<arre.length;j++)
            {
                if(arre[j]<min)
                {
                    min = arre[j];
                    aux = j;
                }
            }
            if(aux != i)
            {
                temp = arre[i];
                arre[i] = arre[aux];
                arre[aux] = temp;
            }
         }
        System.out.println("Los elementos ordenados son: ");
             for(int i = 0;i<arre.length;i++)
             {
                 System.out.print(arre[i]+ "," );
             }
        }
    }
    

