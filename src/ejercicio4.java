import javax.swing.*;

public class ejercicio4 {

    public static void main(String[] args) {

        int Ct = Integer.parseInt(JOptionPane.showInputDialog("Cuantas temperaturas deseas a registrar" + ":"));

        int[] temperatura = new int[Ct];

        String resultado="";

        for (int i = 0; i < Ct; i++) {

            temperatura[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores de las temperaturas  (en grados Celsius)="));

            if (temperatura[i]<10) {

                resultado += temperatura[i] + "°C = Fría\n";


            } else if (temperatura[i]>10 && temperatura[i]<=25) {
                resultado += temperatura[i] + "°C = Templada\n";


            }else{
                resultado += temperatura[i] + "°C = Calurosa\n";

            }

        }
        JOptionPane.showMessageDialog(
                null,
                "Temperaturas registradas:\n\n" + resultado);


    }

        }



