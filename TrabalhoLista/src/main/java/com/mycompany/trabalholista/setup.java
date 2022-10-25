package com.mycompany.trabalholista;

public class setup<T>{
    private T info;
    private setup<T> prox,ant;
     
   public setup(T info, setup<T> prox, setup<T> ant) {
        this.info = info;
        this.prox = prox;
        this.ant = ant;
  }
  public void setInfo(T conteudo) {
        this.info = info;
  }
   public T getInfo() {
        return info;
  }   
   public void setAnt(setup<T> ant) {
        this.ant = ant;
  } 
   public setup<T> getAnt() {
        return ant;
  }       
   public void setProx(setup<T> prox) {
        this.prox = prox;
  }
   public setup<T> getProx() {
        return prox;
  }
       
}

