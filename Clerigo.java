public class Clerigo extends Creyente {

    // Constructor por defecto:
    public Clerigo() {
        super();
    }

    // Constructor por parámetros:
    public Clerigo(String nombre, String raza, int nivel, int vitalidad, int fuerza, int agilidad, int fortaleza, int resistMag, int fe, boolean estado) {
        super(nombre, raza, nivel, vitalidad, fuerza, agilidad, fortaleza, resistMag, fe, estado);
    }

    // Métodos getter heredados de la clase Personaje y Creyente

    // Método subirNivel() sobrescrito:
    @Override
    public void subirNivel() {
        super.subirNivel(); // Incrementa las estadísticas básicas

        // Probabilidad del 80% de aumentar la fe en un 80% (160%)
        if (Math.random() < 0.8) {
            fe += fe * 1.6;
        }

        // Probabilidad del 80% de aumentar la resistencia mágica en un 80% (160%)
        if (Math.random() < 0.8) {
            resistMag += resistMag * 1.6;
        }

        // Probabilidad del 20% de aumentar la vida en un 50% (50%)
        if (Math.random() < 0.2) {
            vitalidad += vitalidad * 0.5;
        }

        // Probabilidad del 20% de aumentar la armadura en un 50% (50%)
        if (Math.random() < 0.2) {
            fortaleza += fortaleza * 0.5;
        }

        // Probabilidad del 10% de aumentar el ataque en un 25% (25%)
        if (Math.random() < 0.1) {
            fuerza++;
        }
    }

    // Método plegaria(int, String) sobrescrito:
    @Override
    public int plegaria(int tipoPlegaria, String Objetivo) {
        int plegaria = 0;
        switch (tipoPlegaria) {
            case 1:
                plegaria = setVitalidad(getFe() * 70 / 100);
                break;
            case 2:
                plegaria = setVitalidad(getFe() * 35 / 100);
                break;
            case 3:
                plegaria = setVitalidad(getFe() * 55 / 100);
                break;
        }

        return tipoPlegaria;
    }

    public int luchar(int hechizo) {
        if (hechizo == 3) {
            return plegaria(hechizo, "Enemigo");
        } else {
            System.out.println("Fallo al lanzar el hechizo");
        }
        return hechizo;
    }
}
