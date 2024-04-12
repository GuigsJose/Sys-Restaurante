package br.edu.up.controller;

import br.edu.up.models.Pedido;

// controller
public class ControlePedidos {
    // tem/ varuis
    private Pedido[]  pedidos;

    public ControlePedidos(){
        this.pedidos = new Pedido[2];
        Pedido p1 = new Pedido("1","10/04/2024");
        Pedido p2 = new Pedido("2", "11/04/2024");

        this.pedidos[0] = p1;
        this.pedidos[1] = p2;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }

    

    
}
