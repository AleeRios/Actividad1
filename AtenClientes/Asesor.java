package AtenClientes;

import java.util.*;

public class Asesor {

    public Asesor() {
    }

    private int idAsesor;
    private String nombre;
    private String apellido;

    public int getIdAsesor() {
        return this.idAsesor;
    }
    public void setIdAsesor(int idAsesor) {
        this.idAsesor = idAsesor;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String toString() {
        String cad = "\n\tAsesor";
        cad += "\nNombre: " + getNombre();
        cad += "\nApellido: " + getApellido();
        cad += "\nid: " + getIdAsesor();
        return cad;
    }

    public void pedirDatos() {
        String[] nom = {"Lucas", "Maria", "Nicolas", "Lorena", "Alexander", "Alma"};
        String[] ape = {"Vazquez", "Montes", "Sanchez", "Orozco", "Vega", "Calderon"};
        int[] id = {654, 743, 105, 892, 308, 561};
        Random r = new Random();
        int al = r.nextInt(nom.length);
        setNombre(nom[al]);
        setApellido(ape[al]);
        setIdAsesor(id[al]);
    }
    public void asesorar() {
        System.out.print("Conectando con el cliente...\n");
    }

}