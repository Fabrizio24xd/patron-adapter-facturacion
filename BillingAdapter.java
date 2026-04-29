public class BillingAdapter implements FacturaService {
    private LegacyBillingSystem legacySystem;

    public BillingAdapter() {
        this.legacySystem = new LegacyBillingSystem();
    }

    @Override
    public void emitirFactura(String cliente, double monto) {
        // Adaptación de datos
        String formatoAntiguo = "CLI=" + cliente + ";TOTAL=" + monto;
        // Llamada al método incompatible
        legacySystem.generate_invoice_old_format(formatoAntiguo);
        System.out.println("[Adapter] Confirmación: Factura generada para " + cliente);
    }
}
