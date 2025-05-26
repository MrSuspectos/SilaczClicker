package silaczclicker;

public class Masazysta extends Osoba {
    private int czas_trwania = 0;
    private boolean skutecznosc;

    public Masazysta(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    public void masuj(Silacz silacz) {
        // Przykładowa logika masażu
        silacz.sila += 7;
        skutecznosc = true;
    }

    @Override
    public void dzialanie() {
        // Działanie masażysty
    }
}
