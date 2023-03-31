
/**
 *Esta clase se encarga de las operaciones al hacer un pago
 * @author Óscar
 */

public class POSNET {



    /**
     * Constante que especifica el recargo por cuotas
     */
    public static final double RECARGOCUOTA=0.03;
    /**
     * Constante que especifica el mínimo de cuotas a realizar
     */
    public static final int MINCUOTAS=1;
    /**
     * Constante que especifica el máximo cuotas a realizar
     */
    public static final int MAXCUOTAS=6;

    /**
     *
     * @param tarjeta
     * @param montoAAbonar
     * @param cantCuotas
     * @return Ticket objeto de ticket que muestra el nombre del titular junto al monto final y el monto por cuotas
     */
    public Ticket efectuarPago(Tarjeta tarjeta, double montoAAbonar, int cantCuotas){

        Ticket ticket=null;

        if (datosValidos(tarjeta, montoAAbonar, cantCuotas)){
            double montoFinal = montoAAbonar + montoAAbonar*recargoSeguncuotas(cantCuotas);
            if (tarjeta.tieneSaldoDisponible(montoFinal)){
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nombreCompletoTitular();
                double montoPorCuota = montoFinal/cantCuotas;
                ticket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }

        return ticket;
    }

    /**
     *
     * @param cuotas
     * @return double calcula el recargo por cuotas
     */
    private double recargoSeguncuotas(double cuotas){
        return RECARGOCUOTA*cuotas;
    }

    /**
     *
     * @param tarjeta
     * @param monto
     * @param cant
     * @return boolean comprueba que el objeto tarjeta no esté vacío, que el monto sea mayor a 0 y que la cantidad de cuotas esté dentro del límite establecido
     */
    private boolean datosValidos(Tarjeta tarjeta, double monto,
                                 int cant){
        boolean esTarjetaValida= tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotaValida = cant >= MINCUOTAS && cant <= MAXCUOTAS;
        return esTarjetaValida && esMontoValido && cantCuotaValida;
    }
}

