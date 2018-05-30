package com.stack;

import java.util.Iterator;

import com.list.ListaSEncadeada;

public class Stack<T> implements IStack<T> {

	private ListaSEncadeada<T> stack = new ListaSEncadeada<T>();
	
	@Override
	public Iterator<T> iterator() {
		
		return this.stack.iterator();
	}

	@Override
	public void empilhar(T elemento) {
		
		this.stack.adicionarInicio(elemento);
		
	}

	@Override
	public T desempilhar() {
		
		return this.stack.remover(0);
	}

	@Override
	public T topo() {
		
		return this.stack.obter(0);
	}

	@Override
	public int tamanho() {
		
		return this.stack.tamanho();
	}

	@Override
	public boolean vazia() {
		
		return stack.tamanho() == 0;
	}

	@Override
	public void limpar() {
		
		this.stack.limpar();
		
	}

}
