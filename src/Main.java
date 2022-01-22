public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        Dom dom = new Dom();
        Budynek budynek = new Dom() {

            @Override
            public double powierzchnia(double pow) {
                return pow;
            }

            @Override
            public String adresBudynku(String adres) {
                return adres;
            }

            @Override
            public int liczbaOkien(int okna) {
                return okna;
            }

            @Override
            public void liczbaMieszkancow(int mieszkancy) {
                System.out.println("Liczba mieszkańców: " + mieszkancy);
            }

            @Override
            public void kolorDomu(KolorEnum kolor) {
                System.out.println(kolor);
            }

            @Override
            public void getWlasciciel(String imie, String nazwisko) {
                this.imie = imie;
                this.nazwisko = nazwisko;
            }
        };

        System.out.println("Metoda Budynek.ToString: ");
        System.out.println(budynek.toString());
        System.out.println("\n");
        System.out.println("Metoda Dom.ToString: ");
        System.out.println(dom.toString());

    }
}
