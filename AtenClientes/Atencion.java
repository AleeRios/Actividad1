package AtenClientes;

import java.util.*;

public class Atencion {

    public Atencion() {
    }

    private short evaluacion;
    private int idAsesor;
    private int idCliente;
    private static Cliente cliente;
    private static Asesor asesor;
    private static Llamada llamada;
    private static Chat chat;

    public short getEvaluacion() {
        return this.evaluacion;
    }
    public void setEvaluacion(short evaluacion){
        this.evaluacion = evaluacion;
    }

    public int getIdAsesor() {
        return this.idAsesor;
    }
    public void setIdAsesor(int idAsesor) {
        this.idAsesor = idAsesor;
     }
     
    public int getIdCliente() {
        return this.idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void atender() {
        System.out.println("Usted esta siendo atendido por un asesor");
    }

    public String toString(){
        String cad = "idClinte: " + getIdCliente();
        cad += "\nidAsesor: " + getIdAsesor();
        return cad;
    }

    public static void main(String[] args) {
        int op = 0;
        Scanner x = new Scanner(System.in);
        asesor = new Asesor();
        cliente = new Cliente();
        while(op != 3){
            Random r = new Random();
            System.out.println("\n\tMenu de atencion");
            System.out.println("1.- Atencion por llamada");
            System.out.println("2.- Atencion por Chat");
            System.out.println("3.- Salir");
            System.out.print("Ingresa una opcion: ");
            op = x.nextInt();
            System.out.println();

            switch(op){
                case 1: 
                    chat = new Chat();
                    asesor.pedirDatos();
                    cliente.pedirDatos();
                    chat.setIdAsesor(asesor.getIdAsesor());
                    chat.setIdCliente(cliente.getIdCliente());
                    chat.setIdChat(r.nextInt(1000));
                    cliente.pedirAtencion();
                    asesor.asesorar();
                    chat.iniciarChat();
                    System.out.println("Id del Chat: " + chat.getIdChat());
                    System.out.println("Id Cliente: " + chat.getIdCliente());
                    System.out.println(asesor);
                break;
                case 2:
                    llamada = new Llamada();
                    asesor.pedirDatos();
                    cliente.pedirDatos();
                    llamada.setIdAsesor(asesor.getIdAsesor());
                    llamada.setIdCliente(cliente.getIdCliente());
                    llamada.setIdLlamada(r.nextInt(1000));
                    cliente.pedirAtencion();
                    asesor.asesorar();
                    llamada.iniciarLlamada();
                    System.out.println("Id de la llamada: " + llamada.getIdLlamada());
                    System.out.println("Id Cliente: " + llamada.getIdCliente());
                    System.out.println(asesor);
                default:
                //System.out.println("Opcion no valida, vuelva a intentarlo");
                break;
            }
        }

    }

}