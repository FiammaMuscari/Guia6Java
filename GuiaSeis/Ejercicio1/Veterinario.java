
public class Veterinario {
    public void curar(Animal animal) {
        String mensaje = "El " + animal.getClass().getSimpleName() + " " + animal.getNombre() + " ha sido curado";
        if(animal instanceof Perro) {
            mensaje += ", es de raza " + ((Perro) animal).getRaza();
        } else if(animal instanceof Gato) {
            mensaje += ", es de raza " + ((Gato) animal).getRaza();
        }
        System.out.println(mensaje);
    }
}