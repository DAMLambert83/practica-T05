public abstract class Creyente extends Personaje {

    public int fe;

    public Creyente() {
        super();
        this.fe = 100;
    }

    public Creyente(String nombre, String raza, int nivel, int vitalidad, int fuerza, int agilidad, int fortaleza, int resistMag, int fe, boolean estado) {
        super(nombre, raza, nivel, vitalidad, fuerza, agilidad, fortaleza, resistMag, estado);
        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public abstract int plegaria(int tipoPlegaria, String objetivo);

    @Override
    public String toString() {
        return "Creyente: \n" + super.toString() + "\n" + "Fe: " + fe + "\n";
    }
}