package br.senai.sp.jandira.ds1t.comissoes;

import br.senai.sp.jandira.ds1t.comissoes.model.Vendedor;

public class ComissoesApp {
    public static void main(String[] args) {
        System.out.println("Iniciando Programa...");

        Vendedor vendedor = new Vendedor();

        vendedor.coletarDados();
    }
}
