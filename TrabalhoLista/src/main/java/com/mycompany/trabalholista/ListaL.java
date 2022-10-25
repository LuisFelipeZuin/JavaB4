package com.mycompany.trabalholista;

public class ListaL<T> {

    private setup<T> primeiro;
    private int tamanho;

   public ListaL() {
       primeiro = null;
       tamanho = 0;
    }

   public int getTamanho() {
        return tamanho;
    }

   public void começo(T info) {
       setup<T> novoNo = new setup<T>(info, null, null);
       primeiro = novoNo;
       tamanho++;
    }

   public void segmento(T info) {
        setup<T> ultimoN = this.buscarUltimo();
        setup<T> novoNo = new setup<T>(info, null, ultimoN);
         if (tamanho == 0) {
            primeiro = novoNo;
       } 
         else {
            setup<T> atual = primeiro;
            while (atual.getProx() != null) {
                atual = atual.getProx();
           }
            atual.setProx(novoNo);
       }
        tamanho++;
  }

   public void mostrarNós() {
        if (tamanho != 0) {
            setup<T> atual = primeiro;
            int cont = 0;             
            while (atual.getProx() != null) {
        System.out.println("O valor na posição " + cont + " é: " + atual.getInfo());
              atual = atual.getProx();
              cont++;
            }
        System.out.println("O valor na posição " + cont + " é: " + atual.getInfo());
        } 
         else {
           System.out.println("Não há elementos na lista.");
        }
    }
    
   private setup<T> buscarUltimo(){
        
        setup<T> ultimo = primeiro;       
        
        while (ultimo.getProx() != null) {            
          ultimo = ultimo.getProx();
       }
       return ultimo;
        
  }
       
   public void OrdemCresc(){
        setup<T> proximo = this.primeiro;
        int cont = 0;
        System.out.println("Posição " + cont + ": " + proximo.getInfo());
        cont++;
         while (proximo.getProx() != null) {
             proximo = proximo.getProx();
             System.out.println("Posição " + cont + ": " + proximo.getInfo());
             cont++;
            }
    }

   public void OrdemDec(){
        setup<T> ultimo = this.buscarUltimo();
        int cont = 0;
        System.out.println("Posição " + cont + ": " + ultimo.getInfo());
        cont++;
         while (ultimo.getAnt() != null) {
             ultimo = ultimo.getAnt();
             System.out.println("Posição " + cont + ": " + ultimo.getInfo());
             cont++;
      }
   }
}
