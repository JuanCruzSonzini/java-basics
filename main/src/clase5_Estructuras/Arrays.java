package clase5_Estructuras;

public class Arrays {
    public static void main(String[] args) {
        //Declaración y creación
        int[] myArray = new int[3];
        System.out.println(myArray);

        String[] name = {"Juan", "Cruz", "Sonzini"};
        System.out.println(name);

        //Acceso
        System.out.println(name[0]);
        System.out.println(myArray[0]);

        System.out.println((new String[3])[0]); //esto da null pq el string por defecto trae nulls, y el int 0

        //modificar
        myArray[0] = 1;
        myArray[1] = 10;
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);

        //myArray[3] = 100; esto da error pq el array tiene tamaño 3 y el indice 3 no existe

        boolean[] booleans = new boolean[3];
        System.out.println(booleans[0]); //false por defecto
    }
}
