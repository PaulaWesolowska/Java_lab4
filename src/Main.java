public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Kwadrat kwadrat = new Kwadrat();
        Prostokat prostokat = new Prostokat();
        System.out.println("Pole prostokąta: " + prostokat.pole(2, 4));
        System.out.println("Pole kwadratu: " + kwadrat.pole(4, 4));
        System.out.println("Obwód prostokąta: " + prostokat.obwod(5, 8));
        System.out.println("Obwód kwadratu: " + kwadrat.obwod(8, 4));
    }
}
