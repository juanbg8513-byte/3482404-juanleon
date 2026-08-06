import javax.swing.*;

public class ejercicio6 {

    public static void main(String[] args) {

        int n = Integer.parseInt(
                JOptionPane.showInputDialog("¿Cuántos votos se van a registrar?")
        );

        char[] votos = new char[n];


        for (int i = 0; i < n; i++) {

            votos[i] = JOptionPane.showInputDialog(
                    "Ingrese el voto " + (i + 1) + " (A, B o C):"
            ).toUpperCase().charAt(0);
        }

        int votosA = 0;
        int votosB = 0;
        int votosC = 0;


        for (int i = 0; i < n; i++) {

            if (votos[i] == 'A') {
                votosA++;

            } else if (votos[i] == 'B') {
                votosB++;

            } else if (votos[i] == 'C') {
                votosC++;
            }
        }

        String ganador;

        if (votosA > votosB && votosA > votosC) {

            ganador = "Ganó el candidato A";

        } else if (votosB > votosA && votosB > votosC) {

            ganador = "Ganó el candidato B";

        } else if (votosC > votosA && votosC > votosB) {

            ganador = "Ganó el candidato C";

        } else {

            ganador = "Hay un empate";
        }

        JOptionPane.showMessageDialog(
                null,
                "RESULTADOS\n\n" +
                        "Candidato A: " + votosA + " votos\n" +
                        "Candidato B: " + votosB + " votos\n" +
                        "Candidato C: " + votosC + " votos\n\n" +
                        ganador
        );
    }


}
