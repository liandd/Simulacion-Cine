
package modelo;

public class Tarjeta extends Cliente {
    private int saldo;
    private double descuento;
    
    public Tarjeta(){
        this.saldo=0;
        this.descuento=0.1;
    }
    public Tarjeta(int saldo, double descuento,String cedula){
        this.saldo=saldo;
        this.descuento=descuento;
        super.setCedula(cedula);
    }
    public int getSaldo(){
        return this.saldo;
    }
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    @Override
    public String toString(){
        return super.toString()+", SALDO:{"+this.saldo;
    }
}
