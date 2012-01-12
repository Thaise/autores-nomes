import static org.junit.Assert.*;

import org.junit.Test;

public class AutoresTeste {
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorJoaoSilva(){
		String nomeFormatado = Autores.formata("joao silva");
		assertEquals("SILVA, Joao", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorPauloCoelho(){
		String nomeFormatado = Autores.formata("paulo coelho");
		assertEquals("COELHO, Paulo", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorCelsodeAraujo(){
		String nomeFormatado = Autores.formata("celso de araujo");
		assertEquals("ARAUJO, Celso de", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorCelsoMellodeAraujo(){
		String nomeFormatado = Autores.formata("celso mello de araujo");
		assertEquals("ARAUJO, Celso Mello de", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorCelsoMellodeAraujoNeto(){
		String nomeFormatado = Autores.formata("celso mello de araujo neto");
		assertEquals("ARAUJO NETO, Celso Mello de", nomeFormatado);
	}
	@Test
	public void deveFormatarNomeESobrenomeDoAutorMariaEduardadasChagasSobrinha(){
		String nomeFormatado = Autores.formata("maria eduarda das chagas sobrinha");
		assertEquals("CHAGAS SOBRINHA, Maria Eduarda das", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorGuimaraes(){
		String nomeFormatado = Autores.formata("guimaraes");
		assertEquals("GUIMARAES", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorMarinetedosSantos(){
		String nomeFormatado = Autores.formata("marinete dos santos");
		assertEquals("SANTOS, Marinete dos", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorFredericodosPassosSantosFilho(){
		String nomeFormatado = Autores.formata("frederico dos passos santos filho");
		assertEquals("SANTOS FILHO, Frederico dos Passos", nomeFormatado);
	}
}
