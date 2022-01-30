public class Kwadrat extends Figura {

    double bok1;

    Kwadrat (double bok1){
        this.bok1 = bok1;
    }
    @Override
    public double pole() {
        return (bok1 * bok1);
    }

    @Override
    public double obwod() {
        return 4 * bok1;
    }
}
