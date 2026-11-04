public abstract class Mascota {
    //Atributos
    private String nombre;
    private String especie;
    private int edad;
    //relacion con el dueño
    private Dueno dueno;
    //constructor
    public Mascota(String nombre, String especie,
                   int edad, Dueno dueno){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.dueno = dueno;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public Dueno getDueno(){
        return dueno;
    }
    public abstract void hacerSonido ();
    @Override
    public String toString() {
        return nombre + "(" + especie + " , "
                + edad + "años)" +
                "-Dueño:" + dueno.getNombre();
    }
}

