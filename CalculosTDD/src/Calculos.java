
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
        int contador = 0;
    
        String textoMinusculas = texto.toLowerCase();
    
        for (int i = 0; i < textoMinusculas.length(); i++) {
        char letra = textoMinusculas.charAt(i);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' 
            || letra == 'o' || letra == 'u') {
            contador++;
        }
    }
    
    return contador;
    }

    /**
     * *
     * Invierte el orden de las letras en cada palabra, pero no altera el orden
     * de las palabras
     *
     * @param texto
     * @return texto invertida
     */
    String invertir(String texto) {
        throw new UnsupportedOperationException("En construcción.");
    }

}
