package clase1_inicio;

public class Variables {
    public static void main(String[] args) {
        //variables
        String name = "Juan Cruz";
        System.out.println(name);

        name = "Martin";
        System.out.println(name);

        int age = 21;
        System.out.println(age);

        var email = "juancruzsonzini55@gmail.com"; //var es una forma de declarar variables sin especificar el tipo, el tipo se infiere automáticamente
        System.out.println(email);

        //constantes
        final String EMAIL = "juancruzsonzini55@gmail.com"; //las constantes se ponen en mayusculas por convención
        //email = "lol"; <-- Esto no se puede hacer porque email es una constante
        System.out.println(EMAIL);
    }
}
