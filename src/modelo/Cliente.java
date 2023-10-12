
package modelo;

public class Cliente {
    private String cedula;
    
    public Cliente(){
        this.cedula="";
    }
    public Cliente(String cedula){
        this.cedula=cedula;
    }
    public String getCedula(){
        return this.cedula;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    @Override
    public String toString(){
        return "CC:{"+this.cedula;
    }
}
