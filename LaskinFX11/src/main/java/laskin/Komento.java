package laskin;

public abstract class Komento {
    protected IO io;
    public Komento(IO io) {
        this.io = io;
    }

    public abstract void suorita();
}
