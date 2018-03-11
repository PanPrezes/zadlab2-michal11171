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
//zadanie z miesiacami
System.out.println("Zadanie z miesiacami");
System.out.println("Podaj numer miesiaca");
        Scanner odczyt = new Scanner(System.in);
        int k = odczyt.nextInt();
{
        switch (k) {
            case 1:
                System.out.println("styczen");
                break;
            case 2:
                System.out.println("luty");
                break;
            case 3:
                System.out.println("marzec");
                break;
            case 4:
                System.out.println("kwiecien");
                break;
            case 5:
                System.out.println("maj");
                break;
            case 6:
                System.out.println("czerwiec");
                break;
            case 7:
                System.out.println("lipiec");
                break;
            case 8:
                System.out.println("sierpien");
                break;
            case 9:
                System.out.println("wrzesien");
                break;
            case 10:
                System.out.println("pazdziernik");
                break;
            case 11:
                System.out.println("listopad");
                break;
            case 12:
                System.out.println("grudzien");
                break;
            default:
            System.out.println("Koniec");
        }
        
    }

{
    
}
//zadanie z dodawaniem aż do 1000
System.out.println("Zadanie z dodawaniem do 1000");
int n=1;
int a1;
int s;
System.out.println("Podaj liczbe poczatkowa");
        Scanner odczyt1;
        odczyt1 = new Scanner(System.in);
         a1 = odczyt1.nextInt();
        System.out.println("Podaj ile dodawac");
         Scanner odczyt2;
        odczyt2 = new Scanner(System.in);
        
        s = odczyt1.nextInt();
while(a1<=1000)
{
    System.out.println("Operacja numer: "+n+" Wynik: "+a1);
    n=n+1;
    a1=a1+s;
    
}
//zadanie 5
System.out.println("Zadanie nr 5");
for(int x=20;x>=0;x--)
{   if(x==2||x==6||x==9||x==15||x==19)
    continue;
    System.out.println(x);
    
}
//zadanie 1
System.out.println("Zadanie nr 1");
        int a3, a4,a5;
        float d,x1,x2,x3,p;
        System.out.println("Podaj wartosc A");
         Scanner odczyt3;
        odczyt3 = new Scanner(System.in);
        
        a3 = odczyt1.nextInt(); 
                System.out.println("Podaj wartosc B");
         Scanner odczyt4;
        odczyt4 = new Scanner(System.in);
        
        a4 = odczyt1.nextInt();
                System.out.println("Podaj wartosc C");
         Scanner odczyt5;
        odczyt5 = new Scanner(System.in);
        
        a5 = odczyt1.nextInt();
        
        System.out.println("Twoje wyrazenie to: "+a3+"x^2+"+a4+"x+"+a5);
        d=(a4*a4)-(4*a3*a5);
        System.out.println("Wartosc delty to:"+d);
        p=(float) Math.sqrt(d);
        System.out.println("Wartosc pierwiastka z delty to:"+p);
        if(p<0) {System.out.println("Delta mniejsza od zera - brak miejsc zerowych");}
        if(p>0)
        {
            x1=(-a4-p)/(2*a3);
            x2=(-a4+p)/(2*a3);
            System.out.println("Delta wieksza od zera- miejsca zerowe to:"+x1+" oraz "+x2);
        }
        if(p==0) 
        {x3=-a4/(2*a3);
        System.out.println("Delta rowna zero - miejsce zerowe to "+x3);
        }
        
//
    }
    
}
