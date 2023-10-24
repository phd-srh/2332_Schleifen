public class Main {
    public static void main(String[] args) {
        /* für den Anfang wird aller Programmcode hier in "main" stehen */

        short x = 10;
        while ( x > 0 ) {
            System.out.println("Hallo, wir sind bei " + x);
            x = (short)(x + 1);
        }
    }
}
