
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Reserva extends Cliente implements Serializable{
    ArrayList<String> sillas = new ArrayList<>();
    public Reserva(){
        this.sillas=new ArrayList<>();
    }
    public Reserva(String cedula, ArrayList<String> sillas){
        super.setCedula(cedula);
        this.sillas=sillas;
    }
    public ArrayList<String> getSillas(){
        return this.sillas;
    }
    public void setSillas(ArrayList<String> sillas){
        this.sillas=sillas;
    }
    @Override
    public String toString(){
        return "RESERVA:{"+super.toString()+", SILLAS:{"+this.sillas;
    }
}
