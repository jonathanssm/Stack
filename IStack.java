package com.stack;

public interface IStack<T> extends Iterable<T> {
	
	public void empilhar(T elemento);
    public T desempilhar();
    public T topo();
    public int tamanho();
    public boolean vazia();
    public void limpar();

}
