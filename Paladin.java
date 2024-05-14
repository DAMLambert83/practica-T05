public class Paladin extends Creyente {

    // Constructor por defecto:
    public Paladin() {
        super();
    }

    // Constructor por parámetros:
    public Paladin(String nombre, String raza, int nivel, int vitalidad, int fuerza, int agilidad, int fortaleza, int resistMag, int fe, boolean estado) {
        super(nombre, raza, nivel, vitalidad, fuerza, agilidad, fortaleza, resistMag, fe, estado);
    }

    // Métodos getter heredados de la clase Personaje y Creyente

    // Método subirNivel() sobrescrito:
    @Override
    public void subirNivel() {
        super.subirNivel(); // Incrementa las estadísticas básicas

        // Probabilidad de aumentar la armadura en un 70% el doble de lo habitual (140%)
        if (Math.random() < 0.2) {
            fortaleza += fortaleza * 1.4;
        }

        // Probabilidad del 50% de aumentar la vida en un 5% adicional
        if (Math.random() < 0.5) {
            vitalidad += vitalidad * 0.05;
        }

        // Probabilidad del 60% de aumentar el ataque
        if (Math.random() < 0.6) {
            fuerza++;
        }

        // Probabilidad del 15% de aumentar la velocidad en un cuarto de lo habitual (25%)
        if (Math.random() < 0.15) {
            agilidad += agilidad * 0.25;
        }

        // Probabilidad del 30% de aumentar la fe
        if (Math.random() < 0.3) {
            fe++;
        }
    }

    // Método plegaria(int, String) sobrescrito:
    @Override
    public int plegaria(int tipoPlegaria, String objetivo) {
        switch (tipoPlegaria) {
            case 1: // Imbuir arma
                if (objetivo != null) {
                    Personaje p = buscarPersonaje(objetivo);
                    if (p != null) {
                        p.setFuerza((int) (p.getFuerza() + fe * 0.8));
                        System.out.println("¡Fe imbuida en el arma de " + objetivo + "!");
                    } else {
                        System.out.println("Objetivo no encontrado.");
                    }
                } else {
                    System.out.println("Se requiere un objetivo para Imbuir arma.");
                }
                break;
            case 2: // Baluarte de fe
                fortaleza += fe * 0.3;
                System.out.println("¡Armadura aumentada por la fe!");
                break;
            default:
                System.out.println("Tipo de plegaria no válido.");
        }
        return tipoPlegaria;
    }

    // Método toString() sobrescrito:
    @Override
    public String toString() {
        return "Paladín: \n" + super.toString() + "\n" + "Estado de Plegaria: " + (plegariaEnCurso ? "En curso" : "Inactiva") + "\n";
    }

    // Atributo para indicar si hay una plegaria en curso
    private boolean plegariaEnCurso = false;

    // Método auxiliar para buscar un personaje por su nombre
    private Personaje buscarPersonaje(String nombre) {
        // Implementar la lógica para buscar un personaje por su nombre
        // (por ejemplo, recorriendo una lista de personajes)
        return null; // Personaje no encontrado por defecto
    }
}
