public class Datatypes {
    public static void main(String [] args) {
        int myInt=37;
        double myDouble=3.14; //float, long, byte
        char myChar='A';
        boolean myBoolean=true;

        //string no es primitivo
        String myString="Hello World";

        //tipo de dato en tiempo de compilacion
        System.out.println(myString.getClass().getSimpleName());
    }
}
