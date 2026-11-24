
/**
 * Estadísticas de la clase Calculadora
 * 
 * @author Marina 
 * @version 1.0
 */
public class CalculadoraEstadisticas{
    /*
     * Método que calcula la media entre el total del dinero y el número de artículos
     * @param totalDinero: el dinero total 
     * @param totalArticulos: el número total de artículos
     */
    public void calcularPrecioMedio(double totalDinero, int totalArticulos){
        double media = totalDinero / totalArticulos;
        
        System.out.println("--- Cálculo de media (Double / Int) ---");
        System.out.println("Total dinero: " + totalDinero);
        System.out.println("Total artículos: " + totalArticulos);
        System.out.println("Precio medio por artículo: " + media);
        System.out.println("------------------------------");
    }
    
    /*
     * Mismo método pero con ENTEROS
     */
    public void calcularPrecioMedioEnteros(int totalDinero, int totalArticulos){
        double media = totalDinero / totalArticulos;
        
        System.out.println("--- Cálculo de media (Double / Int) ---");
        System.out.println("Total dinero: " + totalDinero);
        System.out.println("Total artículos: " + totalArticulos);
        System.out.println("Resultado inesperado: " + media);
        System.out.println("------------------------------");
    }
}