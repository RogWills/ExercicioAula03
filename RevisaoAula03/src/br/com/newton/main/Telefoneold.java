package br.com.newton.main;

import java.util.Scanner;

import br.com.newton.agenda.Contato;
public class Telefoneold {

    public static void main(String[] args) {
        Contato contato = new Contato();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do contato");
        String nome = scanner.nextLine();

        contato.setNome(nome);
        System.out.println("Informe o numero de contato");
        String numero = scanner.nextLine();

        contato.excluir(contato);
        contato.incluir(contato);

        if (numero.length() != 9) {
            System.out.println("Telefone invalido!");
        }

    }
}
