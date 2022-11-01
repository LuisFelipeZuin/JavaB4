package com.mycompany.trabalhoconta;

public class Pessoa {

    private String nome, cpf, email;

    public Pessoa(String Nome, String cpf, String email) {
        this.nome = Nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    public void setEmail(String Nome) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
