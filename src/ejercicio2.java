import javax.swing.*;

public class ejercicio2 {

    public static void main(String[] args) {

        int n = Integer.parseInt(
                JOptionPane.showInputDialog("¿Cuántos estudiantes hay?")
        );

        double[] notas = new double[n];

        double suma = 0;

        for (int i = 0; i < n; i++) {
            notas[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese la nota del estudiante: " + (i + 1)
                    )
            );

            suma += notas[i];
        }
        double promedio = suma / n;

        String resultado;

        if (promedio >= 3.0) {
            resultado = "Aprobado";
        } else {
            resultado = "Reprobado";
        }

        JOptionPane.showMessageDialog(
                null,
                "Promedio del curso: " + promedio +
                        "\nResultado: " + resultado
        );
    }

}
