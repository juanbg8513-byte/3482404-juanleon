import javax.swing.*;
import java.util.Scanner;

public class ejercicio5 {

    public static void main (String[] args){

            int n = Integer.parseInt(
                    JOptionPane.showInputDialog("¿Cuántos números va a ingresar?")
            );

            int[] numeros = new int[n];

            for (int i = 0; i < n; i++) {

                numeros[i] = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese el número " + (i + 1))
                );
            }

            int buscar = Integer.parseInt(
                    JOptionPane.showInputDialog("¿Qué número desea buscar?")
            );

            boolean encontrado = false;
            String posiciones = "";

            for (int i = 0; i < n; i++) {

                if (numeros[i] == buscar) {

                    encontrado = true;
                    posiciones += i + " ";
                }
            }

            // Mostrar resultado
            if (encontrado) {

                JOptionPane.showMessageDialog(
                        null,
                        "El número " + buscar +
                                " fue encontrado en las posiciones: " + posiciones
                );

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "El número " + buscar + " no fue encontrado."
                );
            }
        }




    }

