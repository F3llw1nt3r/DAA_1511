package habitantes;
import java.util.Scanner;
public class Habitantes {
public static void main(String[] args) 
{
     Scanner teclado = new Scanner(System.in);
     int A1,B1,C1,D1;
     int A2,B2,C2,D2;
     int A3,B3,C3,D3;
     int A4,B4,C4,D4;
     int A5,B5,C5,D5;
     int A6,B6,C6,D6;
     System.out.println("Habitantes de un edificio\n");
     System.out.println("Por favor ingrese el número de habitantes de cada puerta en los 6 pisos\n");
     System.out.println("Considere que cada piso tiene 4 puertas, númeradas An-Dn,donde n es el piso");
     System.out.println("Ingrese el número de habitantes de la puerta A1: \n");
     A1 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta B1: \n");
     B1 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta C1: \n");
     C1 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta D1: \n");
     D1 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta A2: \n");
     A2 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta B2: \n");
     B2 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta C2: \n");
     C2 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta D2: \n");
     D2 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta A3: \n");
     A3 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta B3: \n");
     B3 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta C3: \n");
     C3 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta D3: \n");
     D3 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta A4: \n");
     A4 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta B4: \n");
     B4 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta C4: \n");
     C4 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta D4: \n");
     D4 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta A5: \n");
     A5 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta B5: \n");
     B5 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta C5: \n");
     C5 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta D5: \n");
     D5 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta A6: \n");
     A6 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta B6: \n");
     B6 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta C6: \n");
     C6 = teclado.nextInt(); 
     System.out.println("Ingrese el número de habitantes de la puerta D6: \n");
     D6 = teclado.nextInt(); 
     if(A1>B1&&A1>C1&&A1>D1&&A1>A2&&A1>B2&&A1>C2&&A1>D2&&A1>A3&&A1>B3&&A1>C3&&A1>D3&&A1>
       A4&&A1>B4&&A1>C4&&A1>D4&&A1>A5&&A1>B5&&A1>C5&&A1>D5&&A1>A6&&A1>B6&&A1>C6&&A1>D6)
     {
         System.out.println("La puerta con más pisos es la A1, en el primer piso\n"
      +"con "+A1+ " habitantes");   
     }
     if(B1>A1&&B1==B1&&B1>C1&&B1>D1&&B1>A2&&B1>B2&&B1>C2&&B1>D2&&B1>A3&&B1>B3&&B1>C3&&B1>D3&&B1>
       A4&&B1>B4&&B1>C4&&B1>D4&&B1>A5&&B1>B5&&B1>C5&&B1>D5&&B1>A6&&B1>B6&&B1>C6&&B1>D6)
     {
         System.out.println("La puerta con más pisos es la B1, en el primer piso\n"
      +"con "+B1+ " habitantes");   
     }
     if(C1>A1&&C1>B1&&C1==C1&&C1>D1&&C1>A2&&C1>B2&&C1>C2&&C1>D2&&C1>A3&&C1>B3&&C1>C3&&C1>D3&&C1>
       A4&&C1>B4&&C1>C4&&C1>D4&&C1>A5&&C1>B5&&C1>C5&&C1>D5&&C1>A6&&C1>B6&&C1>C6&&C1>D6)
     {
         System.out.println("La puerta con más pisos es la C1, en el primer piso\n"
      +"con "+C1+ " habitantes");   
     } 
     if(D1>A1&&D1>B1&&D1>C1&&D1==D1&&D1>A2&&D1>B2&&D1>C2&&D1>D2&&D1>A3&&D1>B3&&D1>C3&&D1>D3&&D1>
       A4&&D1>B4&&D1>C4&&D1>D4&&D1>A5&&D1>B5&&D1>C5&&D1>D5&&D1>A6&&D1>B6&&D1>C6&&D1>D6)
     {
         System.out.println("La puerta con más pisos es la D1, en el primer piso\n"
      +"con "+D1+ " habitantes");   
     }
     if(A2>A1&&A2>B1&&A2>C1&&A2>D1&&A2==A2&&A2>B2&&A2>C2&&A2>D2&&A2>A3&&A2>B3&&A2>C3&&A2>D3&&A2>
       A4&&A2>B4&&A2>C4&&A2>D4&&A2>A5&&A2>B5&&A2>C5&&A2>D5&&A2>A6&&A2>B6&&A2>C6&&A2>D6)
     {
         System.out.println("La puerta con más pisos es la A2, en el segundo piso\n"
      +"con "+A2+ " habitantes");   
     }
     if(B2>A1&&B2>B1&&B2>C1&&B2>D1&&B2>A2&&B2==B2&&B2>C2&&B2>D2&&B2>A3&&B2>B3&&B2>C3&&B2>D3&&B2>
       A4&&B2>B4&&B2>C4&&B2>D4&&B2>A5&&B2>B5&&B2>C5&&B2>D5&&B2>A6&&B2>B6&&B2>C6&&B2>D6)
     {
         System.out.println("La puerta con más pisos es la B2, en el segundo piso\n"
      +"con "+B2+ " habitantes");   
     }
     if(C2>A1&&C2>B1&&C2>C1&&C2>D1&&C2>A2&&C2>B2&&C2==C2&&C2>D2&&C2>A3&&C2>B3&&C2>C3&&C2>D3&&C2>
       A4&&C2>B4&&C2>C4&&C2>D4&&C2>A5&&C2>B5&&C2>C5&&C2>D5&&C2>A6&&C2>B6&&C2>C6&&C2>D6)
     {
         System.out.println("La puerta con más pisos es la C2, en el segundo piso\n"
      +"con "+C2+ " habitantes");   
     }
     if(D2>A1&&D2>B1&&D2>C1&&D2>D1&&D2>A2&&D2>B2&&D2>C2&&D2==D2&&D2>A3&&D2>B3&&D2>C3&&D2>D3&&D2>
       A4&&D2>B4&&D2>C4&&D2>D4&&D2>A5&&D2>B5&&D2>C5&&D2>D5&&D2>A6&&D2>B6&&D2>C6&&D2>D6)
     {
         System.out.println("La puerta con más pisos es la D2, en el segundo piso\n"
      +"con "+D2+ " habitantes");   
     }
     if(A3>A1&&A3>B1&&A3>C1&&A3>D1&&A3>A2&&A3>B2&&A3>C2&&A3>D2&&A3==A3&&A3>B3&&A3>C3&&A3>D3&&A3>
       A4&&A3>B4&&A3>C4&&A3>D4&&A3>A5&&A3>B5&&A3>C5&&A3>D5&&A3>A6&&A3>B6&&A3>C6&&A3>D6)
     {
         System.out.println("La puerta con más pisos es la A3, en el tercer piso\n"
      +"con "+A3+ " habitantes");   
     }
     if(B3>A1&&B3>B1&&B3>C1&&B3>D1&&B3>A2&&B3>B2&&B3>C2&&B3>D2&&B3>A3&&B3==B3&&B3>C3&&B3>D3&&B3>
       A4&&B3>B4&&B3>C4&&B3>D4&&B3>A5&&B3>B5&&B3>C5&&B3>D5&&B3>A6&&B3>B6&&B3>C6&&B3>D6)
     {
         System.out.println("La puerta con más pisos es la B3, en el tercer piso\n"
      +"con "+B3+ " habitantes");   
     }
     if(C3>A1&&C3>B1&&C3>C1&&C3>D1&&C3>A2&&C3>B2&&C3>C2&&C3>D2&&C3>A3&&C3>B3&&C3==C3&&C3>D3&&C3>
       A4&&C3>B4&&C3>C4&&C3>D4&&C3>A5&&C3>B5&&C3>C5&&C3>D5&&C3>A6&&C3>B6&&C3>C6&&C3>D6)
     {
         System.out.println("La puerta con más pisos es la C3, en el tercer piso\n"
      +"con "+C3+ " habitantes");   
     }
     if(D3>A1&&D3>B1&&D3>C1&&D3>D1&&D3>A2&&D3>B2&&D3>C2&&D3>D2&&D3>A3&&D3>B3&&D3>C3&&D3==D3&&D3>
       A4&&D3>B4&&D3>C4&&D3>D4&&D3>A5&&D3>B5&&D3>C5&&D3>D5&&D3>A6&&D3>B6&&D3>C6&&D3>D6)
     {
         System.out.println("La puerta con más pisos es la D3, en el tercer piso\n"
      +"con "+D3+ " habitantes");   
     }
     if(A4>A1&&A4>B1&&A4>C1&&A4>D1&&A4>A2&&A4>B2&&A4>C2&&A4>D2&&A4>A3&&A4>B3&&A4>C3&&A4>D3&&A4==
       A4&&A4>B4&&A4>C4&&A4>D4&&A4>A5&&A4>B5&&A4>C5&&A4>D5&&A4>A6&&A4>B6&&A4>C6&&A4>D6)
     {
         System.out.println("La puerta con más pisos es la A4, en el cuarto piso\n"
      +"con "+A4+ " habitantes");   
     }
     if(B4>A1&&B4>B1&&B4>C1&&B4>D1&&B4>A2&&B4>B2&&B4>C2&&B4>D2&&B4>A3&&B4>B3&&B4>C3&&B4>D3&&B4>
       A4&&B4==B4&&B4>C4&&B4>D4&&B4>A5&&B4>B5&&B4>C5&&B4>D5&&B4>A6&&B4>B6&&B4>C6&&B4>D6)
     {
         System.out.println("La puerta con más pisos es la B4, en el cuarto piso\n"
      +"con "+B4+ " habitantes");   
     }
     if(C4>A1&&C4>B1&&C4>C1&&C4>D1&&C4>A2&&C4>B2&&C4>C2&&C4>D2&&C4>A3&&C4>B3&&C4>C3&&C4>D3&&C4>
       A4&&C4>B4&&C4==C4&&C4>D4&&C4>A5&&C4>B5&&C4>C5&&C4>D5&&C4>A6&&C4>B6&&C4>C6&&C4>D6)
     {
         System.out.println("La puerta con más pisos es la C4, en el cuarto piso\n"
      +"con "+C4+ " habitantes");   
     }
     if(D4>A1&&D4>B1&&D4>C1&&D4>D1&&D4>A2&&D4>B2&&D4>C2&&D4>D2&&D4>A3&&D4>B3&&D4>C3&&D4>D3&&D4>
       A4&&D4>B4&&D4>C4&&D4==D4&&D4>A5&&D4>B5&&D4>C5&&D4>D5&&D4>A6&&D4>B6&&D4>C6&&D4>D6)
     {
         System.out.println("La puerta con más pisos es la D4, en el cuarto piso\n"
      +"con "+D4+ " habitantes");   
     }
     if(A5>A1&&A5>B1&&A5>C1&&A5>D1&&A5>A2&&A5>B2&&A5>C2&&A5>D2&&A5>A3&&A5>B3&&A5>C3&&A5>D3&&A5>
       A4&&A5>B4&&A5>C4&&A5>D4&&A5==A5&&A5>B5&&A5>C5&&A5>D5&&A5>A6&&A5>B6&&A5>C6&&A5>D6)
     {
         System.out.println("La puerta con más pisos es la A5, en el quinto piso\n"
      +"con "+A5+ " habitantes");   
     }
     if(B5>A1&&B5>B1&&B5>C1&&B5>D1&&B5>A2&&B5>B2&&B5>C2&&B5>D2&&B5>A3&&B5>B3&&B5>C3&&B5>D3&&B5>
       A4&&B5>B4&&B5>C4&&B5>D4&&B5>A5&&B5==B5&&B5>C5&&B5>D5&&B5>A6&&B5>B6&&B5>C6&&B5>D6)
     {
         System.out.println("La puerta con más pisos es la B5, en el quinto piso\n"
      +"con "+B5+ " habitantes");   
     }
     if(C5>A1&&C5>B1&&C5>C1&&C5>D1&&C5>A2&&C5>B2&&C5>C2&&C5>D2&&C5>A3&&C5>B3&&C5>C3&&C5>D3&&C5>
       A4&&C5>B4&&C5>C4&&C5>D4&&C5>A5&&C5>B5&&C5==C5&&C5>D5&&C5>A6&&C5>B6&&C5>C6&&C5>D6)
     {
         System.out.println("La puerta con más pisos es la C5, en el quinto piso\n"
      +"con "+C5+ " habitantes");   
     }
     if(D5>A1&&D5>B1&&D5>C1&&D5>D1&&D5>A2&&D5>B2&&D5>C2&&D5>D2&&D5>A3&&D5>B3&&D5>C3&&D5>D3&&D5>
       A4&&D5>B4&&D5>C4&&D5>D4&&D5>A5&&D5>B5&&D5>C5&&D5==D5&&D5>A6&&D5>B6&&D5>C6&&D5>D6)
     {
         System.out.println("La puerta con más pisos es la D5, en el quinto piso\n"
      +"con "+D5+ " habitantes");   
     }
     if(A6>A1&&A6>B1&&A6>C1&&A6>D1&&A6>A2&&A6>B2&&A6>C2&&A6>D2&&A6>A3&&A6>B3&&A6>C3&&A6>D3&&A6>
       A4&&A6>B4&&A6>C4&&A6>D4&&A6>A5&&A6>B5&&A6>C5&&A6>D5&&A6==A6&&A6>B6&&A6>C6&&A6>D6)
     {
         System.out.println("La puerta con más pisos es la A6, en el sexto piso\n"
      +"con "+A6+ " habitantes");   
     }
     if(B6>A1&&B6>B1&&B6>C1&&B6>D1&&B6>A2&&B6>B2&&B6>C2&&B6>D2&&B6>A3&&B6>B3&&B6>C3&&B6>D3&&B6>
       A4&&B6>B4&&B6>C4&&B6>D4&&B6>A5&&B6>B5&&B6>C5&&B6>D5&&B6>A6&&B6==B6&&B6>C6&&B6>D6)
     {
         System.out.println("La puerta con más pisos es la B6, en el sexto piso\n"
      +"con "+B6+ " habitantes");   
     }
     if(C6>A1&&C6>B1&&C6>C1&&C6>D1&&C6>A2&&C6>B2&&C6>C2&&C6>D2&&C6>A3&&C6>B3&&C6>C3&&C6>D3&&C6>
       A4&&C6>B4&&C6>C4&&C6>D4&&C6>A5&&C6>B5&&C6>C5&&C6>D5&&C6>A6&&C6>B6&&C6==C6&&C6>D6)
     {
         System.out.println("La puerta con más pisos es la C6, en el sexto piso\n"
      +"con "+C6+ " habitantes");   
     } 
     if(D6>A1&&D6>B1&&D6>C1&&D6>D1&&D6>A2&&D6>B2&&D6>C2&&D6>D2&&D6>A3&&D6>B3&&D6>C3&&D6>D3&&D6>
       A4&&D6>B4&&D6>C4&&D6>D4&&D6>A5&&D6>B5&&D6>C5&&D6>D5&&D6>A6&&D6>B6&&D6>C6&&D6==D6)
     {
         System.out.println("La puerta con más pisos es la D6, en el sexto piso\n"
      +"con "+D6+ " habitantes");   
     }

     
     
             
     
     
     
     
    
}
}
