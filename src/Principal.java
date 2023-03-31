
/**
 * La clase main donde se instancian el resto de clases
 * @author Óscar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        POSNET posnet = new POSNET();
        Titular p = new Titular("36545689", "Pepe", "Gomez", 698547856, "pepe@gmail.com");
        Tarjeta t = new Tarjeta("FakeBank", "123465789987", 1500, EntidadFinanciera.BIRZA, p);
        System.out.println();
        System.out.print("Tarjeta antes del pago: ");
        System.out.println(t);

        Ticket ticketGenerado = posnet.efectuarPago(t, 800, 5);

        System.out.print("Ticket generado: ");
        System.out.println(ticketGenerado);

        System.out.print("Tarjeta despues del pago: ");
        System.out.println(t);

    }


}
