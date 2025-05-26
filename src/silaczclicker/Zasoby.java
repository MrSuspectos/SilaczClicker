package silaczclicker;

public abstract class Zasoby {
    protected final String nazwa;
    protected boolean zuzyte = false;

    public Zasoby(String nazwa) {
        this.nazwa = nazwa;
    }

    public abstract void uzyj(Silacz silacz);
    public boolean czyZuzyte() { return zuzyte; }
}
