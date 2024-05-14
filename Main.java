public class Main {
    public static void main(String[] args) {
        /*
        //Crear un objeto de la clase Personaje con el constructor por defecto
        Personaje personaje1 = new Personaje("Boromir","Humano",1,10,10,10,10,10,true);

        //Establecer el nombre y la raza del personaje
        personaje1.setNombre("Voromir");
        personaje1.setRaza("Humano");

        //Imprimir los detalles del personaje
        System.out.println(personaje1.toString());

        //Crear un objeto de la clase Personaje con el constructor con parámetros
        Personaje personaje2 = new Personaje();

        //Establecer el nombre y la raza del personaje
        personaje2.setNombre("Alf");
        personaje2.setRaza("demonio");

        //Imprimir los detalles del personaje
        System.out.println(personaje2.toString());
        */


        /*
        Pruebas Guerrero:
        //Crear un objeto Guerrero usando el constructor por defecto
        Guerrero guerrero1 = new Guerrero();
        guerrero1.setNombre("Thanos");
        guerrero1.setRaza("Titán");

        Guerrero guerrero2 = new Guerrero();
        guerrero2.setNombre("Anthony");
        guerrero2.setRaza("Vengador");

        System.out.println(guerrero1.toString());
        System.out.println(guerrero2.toString());

        //Método setFuria()
        guerrero1.setFuria(true);
        System.out.println("Estado de furia después: " + guerrero1.esFuria());
        System.out.println("Estado de furia después: " + guerrero2.esFuria());

        //Método subirNivel()
        guerrero1.subirNivel();
        System.out.println("Estado del guerrero después de subir de nivel: ");
        System.out.println(guerrero1.toString());
        System.out.printf(guerrero2.toString());

        //Métodos luchar() y defender()
        int danio = guerrero1.luchar();
        System.out.println("Daño causado por el guerrero: " + danio);
        int vitalidadRestante = guerrero1.defender(danio, "fisico");
        System.out.println("Vitalidad restante después de defender: " + vitalidadRestante);

        Ladron ladron1 = new Ladron();
        System.out.println(ladron1.toString());
        */

        //Personaje personaje1 = new Personaje("Lambert","Humano",7,10,10,10,10,10,true);

        //Personaje personaje2 = new Personaje("Eufrasio", "Elfo",5,5,5,5,5,5,true);

        Guerrero guerrero1 = new Guerrero("Leonidas", "Humano", 10, 8, 9, 7, 8, 2, true, true);

        Mago mago1 = new Mago("Strange", "Hechicero", 10, 10, 7, 8, 10, 10, true, 10);

        Cazador cazador1 = new Cazador("Orión", "Griego", 9, 9, 9, 9, 9, 9, true, "Chui", "canido");

        Combate combate = new Combate(cazador1, mago1);
        combate.Pelea();
    }
}