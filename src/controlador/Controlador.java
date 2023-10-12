package controlador;

import java.util.ArrayList;
import modelo.*;

public interface Controlador {

    //tarjeta
    public boolean crearTarjeta(String cedula);
    public Tarjeta buscarTarjeta(String cedula);
    public void recargarTarjeta(String cedula);
    public boolean pagarTarjeta(Tarjeta tarjeta, int pago);

    //reserva
    public boolean crearReserva(String cedula, ArrayList<String> sillas);
    public boolean buscarReserva(String cedula);

    //dashboard
    public Dashboard informe(double dineroCaja, int sillasDisponibles, int sillasVendidas);
    
}
