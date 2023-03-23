package br.com.newton.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.newton.agenda.Contato;

public class Telefone {
    public static void main(String[] args) {
        Contato contato = new Contato();
        Scanner scanner = new Scanner(System.in);

        String nome = JOptionPane.showInputDialog("Informe o Nome de contato");
        contato.setNome(nome);

        String numero = JOptionPane.showInputDialog("Informe o numero");
        contato.setNumero(numero);

        if (numero.length() != 9);
        {

            contato.setNome(nome);
        }
            JOptionPane.showMessageDialog(null, "Telefone invalido");

            contato.incluir(contato);
            contato.excluir(contato);


        }

    }
