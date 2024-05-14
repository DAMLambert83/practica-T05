public class Cazador extends Personaje {

    private CompiAnimal animal;

    public Cazador(){
        super();
    }

    public Cazador(String nombre, String raza, int nivel, int vitalidad, int fuerza, int agilidad, int fortaleza, int resistMag, boolean estado, String  nombreAnimal, String razaAnimal) {
        super(nombre, raza, nivel, vitalidad, fuerza, agilidad, fortaleza, resistMag, estado);
        setAnimal(nombreAnimal, razaAnimal);
    }

    public CompiAnimal getAnimal() {
        return animal;
    }

    public void setAnimal(String nombre, String raza) {
        animal = new CompiAnimal(nombre, raza);
    }

    @Override
    public void subirNivel() {
        super.subirNivel();
        double aleatorio = Math.random() * 100;
        if(aleatorio >= 0.0 && aleatorio <= 50.0){
            setVitalidad(getVitalidad() * 40 / 100);
            setFuerza(getFuerza() * 2);
            setAgilidad(getAgilidad() * 70 / 100);
            setFortaleza(getFortaleza() * 40 / 100);
            setResistMag(getResistMag() * 40 / 100);
        }
    }

    @Override
    public int luchar() {
        return getFuerza() + this.animal.getFuerza();
    }

    @Override
    public String toString() {
        return "Cazador: \n" + super.toString() + "\n" + animal.toString();
    }

    //Clase anidada para el compañero animal.
    public class CompiAnimal extends Personaje{

        private String especie;

        public CompiAnimal() {
            super();
            especie = "";
        }

        public CompiAnimal(String nombre, String raza) {
            setEspecie(raza);
            setNombre(nombre);
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
            switch (especie){
                case "canido":
                    setVitalidad(getVitalidad()*20/100);
                    setFuerza(getFuerza()*20/100);
                    setAgilidad(getAgilidad()*20/100);
                    setFortaleza(getFortaleza()*20/100);
                    setResistMag(getResistMag()*20/100);
                    break;
                case "felino":
                    setVitalidad(getVitalidad()*15/100);
                    setFuerza(getFuerza()*30/100);
                    setAgilidad(getAgilidad()*30/100);
                    setFortaleza(getFortaleza()*15/100);
                    setResistMag(getResistMag()*15/100);
                    break;
                case "rapaz":
                    setVitalidad(getVitalidad()*5/100);
                    setFuerza(getFuerza()*15/100);
                    setAgilidad(getAgilidad()*35/100);
                    setFortaleza(getFortaleza()*5/100);
                    setResistMag(getResistMag()*25/100);
                    break;
            }
        }

        public String toString() {
            return "Compañero animal: \n" + super.toString();
        }
    }
}
