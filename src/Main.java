import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */
        boolean isIndexCorrect = true;
        String tab[] = {"Jeden", "Dwa", "Trzy", "Cztery", "Pięć", "Sześć"};
        Scanner scan = new Scanner(System.in);

        do {
            int i = -1;
            try {
                System.out.println("Podaj indeks tablicy [0-5], który ma zostać wyświetlony: ");
                i = Integer.parseInt(scan.next());
            } catch (NumberFormatException e) {
                System.out.println("Błąd, wprowadzony znak nie jest cyfrą!");
                //throw e;
            }

            if ((i >= 0) && (i < tab.length-1) ){
                try {
                    System.out.println(tab[i]);
                    isIndexCorrect = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Błąd Podałeś index: " + i + ", a dozwolone są od 0 do " + (tab.length - 1));
                } finally {
                    System.out.println("Koniec programu");
                }
            }

        } while(isIndexCorrect);

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

        try {
            String s = null;
            s.toString();
        } catch (NullPointerException e) {
            System.out.println("Błąd nie można wywołać metody toString() na null");
            throw e;
        }
        int a = 10;
        int b = 0;
            try {
                int result = a / b;
                System.out.println(result);
            } catch(ArithmeticException e) {
                System.out.println("Błąd, nie można dzielić przez zero");
            }

        int arrayy[] = new int[17];
        try {
          arrayy[15] = 34 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Wystąpił błąd Arithmetic Exception ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wystąpił błąd ArrayIndexOutOfBounds");
        } finally {
            System.out.println("Koniec");
        }
    }}
