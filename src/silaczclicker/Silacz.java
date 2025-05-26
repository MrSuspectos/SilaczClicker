package silaczclicker;

public class Silacz extends Osoba {
    protected int sila;

    public Silacz(String imie, String nazwisko) {
        super(imie, nazwisko);
        this.sila = 100;
    }

    @Override
    public void dzialanie() {
        // Przykładowe działanie siłacza
    }
}
