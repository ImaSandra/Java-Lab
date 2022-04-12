package Calculations;

import java.util.Scanner;

 /**
 * @author Ima Sandra
 * Un programma che svolga le funzioni di una calcolatrice,
 * implementi quindi la funzione di somma, differenza, moltiplicazione-prodotto, divisione.
 * 
 * @param PrimoNumero: Il primo numero è del tipo intero passato in Keyboard
 * @param SecondoNumero: Il second numbero è anche del tipo intero passato in Keyboard
 * @return: Restuituirà le 4 operazione fatte da PrimoNumero e SecondoNumero
 */

 public class Calcolatrice {
  public static void main(String[] args) {
      int primoNumero;
      int SecondoNumero;
      int risultato;

      Scanner Keyboard = new Scanner(System.in);
      System.out.println("Inserisci il primo numero: ");
      primoNumero = Keyboard.nextInt();

      System.out.println("Inserisci il secondo numero: ");
      SecondoNumero = Keyboard.nextInt();

    //   System.out.println("La somma dei due numeri sono: ");
    //   System.out.println(primoNumero + SecondoNumero);

    System.out.println("scegli una delle operazioni disponibili:\n" +
    "1) SOMMA\n" +
    "2) DIFFERENZA\n" +
    "3) PRODOTTO\n" +
    "4) DIVISIONE\n");


   System.out.println("Scegli operazione da eseguire: ");
   int operatore = Keyboard. nextInt();
  
   if(operatore == 1){
       //somma
       risultato = primoNumero + SecondoNumero;
       System.out.println("la somma dei due numeri inseriti sono: " + risultato);

   } else if (operatore == 2){
 //Differenza
       risultato = primoNumero - SecondoNumero;
       System.out.println("la differenza tra i due numeri inseriti sono: " + risultato);

   } else if (operatore == 3){
 //Prodotto
       risultato = primoNumero * SecondoNumero;
       System.out.println("il prodotto tra i due numeri inseriti sono: " + risultato);

   } else  if (operatore == 4){
        //Divisone
       if (SecondoNumero != 0 ){
    risultato = primoNumero / SecondoNumero;
     System.out.println("la divisione tra i due numeri inseriti sono: " + risultato);
     }else{
        System.out.println("impossible!!!");
} 

} else if(operatore > 4 && operatore < 1){
    System.out.println( "Hai scelto un numero sbagliato!");
    System.out.println( "Scegli da numero 1 a 4");
    }
  }
}
 


