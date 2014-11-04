package com.br.talogas.testproject;

import java.util.Arrays;

public class Sala {

	public static final String OCUPADO = "OCUPADO";
	public static final String LIVRE = "LIVRE";
	private int num_linhas;
	private int num_colunas;
	private String[][] posicoes;

	public Sala(int num_linhas, int num_colunas) {
		// TODO Auto-generated constructor stub
		this.num_linhas = num_linhas;
		this.num_colunas = num_colunas;
		this.posicoes = new String[num_linhas][num_colunas];
		
		//inicializa posições
		for(int i=0; i<num_linhas;i++){
			for(int j=0; j<num_colunas;j++){
				posicoes[i][j] = LIVRE;
			}
		}
	}

	public int getNumPosicoesHorizontais() {
		// TODO Auto-generated method stub
		return num_linhas;
	}

	public int getNumPosicoesVerticais() {
		// TODO Auto-generated method stub
		return num_colunas;
	}

	public boolean isVazia() {
		// TODO Auto-generated method stub
		for(int i=0; i<num_linhas; i++){
			for(int j=0; j<num_colunas; j++){
				if(posicoes[i][j] == OCUPADO){
					return false;
				}
			}
		}
		return true;
	}

	public boolean inserirObstaculo(int i, int j) {
		// TODO Auto-generated method stub
		if(posicaoValida(i, j)){
			posicoes[i][j] = OCUPADO;
			return true;
		}
		return false;
	}

	public boolean posicaoValida(int i, int j) {
		// TODO Auto-generated method stub
		if(i >= 0 && i < num_colunas){
			if(j >= 0 && j < num_colunas){
				return true;
			}
		}
		return false;
	}

	public boolean isPosicaoLivre(int i, int j) throws Exception {
		// TODO Auto-generated method stub
		if(posicaoValida(i, j)){
			if(posicoes[i][j] == LIVRE){
				return true;
			} else {
				return false;
			}
		} 
		throw new Exception("Posicao inexistente.");
	}

	public boolean setPosicao(int i, int j, String status) {
		// TODO Auto-generated method stub
		if(posicaoValida(i, j)){
			if(status == OCUPADO){
				posicoes[i][j] = OCUPADO;
				return true;
			} 
			if(status == LIVRE){
				posicoes[i][j] = LIVRE;
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num_colunas;
		result = prime * result + num_linhas;
		result = prime * result + Arrays.hashCode(posicoes);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		if (num_colunas != other.num_colunas)
			return false;
		if (num_linhas != other.num_linhas)
			return false;
		if (!Arrays.deepEquals(posicoes, other.posicoes))
			return false;
		return true;
	}

}
