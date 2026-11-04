public class Dueno {
}//Atributos
private String nombre;
private String telefono;


//constructor
public Dueno(String nombre, String telefono){
    this.nombre = nombre;
    this.telefono = telefono;

}
//Metodos de accesos
//Get and set
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setTelefono(String telefono){
this.telefono = telefono;
}
}