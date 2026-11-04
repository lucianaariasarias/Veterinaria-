public class Perro extends Mascota{
    //atributo
    private String raza;
    public Perro(String nombre, int edad,
                 Dueno dueno, String raza){
        super(nombre,  "perro",
                edad,dueno); //llama al constructor del padre
        this.raza = raza;
    }
    public String getRaza(){
        return raza;
    }
    //sobreescribe los metodos del padre
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
    @Override
    public String toString(){
        return super.toString() + " - Raza: " + raza;
    }
}