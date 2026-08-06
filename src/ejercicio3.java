import javax.swing.*;


public class ejercicio3 {

   public static void main(String[] args){

       int n = Integer.parseInt(
               JOptionPane.showInputDialog("¿Cuántos números va a ingresar?")
       );

       int[] numeros = new int[n];

       for (int i = 0; i < n; i++) {
           numeros[i] = Integer.parseInt(
                   JOptionPane.showInputDialog("Ingrese el número: " + (i + 1))
           );
       }

       int mayor = numeros[0];
       int menor = numeros[0];

       for (int i = 0; i < n; i++) {

           if (numeros[i] > mayor) {
               mayor = numeros[i];
           }

           if (numeros[i] < menor) {
               menor = numeros[i];
           }
       }


       JOptionPane.showMessageDialog(
               null,
               "Valor mayor: " + mayor +
                       "\nValor menor: " + menor
       );

   }
}
