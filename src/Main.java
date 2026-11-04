/**
 * Clase Main: punto de entrada del programa. Aquí creamos y usamos objetos.
 */
public class Main {

    // main: el método donde empieza a ejecutarse el programa.
    public static void main(String[] args) {

        // 1. Crear objetos con "new" (cada uno es una instancia de su clase)
        Dueno ana = new Dueno("Ana", "3001234567");
        Dueno luis = new Dueno("Luis", "3109876543");

        Perro rocky = new Perro("Rocky", 3, ana, "Labrador");
        Gato misu = new Gato("Misu", 2, luis, true);

        // 2. Operador punto: acceder a métodos y atributos de un objeto
        System.out.println("Nombre: " + rocky.getNombre());
        System.out.println("Raza: " + rocky.getRaza());
        System.out.println("Dueño de Misu: " + misu.getDueno().getNombre());

        // 3. Métodos set: cambiar el estado de un objeto
        rocky.setEdad(4);
        ana.setTelefono("3200000000");
        System.out.println("Rocky ahora tiene " + rocky.getEdad() + " años");

        // 4. Relación entre clases: la Veterinaria guarda Mascotas
        Veterinaria vet = new Veterinaria();
        vet.registrar(rocky);
        vet.registrar(misu);
        vet.listar();

        // 5. Herencia + polimorfismo: misma llamada, resultados distintos
        vet.pasarRevista();
    }
}