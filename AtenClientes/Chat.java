package AtenClientes;

import java.util.*;

public class Chat {

    public Chat() {
    }

    private int idAsesor;
    private int idCliente;
    private int idChat;
    
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
    
    public int getIdChat() {
        return this.idChat;
    }
    public void setIdChat(int idChat) {
        this.idChat = idChat;
    }
    
    public void iniciarChat() {
        System.out.println("Chat iniciado...\n");
    }

    public String toString(){
        String cad = "idClinte: " + getIdCliente();
        cad += "\nidAsesor: " + getIdAsesor();
        cad += "\nNumero de chat: " + getIdChat();
        return cad;
    }

}