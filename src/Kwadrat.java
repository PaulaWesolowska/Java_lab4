public class Kwadrat extends Figura {

    @Override
    double pole(double bok1, double bok2) {
        return bok1 * bok2;
    }

    @Override
    double obwod(double bok1, double bok2) {
        return 2* bok1 + 2* bok2;
    }
}
