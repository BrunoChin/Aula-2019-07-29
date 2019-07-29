package edu.ifal.votacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ControleTest {
	
	@Test
	public void verificarSePodeVotarCom16Anos() {
		Controle controle = new Controle();
		int idade = 16;
		boolean resultadoObtido = controle.permiteVotar(idade);
		boolean resultadoEsperado = true;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSePodeVotarCom17Anos() {
		Controle controle = new Controle();
		int idade = 17;
		boolean resultadoObtido = controle.permiteVotar(idade);
		boolean resultadoEsperado = true;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSePodeVotarCom15Anos() {
		Controle controle = new Controle();
		int idade = 15;
		boolean resultadoObtido = controle.permiteVotar(idade);
		boolean resultadoEsperado = false;
		assertEquals(resultadoEsperado, resultadoObtido);
	
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom70Anos() {
		Controle controle = new Controle();
		int idade = 70;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = true;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom71Anos() {
		Controle controle = new Controle();
		int idade = 71;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = false;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom80Anos() {
		Controle controle = new Controle();
		int idade = 80;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = false;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom60Anos() {
		Controle controle = new Controle();
		int idade = 60;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = true;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom69Anos() {
		Controle controle = new Controle();
		int idade = 69;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = true;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom18Anos() {
		Controle controle = new Controle();
		int idade = 18;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = true;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom19Anos() {
		Controle controle = new Controle();
		int idade = 19;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = true;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom17Anos() {
		Controle controle = new Controle();
		int idade = 17;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = false;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom16Anos() {
		Controle controle = new Controle();
		int idade = 16;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = false;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom15Anos() {
		Controle controle = new Controle();
		int idade = 15;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = false;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void verificarSeVotoObrigatorioCom10Anos() {
		Controle controle = new Controle();
		int idade = 10;
		boolean resultadoObtido = controle.votoObrigatorio(idade);
		boolean resultadoEsperado = false;
		assertEquals(resultadoEsperado, resultadoObtido);
	}
}
