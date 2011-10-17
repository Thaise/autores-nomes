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
		assertEquals("ARAUJO, Celso mello de", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor5(){
		String nomeFormatado = Autores.formata("celso mello de araujo neto");
		assertEquals("ARAUJO NETO, Celso mello de", nomeFormatado);
	}
	@Test
	public void deveFormatarNomeESobrenomeDoAutor6(){
		String nomeFormatado = Autores.formata("maria eduarda das chagas sobrinha");
		assertEquals("CHAGAS SOBRINHA, Maria eduarda das", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor7(){
		String nomeFormatado = Autores.formata("guimaraes");
		assertEquals("GUIMARAES", nomeFormatado);
	}
}
