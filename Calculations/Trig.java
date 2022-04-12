package Calculations;

import java.util.Scanner;
import java.lang.Math;
 /**
 * @author Ima Sandra
 * Un programma inserirendo il calcolo delle funzioni trigonometriche,
 * utilizzando i metodi della classe Math, cont.previous exercise.
 * @param PrimoNumero: Il primo numero è del tipo intero passato in Keyboard
 * @param SecondoNumero: Il second numbero è anche del tipo intero passato in Keyboard
 * Trig = SIN, COS, TAN. 
 * Previous = +, -, *, /.
 * @return: Restuituirà le 6 operazione fatte da PrimoNumero e SecondoNumero
 */


public class Trig {
    //somma
    public static int somma (int primoNumero, int SecondoNumero) {
        return primoNumero + SecondoNumero;
    }

//differenza
public static int differenza(int primoNumero, int SecondoNumero) {
    return primoNumero - SecondoNumero;
}

//prodotto
public static int prodotto(int primoNumero, int SecondoNumero) {
    return primoNumero * SecondoNumero;
}

//divisione
public static int divisione(int primoNumero, int SecondoNumero) {
    return primoNumero / SecondoNumero;

}

// public static double sin (double);
//  static double cos(double);
//  static double tan(double);

public static void main(String[] args) {
  int primoNumero;  
  int SecondoNumero;
  double angolo;
  String sentence;

do {
    
System.out.println("SCEGLI TRA LE SEGUENTI OPERAZIONI :\n" +
"1) LA SOMMA :\n" +
"2) LA DIFFERENZA :\n" +
"3) IL PRODOTTO :\n" +
"4) LA DIVISIONE :\n"+
"5) SENO :\n"+
"6) TANGENTE :\n"+
"7) COSENO :\n");

//DA SCEGLIERE
Scanner Keyboard = new Scanner(System.in);
System.out.println("Scegli tra le opzioni da 1 a 7: ");
int operatore = Keyboard.nextInt();

//INPUT UTENTE
System.out.println("Inserisci il primo numero");
primoNumero = Keyboard.nextInt();
System.out.println("Inserisci il secondo numero");
SecondoNumero = Keyboard.nextInt();


switch (operatore){

    case 1: //somma
System.out.println("la somma è: " + somma (primoNumero, SecondoNumero));
break;

case 2: //differenza
System.out.println("la differenza è:" + differenza(primoNumero, SecondoNumero));
break;

case 3: //prodotto
System.out.println("il prodotto è:" + prodotto(primoNumero, SecondoNumero));
break;

case 4: // divisione
                if (SecondoNumero != 0) {
                    System.out.println("Il risultato è: " + divisione(primoNumero, SecondoNumero));
                } else {
                    System.out.println("impossibile dividere per zero");
                }
 break;

 case 5: // seno
             System.out.println("Inserisci il valore dell'angolo:");
             angolo = Keyboard.nextDouble();
             double risultatoSeno = Math.sin(Math.toRadians(angolo));
             System.out.println("Il risultato del seno è: " + risultatoSeno);
 break;

 case 6: //Tangente
             System.out.println("Inserisci il valore dell'angolo:");
             angolo = Keyboard.nextDouble();
             double risultatoTangente = Math.tan(Math.toRadians(angolo));
             System.out.println("Il risultato è: " + risultatoTangente);
 break;

 case 7: // coseno
             System.out.println("Inserisci il valore dell'angolo:");
             angolo = Keyboard.nextDouble();
             double risultatoCoseno = Math.cos(Math.toRadians(angolo));
             System.out.println("Il risultato del coseno è: " + risultatoCoseno);
 break;

 default:
             System.out.println("Hai scelto un numero sbagliato!!!");
 break;
 
           
      } 
      System.out.println("Scrivi " + " y " + " per fare un nuovo operazione, altrimenti termina il programa");
      sentence = Keyboard.next();
    }  while(sentence.equalsIgnoreCase("Y"));

  }
}
