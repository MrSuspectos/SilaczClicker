package silaczclicker;

public class Odzywka extends Zasoby {
    private final int potrzebneklik;
    private int obecneklik = 0;

    public Odzywka(String nazwa, int potrzebneklik) {
        super(nazwa);
        this.potrzebneklik = potrzebneklik;
    }

    public boolean kliknij() {
        if (zuzyte) return false;
        obecneklik++;
        if (obecneklik >= potrzebneklik) {
            zuzyte = true;
            return true;
        }
        return false;
    }

    public int getPostep() {
        return obecneklik * 100 / potrzebneklik;
    }

    public void wzmocnienie(Silacz silacz) {
        silacz.sila += 10;
    }

    @Override
    public void uzyj(Silacz silacz) {
        if (!zuzyte) {
            wzmocnienie(silacz);
            zuzyte = true;
        }
    }
}
