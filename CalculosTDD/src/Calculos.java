
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
