
package modelo;

public class Silla {
    private char fila;
    private int numeroFila;
    private Estado estadoSilla;
    private Cliente cliente;
    
    public static enum Estado{
        RESERVADO,DISPONIBLE,VENDIDO;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public Silla(){
        this.fila=' ';
        this.fila=0;
        this.estadoSilla=Estado.DISPONIBLE;
        this.cliente=new Cliente();
    }
    public Silla(char fila, int numeroFila, Estado estadoSilla, Cliente cliente){
        this.fila=fila;
        this.numeroFila=numeroFila;
        this.estadoSilla=estadoSilla;
        this.cliente=cliente;
    }
    public int getFila(){
        return fila;
    }
    public void setFila(char fila){
        this.fila=fila;
    }
    public int getNumeroFila(){
        return this.numeroFila;
    }
    public void setNumeroFila(int numeroFila){
        this.numeroFila=numeroFila;
    }
    public Estado getEstadoSilla() {
        return estadoSilla;
    }
    public void setEstadoSilla(Estado estadoSilla) {
        this.estadoSilla=estadoSilla;// disponible, reservado o vendido
    }
    @Override
    public String toString(){
        return "SILLAS:{"+this.fila+this.numeroFila+",ESTADO:{"+this.estadoSilla;
    }
}
