
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
        if(x>y){
            int temp=x;
            x=y;
            y=temp;
        }
        int suma=0;
        for (int i=x; i<=y; i++)
            suma=suma+i;
        return suma;
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        float res = Math.abs(num);
        return res;
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
    // Caso borde: si viene vacío o null, devolvemos lo mismo para que no explote
    if (texto == null || texto.isEmpty()) {
        return texto; 
    }

    // 1. Separamos el texto en un array de palabras usando el espacio
    String[] palabras = texto.split(" ");
    
    // Usamos StringBuilder para armar el resultado (¡te explico por qué abajo!)
    StringBuilder resultado = new StringBuilder();

    // 2. Recorremos cada palabra
    for (int i = 0; i < palabras.length; i++) {
        String palabraActual = palabras[i];
        String palabraInvertida = "";

        // 3. Invertimos la palabra letra por letra (recorriendo hacia atrás)
        for (int j = palabraActual.length() - 1; j >= 0; j--) {
            palabraInvertida += palabraActual.charAt(j);
        }

        // 4. Agregamos la palabra invertida al resultado final
        resultado.append(palabraInvertida);

        // Si no es la última palabra, le agregamos un espacio para separarlas
        if (i < palabras.length - 1) {
            resultado.append(" ");
        }
    }

    return resultado.toString();
}

}
