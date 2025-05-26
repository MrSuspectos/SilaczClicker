package silaczclicker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Przeciwnicy extends Silacz {
    private final List<Silacz> listaPrzeciwnikow;
    private static final Random random = new Random();
    private static final String[] IMIONA = {"Jan", "Adam", "Marek", "Tomasz", "Krzysztof"};
    private static final String[] NAZWISKA = {"Nowak", "Kowalski", "Wiśniewski", "Wójcik", "Kamiński"};

    public Przeciwnicy(double silaBazowa) {
        super("Generator", "Przeciwników");
        this.sila = (int)silaBazowa;
        this.listaPrzeciwnikow = new ArrayList<>();
        wygenerujPrzeciwnikow();
    }

    private void wygenerujPrzeciwnikow() {
        for (int i = 0; i < 5; i++) {
            Silacz przeciwnik = new Silacz(
                IMIONA[random.nextInt(IMIONA.length)],
                NAZWISKA[random.nextInt(NAZWISKA.length)]
            );
            przeciwnik.sila = (int)(this.sila * (0.5 + 0.55 * random.nextDouble()));
            listaPrzeciwnikow.add(przeciwnik);
        }
    }

    public List<Silacz> pobierzPrzeciwnikow() {
        return new ArrayList<>(listaPrzeciwnikow);
    }

    public void ustawNowaSileBazowa(double nowaSila) {
        this.sila = (int)nowaSila;
        // Można dodać automatyczne przegenerowanie przeciwników
    }

    @Override
    public void dzialanie() {
        // Przeciwnicy nie mają własnego działania
    }
}
