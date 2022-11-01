
package com.mycompany.trabalhoconta;


public class Transitor {

    public static void main(String[] args) {
     //        Conta conta = new Conta();
//        System.out.println(conta.getNomeTitular());
//        conta.setNomeTitular("Ricardo");
//        System.out.println(conta.getNomeTitular());   

        Conta c1 = new Conta("João","18122867324","joao.p@gmail.com", 1600, 2840000, "Poupança");
        System.out.println("Nome: "+c1.getNome());
        System.out.println("CPF: "+c1.getCPF());
        System.out.println("Email: "+c1.getEmail());
        System.out.println("Numero de conta: "+c1.getNumeroConta());
        System.out.println("Saldo: "+c1.getSaldo()+" R$");
        System.out.println("Tipo de conta: "+c1.devolveTipoConta());
        
        System.out.println("");
        System.out.println("----------------");
        System.out.println("");
        
        Conta c2 = new Conta("Pedro","83313575404","pedro.p@gmail.com", 3200, 3284728, "Corrente");
        System.out.println("Nome: "+c2.getNome());
        System.out.println("CPF: "+c2.getCPF());
        System.out.println("Email: "+c2.getEmail());
        System.out.println("Numero de conta: "+c2.getNumeroConta());
        System.out.println("Saldo: "+c2.getSaldo()+" R$");
        System.out.println("Tipo de conta: "+c2.devolveTipoConta());
        
        //saque
//        conta2.saque(5.0);
//        System.out.println(conta2.getSaldo());

            //deposito
            //imprime nome titular
            //conta1.imprimeNomeTitular();

            //devolve saldo atual
            //conta1.informaSaldo();

            //transferência
//        conta1.transfere(conta2, 500000);
//        conta1.informaSaldo();
//        conta2.informaSaldo();

            //Tipo conta       
    }
}
