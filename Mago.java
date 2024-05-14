public class Mago extends Personaje {
    private int magia;
    private String aliado;

    public Mago() {
        super();
        this.magia = 10;
    }

    public Mago(String nombre, String raza, int nivel, int vitalidad, int fuerza, int agilidad, int fortaleza, int resistMag, boolean estado, int magia) {
        super(nombre, raza, nivel, vitalidad, fuerza, agilidad, fortaleza, resistMag, estado);
        this.magia = magia;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }
    public int setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
        return vitalidad;
    }

    public void setFortaleza(int fortaleza){
        this.fortaleza = fortaleza;
    }

    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }

    public void setResistMag(int resistMag){
        this.resistMag = resistMag;
    }

    public void setAgilidad(int agilidad){
        this.agilidad = agilidad;
    }

    @Override
    public void subirNivel() {
        if (Math.random() < 0.9) {
            magia++;
        }
        if (Math.random() < 0.35) {
            setVitalidad((int) (getVitalidad() * 1.1));
            setFortaleza(getFortaleza() + getNivel());
        }
        if (Math.random() < 0.15) {
            setFuerza(getFuerza() + getNivel());
        }
        if (Math.random() < 0.8) {
            setResistMag(getResistMag() + getNivel());
        }
        if (Math.random() < 0.65) {
            setAgilidad(getAgilidad() + getNivel());
        }
    }

    public int lanzarConjuro(int conjuro, String aliado) {
        this.aliado = aliado;
        switch (conjuro) {
            case 1:
                System.out.println("Bola de fuego.");
                return (int) (magia * 0.7); //70% Bola de Fuego.
            case 2:
                System.out.println("Escudo arcano.");
                return (int) (magia * 0.5); //50% Escudo arcano.
            case 3:
                System.out.println("Presteza mental.");
                return (int) (magia * 0.3); //30% Presteza mental.
            case 4:
                return magia * 2;
            default:
                return 0;
        }
    }

    public int luchar() {
        return magia; // Devuelve el valor de Hechizo del personaje como el daño a realizar.
    }
    public void apoyar(int conjuro, String aliado) {
        if (conjuro == 2 || conjuro == 4) {
            lanzarConjuro(conjuro, aliado);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Magia = " + magia + '\n';
    }
}
