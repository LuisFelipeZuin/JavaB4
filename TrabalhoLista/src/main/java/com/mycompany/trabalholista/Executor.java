package com.mycompany.trabalholista;

public class Executor {
    
 public static void main(String[] args) {
     
     ListaL lista = new ListaL();
                    
     lista.começo(1);
     lista.segmento(20);
     lista.segmento(39);
     lista.segmento(45);
     lista.segmento(60);  
     lista.segmento(90);
     lista.segmento(180);
     

   System.out.println("Tamanho:");
   System.out.println(lista.getTamanho());                      
     lista.mostrarNós();
   
   System.out.println("--------------------");
        
       
   System.out.println("Ordem crescente:");
     lista.OrdemCresc();
    
    System.out.println("");
    
    System.out.println("Ordem decrescente");
     lista.OrdemDec();
  
   }   
}
