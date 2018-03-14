package pl.edu.ur.main;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import static java.lang.Math.*;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7

 //Zadanie 3
 {
 System.out.println("Zadanie nr 3");           
           System.out.println("Zacznij wpisywac elementy tablicy");
           double[] tab= new double[10];
           int i;
           for(i=0;i<10;i++)
              {
           Scanner odczytxxx = new Scanner(System.in);
            tab[i] = odczytxxx.nextDouble(); 
           int z=i+1;
           System.out.println("Wpisałeś element tablicy nr: "+z);
           }
           int w = 1;
           while(w!=0){
           System.out.println("1 - Wypisz od pierwszego elementu.");
           System.out.println("2 - Wypisz od ostatniego elementu.");
           System.out.println("3 - Wypisz elementy nieparzyste.");
           System.out.println("4 - Wypisz elementy parzyste.");
           System.out.println("0 - Wylacz program.");
           
           Scanner odczytxxx= new Scanner(System.in);
           w=odczytxxx.nextInt();
           int j;
           switch(w){
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
                 w=0;
                 break;
             default : System.out.println("Tej opcji nie ma na liscie");
               
               
           }
           
          } 
    }
//Zadanie 4
{        {System.out.println("Zadanie nr 4");
 double[] tab1= new double[10];
       int ix;
       double suma = 0,srednia = 0;
       double iloczyn=1;
       double wynik=0;
       for(ix=0;ix<10;ix++)
       {
           System.out.println("Podaj element tablicy nr: "+ix);
       Scanner odczyt11 = new Scanner(System.in);
        tab1[ix] = odczyt11.nextDouble(); 
        }
       int zx = 1;
       while(zx!=0){
           System.out.println("1 - Suma 2 - Iloczyn 3 - Srednia 4 - Minimalna wartosc 5 - Maksymalna wartosc 0 - Koniec");

                     Scanner odczyt11= new Scanner(System.in);
           zx=odczyt11.nextInt();
           
           switch(zx){
              case 1:
               for(ix=0;ix<10;ix++){
                suma=suma+tab1[ix];
                }
               System.out.println("Suma = "+suma);
             break;
             case 2:
               for(ix=0;ix<10;ix++){
                iloczyn=iloczyn*tab1[ix];
                 }
               System.out.println("Iloczyn = "+iloczyn);
             break;
             case 3:
                 suma=0;
               for(ix=0;ix<10;ix++){
                suma=suma+tab1[ix];}
                srednia=suma/10;
                System.out.println("Srednia = "+srednia);
                
             break;
             case 4: wynik=tab1[0];
                 for(ix=1;ix<10;ix++){
                 
                 if(wynik>tab1[ix]){
                     wynik=tab1[ix];
                 }
                 }
                 System.out.println("Minimum = "+wynik);
                 
             break;
             case 5:
            wynik=tab1[0];
                 for(ix=1;ix<10;ix++){
                 
                 if(wynik<tab1[ix]){
                     wynik=tab1[ix];
                 }
                 }
                 System.out.println("Maksimum = "+wynik);
             break;
          
       
       
       
       

       
    }
       }

//Zadanie 6
{         {System.out.println("Zadanie nr 6");
    int zxc1;
        
while(true)	
  {System.out.println("Podaj liczbe. Wprowadzenie liczby mniejszej od zera zakonczy dzialanie programu.");
            Scanner zxc;
        zxc = new Scanner(System.in);
        zxc1 = zxc.nextInt();
        if(zxc1<0){break;};}
  }
//Zadanie 7*
        {System.out.println("Zadanie nr 7");
      System.out.println("Podaj rozmiar tablicy");
        int ax;
        int nrtab=1;
                Scanner odczyt1xx;
        odczyt1xx = new Scanner(System.in);
         ax = odczyt1xx.nextInt();
         int[] tab2= new int[ax];
         for(int xi=0;xi<ax;xi++){
          System.out.println("Podaj "+nrtab+" element tablicy");
          Scanner odczytxxx = new Scanner(System.in);
           Scanner odczyt1xxx;
        odczyt1xxx = new Scanner(System.in);
            tab2[xi] = odczyt1xxx.nextInt(); 
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

        
        

       
       
       
       
       
       
       
       
       //rkr
       
       }}}}}}


