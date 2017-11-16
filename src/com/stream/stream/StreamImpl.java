package com.stream.stream;

public class StreamImpl implements Stream{
 

  private String texto;
  private Integer indiceAtual;
  private char caracterAtual;
  
    
  public StreamImpl(String text) {
    this.texto = text;
    this.indiceAtual = -1;
  }
  
  
  @Override
  public char getNext(){
    indiceAtual = indiceAtual + 1;
    caracterAtual = texto.charAt(indiceAtual);
    return caracterAtual;
  }
  
  
  @Override
  public boolean hasNext() {
    try {
      @SuppressWarnings("unused")
	char nextChar = texto.charAt(indiceAtual + 1);
      return true;
    }catch(Exception ex){
     return false;
    }
  }


}
