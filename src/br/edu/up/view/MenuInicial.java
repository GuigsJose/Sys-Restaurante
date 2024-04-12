package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.ControlePedidos;
import br.edu.up.models.Pedido;

public class MenuInicial {
    Scanner sc = new Scanner(System.in);
    public void mostrarMenu(){

        System.out.println();
        System.out.println("--------------------------");
        System.out.println(" MENU INICIAL ");
        System.out.println(" --------------------------L ");
        System.out.println();

        System.out.println("Informe um número da opção:");
        System.out.println();

        System.out.println("1. Cadastrar funcionários");
        System.out.println("2. Cadastrar cardápios");
        System.out.println("...");
        System.out.println("5. Controlar pedidos");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                break;
            case 5:{
                mostrarMenuPedidos();
                break;
            }
                
        
            default:
                break;
        }
    }
    public void mostrarMenuPedidos(){
        System.out.println();
        System.out.println("--------------------------");
        System.out.println(" MENU DE PEDIDOS ");
        System.out.println(" --------------------------L ");
        System.out.println();

        System.out.println("Informe um número da opção:");
        System.out.println();

        System.out.println("1. Incluir");
        System.out.println("2. Alterar");
        System.out.println("3. Listar");
        System.out.println("4. Excluir");
        System.out.println("5. Voltar");

        int opcao = sc.nextInt();
        ControlePedidos cp = new ControlePedidos();
        switch (opcao) {
            case 1:
                break;
            case 3:{
                //listar os pedidods
                Pedido[] pedidos = cp.getPedidos();
                System.out.println("PEDIDOS:");
                for (int i = 0; i < pedidos.length; i++) {
                    Pedido pedido = pedidos[i];
                    System.out.println(pedido);
                }
                break;
            }
            case 5:{
                mostrarMenu();
                break;
            }   

            default:
                break;
        }
        
    }
}
