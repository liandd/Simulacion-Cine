
package controlador;

import java.util.ArrayList;
import modelo.*;

public class ControladorImp {
    public static ArrayList<Tarjeta> tarjetasClientes = new ArrayList<>();
    public static ArrayList<Reserva> reservas = new ArrayList<>();
    public Silla sillas = new Silla();
    public Dashboard info = new Dashboard();
    public Archivo file = new Archivo();
    public ArchivoInfo file1 = new ArchivoInfo();
    public boolean crearTarjeta(String cedula) {
        try {
            tarjetasClientes = file.leerArchivo("Tarjetas");
            if (tarjetasClientes == null) {
                tarjetasClientes = new ArrayList<>();
            }
            boolean buscar = buscarTarjeta(cedula);
            if (buscar) {
                return false; 
            }
            Tarjeta tar = new Tarjeta(100000,0.1,cedula);
            tar.setSaldo(100000);
            tar.setCedula(cedula);
            tarjetasClientes.add(tar);
            file.guardarArchivo(tarjetasClientes, "Tarjetas");
            return true; 
        } catch (Exception e) {    
        }
        return false; 
    }
    
    public boolean buscarTarjeta(String cedula) {
        if(tarjetasClientes==null){
            tarjetasClientes = file.leerArchivo("tarjeta");
        }
        if(tarjetasClientes!=null){
            for (Tarjeta i : tarjetasClientes) {
                if (i.getCedula().equals(cedula)) {
                    //JOptionPane.showMessageDialog(null, "¡YA EXISTE!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void recargarTarjeta(String cedula) {
        int suma = 100000;
        tarjetasClientes = file.leerArchivo("Tarjetas");
        for (Tarjeta i : tarjetasClientes) {
            if (i.getCedula().equals(cedula)) {
                suma += i.getSaldo();
                i.setSaldo(suma);
            }
        }
        file.guardarArchivo(tarjetasClientes, "Tarjetas");
    }
    
    public boolean pagarTarjeta(Tarjeta tarjeta, int pago) {
        if (tarjeta != null) {
            int saldoActual = tarjeta.getSaldo();
            if(saldoActual>=pago){
                tarjetasClientes = file.leerArchivo("Tarjetas");
                int nuevoSaldo = saldoActual - pago;
                tarjeta.setSaldo(nuevoSaldo);
                file.guardarArchivo(tarjetasClientes, "Tarjetas");
                return true; 
            }
        }
        return false;
    }
    
    public boolean crearReserva(String cedula, ArrayList<String> sillas) {
        try {
            if (reservas == null) {
                reservas = file.leerArchivo("Reservas");
            }
            if (reservas == null) {
                reservas = new ArrayList<>();
            }
            boolean reservaExistente = buscarReserva(cedula);
            if (!reservaExistente) {
                Reserva e = new Reserva(cedula, sillas);
                reservas.add(e);
                file.guardarArchivo(reservas, "Reservas");
                return true; 
            }
            return false; 
        } catch (Exception e) {
            
        }
        return false;
    }
    
    public boolean buscarReserva(String cedula) {
        try {
            if (reservas == null) {
                reservas = file.leerArchivo("Reservas");
            }
            if (reservas != null) {
                for (Reserva i : reservas) {
                    if (cedula.equals(i.getCedula())) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
        }
        return false; 
    }   

    public Dashboard informe(int dinero, int disp, int vend) {
    try {
        if (info == null) {
            info = file1.leerArchivoInfo("Informe");
        }

        if (info == null) {
            info = new Dashboard(dinero, disp, vend);
        } else {
            info.setDineroEnCaja(dinero);
            info.setSillasDisponibles(disp);
            info.setSillasVendidas(vend);
        }

        file1.guardarArchivoInfo(info, "Informe");
        return info;
    } catch (Exception e) {
    }
    return info;
    }
}
