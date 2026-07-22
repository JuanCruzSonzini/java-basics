package clase3_String;

public class Strings {
    public static void main(String[] args) {

        //cadenas de texto

        //declaracion
        String name = "Juan Cruz";
        var surname = new String("Sonzini");

        //Operaciones basicas

        //concatenación
        System.out.println(name + " " + surname);

        //length
        System.out.println(name.length());

        //obtener caracter
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(name.length() - 1));

        //subcadena
        System.out.println(name.substring(0, 4)); // es [i, j) es decir, incluye el primer caracter y excluye el segundo

        //mayus y minus
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //comprobar si contiene
        System.out.println("hola, java".contains("Juan"));
        System.out.println("hola, java".toUpperCase().contains("AVA"));

        //Comparación
        System.out.println(name.equals("Juan Cruz")); //por buenas practicas usamos equals para comparar strings,
                                                      // no == porque == compara referencias de objetos y no el contenido
        System.out.println(name.equals("juan cruz"));
        System.out.println(name.equalsIgnoreCase("juan cruz"));

        //== vs equals
        String a = "hola";
        String b = "hola";
        String c = new String("hola");

        System.out.println(a == b); //true, porque a y b apuntan al mismo objeto en memoria
        System.out.println(a == c); //false, porque c es un objeto diferente en memoria
        System.out.println(a.equals(c)); //true, porque equals compara el contenido de los objetos

        //trim
        System.out.println(" hola soy juan cruz lol ".trim()); //elimina los espacios al principio y al final

        //replace
        System.out.println(" hola soy juan cruz lol ".replace(" ", ""));
        System.out.println(" hola soy juan cruz lol ".replace("juan cruz", "pedro"));

        //format
        var age = 11;
        System.out.println(String.format("Hola, %s. Tengo %d años", name, age));
        //String.format es una forma de formatear strings, similar a printf, pero devuelve un string en lugar de imprimirlo
    }
}
