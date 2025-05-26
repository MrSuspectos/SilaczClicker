package silaczclicker;

public class Trening {
    private int intensywnosc_poziom;
    private int czas_trwania;
    private String typ_treningu;

    public Trening(int intensywnosc_poziom, int czas_trwania, String typ_treningu) {
        this.intensywnosc_poziom = intensywnosc_poziom;
        this.czas_trwania = czas_trwania;
        this.typ_treningu = typ_treningu;
    }

    public void wykonaj_trening(Silacz silacz) {
        silacz.sila += intensywnosc_poziom * czas_trwania / 10;
    }
}
