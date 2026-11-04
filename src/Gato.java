/**
 * close Gato; tambien HEREDA de Mascota, con su propio atributo usaArenero
 */
public class Gato extends Mascota {

    private boolean usaArenero;

    public Gato(String nombfre, int edad, Dueno dueno, boolean usaArenero) {
        super(nombre, "Gato", edad, dueno);
        this.usaArenero = usaArenero;
    }

    public boolean isUsaArenero() {
        return usaArenero;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");

    }
        @Override
        public String toString () {
            return super.toString() + (usaArenero ? "si" : "no");
        }
}