package silaczclicker;

import java.util.*;

public class Symulacja {
    private int czas;
    private List<Wydarzenie> lista_wydarzen;
    private Silacz silacz;
    private Masazysta masazysta;
    private Odzywka odzywka;
    private Sprzet_treningowy sprzet;

    public Symulacja(int czas_symulacji) {
        this.czas = czas_symulacji;
        this.lista_wydarzen = new ArrayList<>();
        this.silacz = new Silacz("Jan", "Siłacz");
        this.masazysta = new Masazysta("Adam", "Masazysta");
        this.odzywka = new Odzywka("Białko", 5);
        this.sprzet = new Sprzet_treningowy("Sztanga");
    }

    public void krok_symulacji() {
        // Przykładowy krok symulacji
        Trening trening = new Trening(3, 10, "Siłowy");
        trening.wykonaj_trening(silacz);
        odzywka.uzyj(silacz);
        sprzet.uzyj(silacz);
        masazysta.masuj(silacz);
    }

    public void start() {
        for (int i = 0; i < czas; i++) {
            krok_symulacji();
        }
        System.out.println("Siła końcowa siłacza: " + silacz.sila);
    }
}
