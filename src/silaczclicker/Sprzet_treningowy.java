package silaczclicker;

public class Sprzet_treningowy extends Zasoby {
    public Sprzet_treningowy(String nazwa) {
        super(nazwa);
    }

    @Override
    public void uzyj(Silacz silacz) {
        silacz.sila += 5;
        zuzyte = true;
    }
}
