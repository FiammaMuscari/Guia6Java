
import java.util.ArrayList;

public class CalculadorArea {
    public static double calcularAreaTotal(ArrayList<Figura> figuras) {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.area();
        }
        return areaTotal;
    }
}