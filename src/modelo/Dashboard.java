
package modelo;

import java.io.Serializable;

public class Dashboard implements Serializable{
    public double dineroEnCaja;
    private int sillasVendidas;
    private int sillasDisponibles;
    
    public Dashboard(){
        this.dineroEnCaja=0;
        this.sillasDisponibles=280;
        this.sillasVendidas=0;
    }
    public Dashboard(double dineroCaja, int sillasVendidas, int sillasDisponibles){
        this.dineroEnCaja=dineroCaja;
        this.sillasDisponibles=sillasDisponibles;
        this.sillasVendidas=sillasVendidas;
    }
    public double getDineroEnCaja(){
        return this.dineroEnCaja;
    }
    public void setDineroEnCaja(double dineroCaja){
        this.dineroEnCaja=dineroCaja;
    }
    public int getSillasVendidas(){
        return this.sillasVendidas;
    }
    public void setSillasVendidas(int sillasVendidas){
        this.sillasVendidas=sillasVendidas;
    }
    public int getSillasDisponibles(){
        return this.sillasDisponibles;
    }
    public void setSillasDisponibles(int sillasDisponibles){
        this.sillasDisponibles=sillasDisponibles;
    }
    @Override
    public String toString(){
        return "INFORMACION GENERAL:{DINERO EN CAJA:{"+this.dineroEnCaja+", SILLAS DISPONIBLES:{"+this.sillasDisponibles+", SILLAS VENDIDAS:{"+this.sillasVendidas;
    }
}
