package br.senai.sp.jandira.ds1t.comissoes.model;

import java.util.Scanner;

public class Vendedor {

    String nomeVendedor;
    double totalVendas;
    double percentualComissao;
    double valorComissao;

    public void coletarDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor:");
        nomeVendedor = leitor.nextLine();

        System.out.print("Qual foi o total de vendas de " + nomeVendedor + ":");
        totalVendas = leitor.nextDouble();

        calcularComissao();
    }

    public void calcularComissao(){

        if (totalVendas >= 20000){
            percentualComissao = 0.1;
        }
        else {
            percentualComissao = 0.05;
        }

        valorComissao = (totalVendas * percentualComissao) + totalVendas;

        exibirResultados();
    }

    public void exibirResultados(){
        double percentualComissaoPorcento = percentualComissao * 100;
        String totalVendasDoisDecimais = String.format("%.2f", totalVendas);
        String valorComissaoDoisDecimais = String.format("%.2f", valorComissao);

        System.out.println("-------------------------------------------------------");
        System.out.println("VENDEDOR: " + nomeVendedor);
        System.out.println("TOTAL VENDAS: R$" + totalVendasDoisDecimais);
        System.out.println("PERCENTUAL DE COMISSÃO: " + percentualComissaoPorcento + "%");
        System.out.println("VALOR DA COMISSÃO: R$" + valorComissaoDoisDecimais);
        System.out.println("-------------------------------------------------------");
    }
}
