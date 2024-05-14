public class Combate {

    private Personaje personaje1;
    private Personaje personaje2;


    public Combate(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }

    public Personaje getPersonaje1() {
        return personaje1;
    }

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public Personaje getPersonaje2() {
        return personaje2;
    }

    public void setPersonaje2(Personaje personaje2) {
        this.personaje2 = personaje2;
    }

    public void Pelea() {
        boolean atacando = true;
        System.out.println("Confrontación:  ");
        while (personaje1.suEstado() && personaje2.suEstado()) {
            if(atacando == true){
                if (personaje1.getAgilidad() >= 2 * personaje2.getAgilidad()) {
                    System.out.println(getPersonaje1().getNombre() + " ataca.");
                    personaje1.luchar();
                    System.out.println("Causó " + getPersonaje1().luchar() + " de daño a su oponente.");
                    personaje2.setVitalidad(getPersonaje2().getVitalidad() - getPersonaje1().getFuerza());
                    System.out.println(getPersonaje2().getNombre() + " ahora tiene " + getPersonaje2().getVitalidad() + " de vida.");

                    System.out.println(getPersonaje1().getNombre() + " volvio a atacar.");
                    personaje1.luchar();
                    System.out.println("Causó " + getPersonaje1().luchar() + " de daño a su oponente.");
                    personaje2.setVitalidad(getPersonaje2().getVitalidad() - getPersonaje1().getFuerza());
                    System.out.println(getPersonaje2().getNombre() + " ahora tiene " + getPersonaje2().getVitalidad() + " de vida.");

                } else{
                    System.out.println(getPersonaje1().getNombre() + " ataca.");
                    personaje1.luchar();
                    System.out.println(getPersonaje1().getNombre() + " realizó " + getPersonaje1().luchar() + " de daño.");
                    personaje2.setVitalidad(getPersonaje2().getVitalidad() - getPersonaje1().getFuerza());
                    System.out.println(getPersonaje2().getNombre() + " ahora tiene " + getPersonaje2().getVitalidad() + " de vida.");
                }
                atacando = false;
            }else {
                if (personaje2.getAgilidad() >= 2 * personaje1.getAgilidad()) {
                    System.out.println(getPersonaje2().getNombre() + " ataca.");
                    personaje2.luchar();
                    System.out.println(getPersonaje2().getNombre() + " realizó " + getPersonaje2().luchar() + " de daño.");
                    personaje1.setVitalidad(getPersonaje1().getVitalidad() - getPersonaje2().getFuerza());
                    System.out.println(getPersonaje1().getNombre() + " ahora tiene " + getPersonaje1().getVitalidad() + " de vida.");

                    System.out.println(getPersonaje2().getNombre() + " Volvio Atacar.");
                    personaje2.luchar();
                    System.out.println(getPersonaje2().getNombre() + " realizó " + getPersonaje2().luchar() + " de daño.");
                    personaje1.setVitalidad(getPersonaje1().getVitalidad() - getPersonaje2().getFuerza());
                    System.out.println(getPersonaje1().getNombre() + " ahora tiene " + getPersonaje1().getVitalidad() + " de vida.");
                } else{
                    System.out.println(getPersonaje2().getNombre() + " ataca.");
                    personaje2.luchar();
                    System.out.println(getPersonaje2().getNombre() + " Hizo " + getPersonaje2().luchar() + " de daño.");
                    personaje1.setVitalidad(getPersonaje1().getVitalidad() - getPersonaje2().getFuerza());
                    System.out.println(getPersonaje1().getNombre() + " ahora tiene " + getPersonaje1().getVitalidad() + " de vida.");
                }
                atacando = true;
            }
        }

        if(personaje1.getVitalidad() <= 0){
            personaje1.setEstado(false);
            System.out.println(toString());
        }else {
            personaje2.setEstado(false);
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        if (personaje1.suEstado()) {
            return "Victoria para " + personaje1.getNombre() + " el " + personaje1.getRaza();
        } else if (personaje2.suEstado()) {
            return "Victoria para " + personaje2.getNombre() + " el " + personaje2.getRaza();
        } else {
            return "Empate";
        }
    }
}