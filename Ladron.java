public class Ladron extends Personaje {
    private boolean robar;

    public Ladron() {
        super();
        this.robar = false;
    }

    public Ladron(String nombre, String raza, int nivel, int vitalidad, int fuerza, int agilidad, int fortaleza, int resistMag, boolean estado, boolean robar) {
        super(nombre, raza, nivel, vitalidad, fuerza, agilidad, fortaleza, resistMag, estado);
        this.robar = robar;
    }

    public boolean isRobar() {
        return robar;
    }

    @Override
    public void subirNivel() {
        setNivel(getNivel() + 1);
        setVitalidad((int) (getVitalidad() * 1.1)); //Aumenta siempre el 10% de su valor actual.
        if (Math.random() < 0.85) { //85% de probabilidad,
            setAgilidad(getAgilidad() + getNivel() * 2); //Incrementa el doble de lo habitual.
        }
        if (Math.random() < 0.6) { //60% de probabilidad.
            setFuerza(getFuerza() + getNivel()); //Incrementa lo habitual.
        }
        if (Math.random() < 0.4) { //reduce el 40% en todos los atributos?
            double reduccion = 0.6;
            fortaleza += (int) (nivel * reduccion);//reduce al 40% la fortaleza.
            resistMag += (int) (nivel * reduccion);//reduce el 40% la resistencia mágica.
        }
    }

    public void robar(){
        if(robar == true){
            setFuerza(getAgilidad());
        }
        setFuerza(getFuerza());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Roba = " + robar;
    }
}
