package AtenClientes;

import java.util.*;

public class Llamada {
    public Llamada() {
    }
    
    private int idAsesor;
    private int idCliente;
    private int idLlamada;

    public int getIdAsesor() {
        return this.idAsesor;
    }
    public void setIdAsesor(int idAsesor) {
        this.idAsesor = idAsesor;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLlamada() {
        return this.idLlamada;
    }
    public void setIdLlamada(int idLlamada) {
        this.idLlamada = idLlamada;
    }

    public void iniciarLlamada() {
        System.out.println("Llamada iniciada...\n");
    }

    public String toString(){
        String cad = "idClinte: " + getIdCliente();
        cad += "\nidAsesor: " + getIdAsesor();
        cad += "\nNumero de Llamada: " + getIdLlamada();
        return cad;
    }

}