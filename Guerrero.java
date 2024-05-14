public class Guerrero extends Personaje {

    private boolean furia;

    public Guerrero() {
        super();
        this.furia = false;
    }

    public Guerrero(String nombre, String raza, int nivel, int vitalidad, int fuerza, int agilidad, int fortaleza, int resistMag, boolean estado, boolean furia) {
        super(nombre, raza, nivel, vitalidad, fuerza, agilidad, fortaleza, resistMag, estado);
        this.furia = furia;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
        return vitalidad;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public void setResistMag(int resistMag) {
        this.resistMag = resistMag;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean esFuria() {
        return furia;
    }

    public void setFuria(boolean furia) {
        double aleatorio = Math.random()*100; //Número aleatorio entre 0 y 100.
        if(aleatorio > 0.0 && aleatorio < 50.0){ //SI el nº aleatorio es >0 y <50, furia se pone a false.
            furia = false;
        }else
            furia = true; //Si esta es >= 50, se pone a true.
        this.furia = furia;
    }

    @Override
    public void subirNivel() {
        setNivel(getNivel() + 1);
        setVitalidad((int) (getVitalidad() * 1.1)); //Aumenta siempre el 10% de su valor actual.
        if (Math.random() < 0.8) { //80% de probabilidad,
            setFuerza(getFuerza() + getNivel() * 2); //Incrementa el doble de lo habitual.
        }
        if (Math.random() < 0.75) { //75% de probabilidad.
            setFortaleza(getFortaleza() + getNivel()); //Incrementa lo habitual.
        }
        if (Math.random() < 0.2) { //20% de probabilidad.
            setResistMag(getResistMag() + getNivel() / 2); //Mejora la mitad de lo habitual.
        }
    }

    @Override
    public int luchar() {
        return esFuria() ? getFuerza() * 2 : getFuerza();
    }

    @Override
    public int defender(int danio, String tipo) {
        int defensa = tipo.equals("fisico") ? getFortaleza() : getResistMag();
        int danioFinal = danio - defensa;
        if (esFuria()) {
            danioFinal *= 2;
        }
        if (danioFinal > 0) {
            setVitalidad(getVitalidad() - danioFinal);
        }
        return getVitalidad();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Furia = " + furia + '\n';
    }
}
