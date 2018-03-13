
import static java.lang.Math.sqrt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patryk
 */
public class zadanie1 {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
  /*      Scanner odczyt = new Scanner(System.in);
      int z;
    System.out.println("Padaj numer zadania");
    z = odczyt.nextInt();
    switch (z)
    {
        case 1:
        int a,b,c;
            System.out.println("Podaj a");
            a = odczyt.nextInt();
            System.out.println("Podaj b");
            b = odczyt.nextInt();
            System.out.println("Podaj c");
            c = odczyt.nextInt();
        double delta,x1,x2;
        delta = b*b-(4*a*c); 
        if (delta ==0){
             x1 =(-b/2*a);
             System.out.println("Pierwiastek wielomianu to " +x1);
        }
        else{
            x1 = ((-b+sqrt(delta))/(2*a));
             x2 = ((-b-sqrt(delta))/(2*a));
             System.out.println("Pierwiastki wielomianu to " +x1  +x2);
        }
        break;
        case 2:
            
            
            }
   */
         //z3
 {
 System.out.println("Zad 3");           
           System.out.println("Zacznij wpisywac elementy tablicy");
           double[] tab= new double[10];
           int i;
           for(i=0;i<10;i++)
              {
           Scanner odczyt = new Scanner(System.in);
            tab[i] = odczyt.nextDouble(); 
           int z=i+1;
           System.out.println("Wpisałeś element tablicy nr: "+z);
           }
           int s = 1;
           while(s!=0){
           System.out.println("1 - Wyświetl od pierwszego elementu.");
           System.out.println("2 - Wyświetl od ostatniego elementu.");
           System.out.println("3 - Wyświetl elementy nieparzyste.");
           System.out.println("4 - Wyswietl elementy parzyste.");
           System.out.println("0 - Koniec.");
           
           Scanner odczyt= new Scanner(System.in);
           s=odczyt.nextInt();
           int j;
           switch(s){
              case 1:
               for(j=0;j<10;j++)
               System.out.println("Elementy od pierwszego: "+tab[j]);
             break;
             case 2:
               for(j=9;j>=0;j--)
               System.out.println("Elementy od ostatniego: "+tab[j]);
             break;
             case 3:
               for(j=0;j<10;j=j+2)
               System.out.println("Elementy nieparzyste: "+tab[j]);
             break;
             case 4:
               for(j=1;j<10;j=j+2)
               System.out.println("Elementy parzyste: "+tab[j]);
             break;
             case 0:
                 s=0;
                 break;
             default : System.out.println("błędne polecenie");
               
               
           }
           
          } 
    }
//z4
{        {System.out.println("Zad 4");
 double[] tab1= new double[10];
       int k;
       double suma = 0,srednia = 0;
       double iloczyn=1;
       double wynik=0;
       for(k=0;k<10;k++)
       {
           System.out.println("Podaj element tablicy : "+k);
       Scanner odczyt = new Scanner(System.in);
        tab1[k] = odczyt.nextDouble(); 
        }
       int u = 1;
       while(u!=0){
           System.out.println("1 - Suma 2 - Iloczyn 3 - Srednia 4 - Minimalna wartosc 5 - Maksymalna wartosc 0 - Koniec");

                     Scanner odczyt= new Scanner(System.in);
           u=odczyt.nextInt();
           
           switch(u){
              case 1:
               for(k=0;k<10;k++){
                suma=suma+tab1[k];
                }
               System.out.println("Suma = "+suma);
             break;
             case 2:
               for(k=0;k<10;k++){
                iloczyn=iloczyn*tab1[k];
                 }
               System.out.println("Iloczyn = "+iloczyn);
             break;
             case 3:
                 suma=0;
               for(k=0;k<10;k++){
                suma=suma+tab1[k];}
                srednia=suma/10;
                System.out.println("Srednia = "+srednia);
                
             break;
             case 4: wynik=tab1[0];
                 for(k=1;k<10;k++){
                 
                 if(wynik>tab1[k]){
                     wynik=tab1[k];
                 }
                 }
                 System.out.println("Minimum = "+wynik);
                 
             break;
             case 5:
            wynik=tab1[0];
                 for(k=1;k<10;k++){
                 
                 if(wynik<tab1[k]){
                     wynik=tab1[k];
                 }
                 }
                 System.out.println("Maksimum = "+wynik);
             break;
    }
       }

//z 6
{         {System.out.println("Zad 6");
    int lc;
        
while(true)	
  {System.out.println("Podaj liczbe. Wprowadzenie liczby mniejszej od zera zakonczy dzialanie programu.");
           
        Scanner odczyt = new Scanner(System.in);
        lc = odczyt.nextInt();
        if(lc<0){break;};}
  }
//z 7
        {System.out.println("Zad 7");
      System.out.println("Podaj rozmiar tablicy");
        int n;
        int nrtab=1;
                Scanner odczyt1;
        odczyt1 = new Scanner(System.in);
         n = odczyt1.nextInt();
         int[] tab2= new int[n];
         for(int xi=0;xi<n;xi++){
          System.out.println("Podaj "+nrtab+" element tablicy");
          Scanner odczytx = new Scanner(System.in);
           Scanner odczyt1x;
        odczyt1x = new Scanner(System.in);
            tab2[xi] = odczyt1x.nextInt(); 
            nrtab=nrtab+1;
         }
int temp;
int zmiana = 1;
while(zmiana > 0){
zmiana = 0;
for(int g=0; g<tab2.length-1; g++){
if(tab2[g]>tab2[g+1]){
temp = tab2[g+1];
tab2[g+1] = tab2[g];
tab2[g] = temp;
zmiana++;
}
}
}
for(int g=0; g<tab2.length; g++){
System.out.print(tab2[g]+" ");}
}
}
}
}
    }
}
// Zrobione 
