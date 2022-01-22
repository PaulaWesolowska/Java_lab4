public interface Budynek {

    enum KolorEnum { CZARNY, CZERWONY, ZIELONY, NIEBIESKI, SREBRNY;
        public static boolean kolor;
    }

    double powierzchnia(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int okna);
    void liczbaMieszkancow(int mieszkancy);
    void kolorDomu(KolorEnum kolor);

    void getWlasciciel(String imie, String nazwisko);

}
