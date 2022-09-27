package AtenClientes;

import java.util.*;

public class Cliente {

    public Cliente() {
    }

    private int idCliente;
    private String nombre;
    private String correo;
    private String telefono;

    public int getIdCliente() {
        return this.idCliente;
    }
    public void setIdCliente(int idCliente) {
       this.idCliente = idCliente;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void pedirDatos() {
        Scanner x = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Ingresa nombre: ");
        setNombre(x.nextLine());
        System.out.print("Ingresa correo: ");
        setCorreo(x.nextLine());
        System.out.print("Ingresa telefono: ");
        setTelefono(x.nextLine());
        setIdCliente(r.nextInt(1000));
    }

    public String toString() {
        String cad = "\n\tCliente";
        cad += "\nNombre: " + getNombre();
        cad += "\nCorreo: " + getCorreo();
        cad += "\nTelefono: " + getTelefono();
        cad+= "id: " + getIdCliente();
        return cad;
    }

    public void pedirAtencion() {
        System.out.println("Solicitando atencion, espere un momento por favor...\n");
    }

}