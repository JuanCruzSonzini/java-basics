package clase4_Condicionales;

public class Condicionales {
    public static void main(String[] args) {
        //condicionales
        var age = 19;

        if (age > 18) {
            System.out.println("Eres mayor de edad");
        } else if (age == 18) {
            System.out.println("cumpliste 18 años");
        } else {
            System.out.println("Eres menor de edad");
        }

        //switch
        var day = 1;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
        }
    }
}
