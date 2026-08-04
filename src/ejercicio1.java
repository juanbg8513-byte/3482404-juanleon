import javax.swing.*;

public class ejercicio1 {

    public static void main(String[] args) {

        int Cnumeros = 0;
        int pares = 0;
        int impar = 0;

        Cnumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros deseada "));

        int[] numeros = new int[Cnumeros];

        for (int i = 0; i < Cnumeros; i++) {

            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:" + (i+1)));

        }

        for (int i=0; i<Cnumeros;i++) {

            if (numeros[i] % 2 == 0){

                pares++;

            } else {
                impar++;
            }
            }

        JOptionPane.showMessageDialog(null, "Números pares: " + pares +
                        "\nNúmeros impares: " + impar);

        }
        }






