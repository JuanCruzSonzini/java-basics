package clase2_Operadores;

public class Operadores {
    public static void main(String[] args) {
        //operadores

        //aritmeticos
        var a=5;
        var b=3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //asignacion
        a = b;
        System.out.println(a);

        a = b*2;
        System.out.println(a); //

        a += 1; // a -=1, a *=2, a /=2, a %=2 son otros casos
        a %= 7;
        System.out.println(a);

        //Comparacion
        System.out.println(a==b);
        System.out.println(a==0);

        System.out.println(a!=b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        //lógicos

        //Y (and)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true );
        System.out.println(false && false);

        //O (or)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true );
        System.out.println(false || false);

        //No (not)
        System.out.println(!true);
        System.out.println(!false);

        //operadores unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);


    }
}

