public class Monstruo extends Personaje {

    private String tipo;

    public Monstruo(String orco, String bestia, int i, int i1, int i2, int i3, int i4, int i5, boolean b) {
        super();
        this.tipo = "bestia";
    }

    public Monstruo(String nombre, String raza, int nivel, int vitalidad, int fuerza, int agilidad, int fortaleza, int resistMag, boolean estado, String tipo) {
        super(nombre, raza, nivel, vitalidad, fuerza, agilidad, fortaleza, resistMag, estado);
        if (tipo.equals("bestia") || tipo.equals("no-muerto") || tipo.equals("gigante")) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo de monstruo no válido. Se establece como bestia por defecto.");
            this.tipo = "bestia";
        }
    }

    public String getNombre() {
        return super.getNombre();
    }

    public String getRaza() {
        return super.getRaza();
    }

    public int getNivel() {
        return super.getNivel();
    }

    public int getVitalidad() {
        return super.getVitalidad();
    }

    public int getFuerza() {
        return super.getFuerza();
    }

    public int getAgilidad() {
        return super.getAgilidad();
    }

    public int getFortaleza() {
        return super.getFortaleza();
    }

    public int getResistMag() {
        return super.getResistMag();
    }

    public boolean getEstado() {
        return super.getEstado();
    }

    public String getTipo() {
        return tipo;
    }

    private void calcularEstadisticas() {
        if (tipo.equals("bestia")) {
            fuerza += nivel * 2;
            agilidad += nivel * 2;
            vitalidad += nivel;
            fortaleza -= nivel / 2;
            resistMag -= nivel / 2;
        } else if (tipo.equals("no-muerto")) {
            resistMag += nivel * 4;
            fuerza += nivel;
            vitalidad -= nivel / 2;
            fortaleza -= nivel / 2;
            agilidad -= nivel / 4;
        } else if (tipo.equals("gigante")) {
            vitalidad += nivel * 4;
            fuerza += nivel * 4;
            fortaleza += nivel;
            agilidad -= nivel / 4;
            resistMag -= nivel / 4;
        }
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Monstruo: \n" + super.toString();
    }
}
