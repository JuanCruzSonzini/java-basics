public class Playground {
    public static void main(String[] args) {
        //prueba de distintos systems.xxx.println

        //simple
        System.out.println("Hola");
        System.out.println("Mundo");

        // sin salto de linea
        System.out.print("Hola");
        System.out.print("Mundo");

        //formatear texto
        String nombre = "Juan";
        int edad = 30;
        System.out.printf("Mi nombre es %s y tengo %d años", nombre, edad);
        // %s -> string, %d -> int, %f -> float, %b -> boolean, %c -> char

        //errores
        System.err.println("Esto es un error");
    }
}
