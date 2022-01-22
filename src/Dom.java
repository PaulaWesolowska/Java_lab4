public class Dom implements Budynek{

    public int okna = 24;
    public int mieszkancy = 5;
    public String adres = "ul. Pogodna 7a, 85-500 Bydgoszcz";
    public String imie = "Jan";
    public String nazwisko = "Kowalski";
    public int wartosc = 15000000;
    KolorEnum kolor1 = KolorEnum.CZERWONY;


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
        System.out.println("Właściciel domu: " + imie + " " + nazwisko);
    }

    public int getOkna() {
        return okna;
    }

    public int getMieszkancy() {
        return mieszkancy;
    }

    public String getAdres() {
        return adres;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setOkna(int okna) {
        this.okna = okna;
    }

    public void setMieszkancy(int mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public int wartoscBudynku(int wartosc){
        this.wartosc = wartosc;
        return wartosc;
    }



    @Override
    public String toString() {
        return "Informacje o budynku: " +
                "liczba okien = " + okna +
                ",liczba mieszkanców = " + mieszkancy +
                ", adres = '" + adres + '\'' +
                ", imię właściciela = '" + imie + '\'' +
                ", nazwisko właściciela = '" + nazwisko + '\'' +
                ", wartość budynku = '" + wartosc + " PLN"+'\'' +
                ", kolor budynku = '" +  kolor1 + '\'' +
                '}';
    }
}
