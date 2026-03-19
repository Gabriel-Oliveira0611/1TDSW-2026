public class ExemploOperadores {

    public static void main(String[] args) {

        int n = 100;

        n++; //Incrementa um ao valor da variável.
        System.out.println(n);

        n--; //Decrementa um valor da variável.
        System.out.println(n);

        //Somar 10 no n
        n += 10; //n = n + 10;
        System.out.println(n); //110

        n -= 50;
        System.out.println(n); // 60

        n *= 3;
        System.out.println(n); // 180

        n /= 2;
        System.out.println(n); // 90

        n %= 7;
        System.out.println(n); // 0


    }
}
