
public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais", 4, "Labrador");
        Gato gato1 = new Gato("Mancha", 1, "Persa");

        Veterinario veterinario = new Veterinario();

        veterinario.curar(perro1);
        veterinario.curar(gato1);
    }
}