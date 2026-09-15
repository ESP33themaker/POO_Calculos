
public class Calculos {

    /**
     * *
     * Calcula la sumatoria de los numeros entre "x" a "y", incluyendolas
     *
     * @param x
     * @param y
     * @return sumatoria
     */
    int sumarSerie(int x, int y) {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
     * *
     * Cuenta las vocales en una frase
     *
     * @param texto
     * @return cantidad de vocales
     */
    int vocales(String texto) {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
 * Invierte el orden de las letras en cada palabra, pero no altera el orden
 * de las palabras.
 *
 * @param texto el texto original
 * @return texto con las letras de cada palabra invertidas
 */
String invertir(String texto) {
    if (texto == null || texto.isEmpty()) {
        return texto; 
    }
    String[] palabras = texto.split(" ");
    StringBuilder resultado = new StringBuilder();
    for (int i = 0; i < palabras.length; i++) {
        String palabraActual = palabras[i];
        String palabraInvertida = "";
        for (int j = palabraActual.length() - 1; j >= 0; j--) {
            palabraInvertida += palabraActual.charAt(j);
        }
        if (i < palabras.length - 1) {
            resultado.append(" ");
        }
    }

    return resultado.toString();
}

}
