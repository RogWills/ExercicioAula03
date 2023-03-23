package br.com.newton.agenda;

import javax.swing.*;
import java.security.PublicKey;

public class Contato {

    private String Nome;
    private String numero;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void incluir(Contato contato) {
        JOptionPane.showMessageDialog(null,"Contato adicionado com sucesso");
    }
    public void excluir(Contato contato){
        JOptionPane.showMessageDialog(null,"Contato deletado " + contato.Nome + " " + contato.numero);
    }

}


