

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(10, 20));
        figuras.add(new Circulo(10));
        System.out.println("El area total de las figuras es: " + CalculadorArea.calcularAreaTotal(figuras));
    }
}
