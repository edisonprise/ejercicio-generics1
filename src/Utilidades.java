import java.util.Collection;
import java.util.List;

public class Utilidades {
    //Metodo para imprimir los elementos de la lista
    public static <T> void imprimirElementos(List<T> lista) {
        for(T elemento : lista) {
            System.out.println(elemento);
        }
    }
    //Metodo para copiar elementos de una lista de origen a una lista de destino
    //Utilizamos bounded generic para asegurar que la lista de destino sea de un tipo igual o superclase del tipo de la lista de origen
    public static <T, U extends T> void copiarElementos(List<? extends T> origen, Collection<? super T> destino) {
        destino.addAll(origen);
    }
}
