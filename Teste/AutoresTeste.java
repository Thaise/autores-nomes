import static org.junit.Assert.*;

import org.junit.Test;

public class AutoresTeste {
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor(){
		String nomeFormatado = Autores.formata("joao silva");
		assertEquals("SILVA, Joao", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor2(){
		String nomeFormatado = Autores.formata("paulo coelho");
		assertEquals("COELHO, Paulo", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor3(){
		String nomeFormatado = Autores.formata("celso de araujo");
		assertEquals("ARAUJO, Celso de", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor4(){
		String nomeFormatado = Autores.formata("celso mello de araujo");
		assertEquals("ARAUJO, Celso Mello de", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor5(){
		String nomeFormatado = Autores.formata("celso mello de araujo neto");
		assertEquals("ARAUJO NETO, Celso Mello de", nomeFormatado);
	}
	@Test
	public void deveFormatarNomeESobrenomeDoAutor6(){
		String nomeFormatado = Autores.formata("maria eduarda das chagas sobrinha");
		assertEquals("CHAGAS SOBRINHA, Maria Eduarda das", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor7(){
		String nomeFormatado = Autores.formata("guimaraes");
		assertEquals("GUIMARAES", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor8(){
		String nomeFormatado = Autores.formata("marinete dos santos");
		assertEquals("SANTOS, Marinete dos", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor9(){
		String nomeFormatado = Autores.formata("frederico dos passos santos filho");
		assertEquals("SANTOS FILHO, Frederico dos Passos", nomeFormatado);
	}
}
