/**
 * La clase tarjeta se encarga de recopilar los datos del titular y gestionar los datos de la tarjeta
 * @author Óscar
 */
public class Tarjeta {

    private String entidadBancaria;
    private String numero;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Titular datosTitular;

    /**
     *
     * @param entidadBancaria
     * @param numero
     * @param saldo
     * @param entidadFinanciera
     * @param datosTitular
     */
    Tarjeta(String entidadBancaria, String numero, double saldo,
            EntidadFinanciera entidadFinanciera, Titular datosTitular){
        this.entidadBancaria=entidadBancaria;
        this.numero=numero;
        this.saldo=saldo;
        this.entidadFinanciera=entidadFinanciera;
        this.datosTitular=datosTitular;
    }

    /**
     *
     * @return String muestra los datos del titular junto a las de su banco
     */
    public String toString() {
        return "\n\nEntidad Bancaria: " + entidadBancaria + "\nNúmero: " + numero + "\nSaldo: " + saldo + "\nEntidad Financiera: " + entidadFinanciera + "\nTitula: " + datosTitular.nombreCompleto() + "\n\n";
    }

    /**
     *
     * @param monto
     * @return boolean comprueba si el saldo es mayor o igual al monto
     */
    public boolean tieneSaldoDisponible(double monto){return this.saldo >= monto;}

    /**
     * Descuenta el monto pasado por parámetros al saldo
     * @param monto
     */
    public void descontar(double monto){
        saldo-=monto;
    }

    /**
     *
     * @return String el nombre completo del titular
     */
    public String nombreCompletoTitular(){
        return datosTitular.nombreCompleto();
    }

}
