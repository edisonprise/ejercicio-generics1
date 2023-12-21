import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Ejemplo de uso de imprimirElementos
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Utilidades.imprimirElementos(numeros);

        List<String> palabras = new ArrayList<>();
        palabras.add("Edinson");
        palabras.add("Anderson");
        Utilidades.imprimirElementos(palabras);

        //Ejemplo de uso de copiarElementos
        List<Integer> numerosOrigen = new ArrayList<>();
        numerosOrigen.add(10);
        numerosOrigen.add(20);
        numerosOrigen.add(30);

        List<Number> numerosDestino = new ArrayList<>();
        Utilidades.copiarElementos(numerosOrigen, numerosDestino);
        Utilidades.imprimirElementos(numerosDestino);

        List<Number> numerosFloatDestino = new ArrayList<>();
        Utilidades.copiarElementos(numerosOrigen, numerosFloatDestino);
        Utilidades.imprimirElementos(numerosFloatDestino);

        //No se permitira copiar elementos a una lista que no sea superclase de Integer
        List<String> palabrasDestino = new ArrayList<>();
        //Utilidades.copiarElementos(numerosOrigen, palabrasDestino);//Esto generara un error de compilacion
    }
}