package br.edu.up.models;

public class Pedido {

    private String numero, dataPedido;

    private Cliente cliente;
    private Garcom garcom;
    private Item[] itens;
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }
    public Pedido() {
    }
    public Pedido(String numero, String dataPedido) {
        this.numero = numero;
        this.dataPedido = dataPedido;
    }

    @Override
    public String toString() {
        
        return  "Número: " + numero + " Data: " + dataPedido;
                    
    }
    
    // public Cliente getCliente() {
    //     return cliente;
    // }
    // public void setCliente(Cliente cliente) {
    //     this.cliente = cliente;
    // }
    // public Garcom getGarcom() {
    //     return garcom;
    // }
    // public void setGarcom(Garcom garcom) {
    //     this.garcom = garcom;
    // }
    // public Item[] getItens() {
    //     return itens;
    // }
    // public void setItens(Item[] itens) {
    //     this.itens = itens;
    // }   

    
}
