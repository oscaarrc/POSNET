/**
 * La clase Ticket genera un ticket al hacer una compra
 * @author Óscar Ramos Castellano
 */
public class Ticket {
    private String nombreApellido;
    private double montoPagar;
    private double montoCuota;

    /**
     *
     * @param nomApe
     * @param montoFinal
     * @param montoPorCuota
     */
    public Ticket(String nomApe, double montoFinal, double montoPorCuota) {
        this.nombreApellido=nomApe;
        this.montoPagar=montoFinal;
        this.montoCuota=montoPorCuota;
    }

    /**
     *
     * @param nombreApellido
     */
    public void setNombreApellidos(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    /**
     *
     * @return String nombre y apellido
     */
    public String getNombreApellido() {
        return nombreApellido;
    }

    /**
     *
     * @param montoPagar
     */

    public void setMontoPagar(double montoPagar) {
        this.montoPagar = montoPagar;
    }

    /**
     *
     * @return double monto a pagar
     */
    public double getMontoPagar() {
        return montoPagar;
    }

    /**
     *
     * @param montoCuota
     */
    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    /**
     *
     * @return double monto por cuota
     */
    public double getMontoCuota() {
        return montoCuota;
    }

    /**
     *
     * @return String genera un ticket en el que se muestra el nombre, el monto a pagar y el monto por cuota
     */
    public String toString() {
        return "\nNombre: " + getNombreApellido() + "\nMonto: " + getMontoPagar() + "\nMonto cuota: " + getMontoCuota() + "\n\n";
    }
}
