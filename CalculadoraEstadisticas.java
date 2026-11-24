
/**
 * Estadísticas de la clase Calculadora
 * 
 * @author Marina 
 * @version 1.0
 */
public class CalculadoraEstadisticas{
    /**
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
    
    /**
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
    
    /**
     * Calcula los puntos de fidelidad de un pedido
     * Método que trunca los decimales
     */
    public void calcularPuntos(double totalPedido){
        int puntos = (int) totalPedido;
        
        System.out.println("--- Cálculo de puntos (Casting) ---");
        System.out.println("Total del pedido: " + totalPedido);
        System.out.println("Puntos generados (decimales truncados): " + puntos);
        System.out.println("------------------------------");
    }
}