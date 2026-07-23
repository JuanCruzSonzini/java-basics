package clase5_Estructuras;
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        //Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        //Tamaño
        System.out.println(names.size());

        //Añadir elementos
        //names[0] = "Juan"; //esto da error pq no se puede acceder a un indice que no existe
        names.add("Juan");
        names.add("Cruz");
        names.add("Sonzini");
        System.out.println(names.size());

        //Acceso
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificar
        names.set(2, "juancruzsonzini55@gmail.com");
        System.out.println(names.getLast());

        //Eliminar
        names.remove(2);
        // System.out.println(names.get(2)); esto da error pq el indice 2 ya no existe
        System.out.println(names.size());

        //Buscar
        System.out.println(names.contains("Juan"));
        System.out.println(names.contains("juancruzsonzini@gmail.com"));

        //Limpiar Arraylist
        names.clear();
        System.out.println(names.size());

    }
}
