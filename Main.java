public class Main {
    public static void main(String[] args) {
        // Usamos el adaptador como si fuera el servicio normal
        FacturaService servicio = new BillingAdapter();

        System.out.println("--- REGISTRO DE PEDIDO PARA TIENDA MINORISTA ---");
        
        // Ejecutamos la lógica de la Historia de Usuario
        servicio.emitirFactura("Jose Fabrizio", 1500.00);
        
        System.out.println("--- PROCESO FINALIZADO CON ÉXITO ---");
    }
}
