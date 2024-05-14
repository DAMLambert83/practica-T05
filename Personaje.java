public abstract class Personaje {
    String nombre;
    String raza;
    int nivel;
    int vitalidad;
    int fuerza;     //Ataque
    int agilidad;   //Velocidad
    int fortaleza;  //Arnadura
    int resistMag;  //Resistencia Mágica
    boolean estado; //Vivo o muerto

    //Contructor por defecto:
    public Personaje() {
        this.nombre = "";
        this.raza = "";
        this.nivel = 1;
        this.vitalidad = 100;
        this.fuerza = 10;
        this.agilidad = 10;
        this.fortaleza = 10;
        this.resistMag = 10;
        this.estado = true;
    }

    //Constructor por parametros:
    public Personaje(String nombre, String raza, int nivel, int vitalidad, int fuerza, int agilidad, int fortaleza, int resistMag, boolean estado) {
        this.setNombre(nombre);
        this.setRaza(raza);
        this.nivel = nivel;
        this.vitalidad = vitalidad;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.fortaleza = fortaleza;
        this.resistMag = resistMag;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    //El nombre del personaje debe tener, como mínimo, cuatro caracteres.
    //Si el Personaje tiene apellidos, se mostrará sin espacios junto al nombre.
    public void setNombre(String nombre) {
        nombre = nombre.replace(" ", "");
        if (nombre.length() >= 4) {
            this.nombre = nombre;
        } else {
            System.out.print("El nombre debe tener al menos cuatro caracteres.\n");
        }
    }

    public String getRaza() {
        return raza;
    }

    //Con el objetivo de no ofender a organizaciones religiosas,
    //la raza del personaje no puede ser ni “ángel” ni “demonio”.
    public void setRaza(String raza) {
        if (!raza.equals("angel") && !raza.equals("demonio"))
            this.raza = raza;
        else {
            System.out.print("La raza no puede ser ni angel ni demonio. \n");
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public int setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
        return vitalidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getResistMag() {
        return resistMag;
    }

    public void setResistMag(int resistMag) {
        this.resistMag = resistMag;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean suEstado(){
        setEstado(vitalidad > 0);
        return estado;
    }

    public void suEstado(boolean estado){
        this.estado = estado;
    }

    //Método para subir de nivel:
    public void subirNivel() {
        nivel++;
        vitalidad += vitalidad * 0.1;
        if (Math.random() < 0.5) {
            fuerza += nivel;
            agilidad += nivel;
            fortaleza += nivel;
            resistMag += nivel;
        }
    }

    //Método para luchar
    public int luchar() {
        return fuerza; // Devuelve el valor de fuerza del personaje como el daño a realizar
    }

    //Método para defender
    public int defender(int danio, String tipo) {
        int defensa = 0;
        if (tipo.equals("fisico")) {
            defensa = fortaleza;
        } else if (tipo.equals("magico")) {
            defensa = resistMag;
        }
        int danioReal = danio - defensa;
        if (danioReal > 0) {
            vitalidad -= danioReal;
            if (vitalidad <= 0) {
                estado = false; // El personaje ha muerto
            }
        }
        return defensa;
    }
    @Override
    public String toString () {
        return "Nombre = " + nombre + '\n' + "Raza = " + raza + '\n' +
                "Nivel = " + nivel + '\n' + "Vitalidad = " + vitalidad + '\n' +
                "Fuerza = " + fuerza + '\n' + "Agilidad = " + agilidad + '\n' +
                "Fortaleza = " + fortaleza + '\n' + "Resistencia Mágica = " + resistMag + '\n' +
                "Estado = " + estado + '\n';
            }
        }
