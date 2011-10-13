
public class Autores {

	public static String formata(String nomeAutor) {
		String[] separandoPalavras = nomeAutor.split(" ");
		int tamanho = separandoPalavras.length;
		
		String nome = separandoPalavras[0];
		String primeiraLetraNome = nome.substring(0,1); 
		String restoNome = nome.substring(1,nome.length());
		String maiusculaNome = "";		
		maiusculaNome  = primeiraLetraNome.toUpperCase();
				
		String sobrenome = separandoPalavras[tamanho -1];
		String maiusculaSobrenome  = "";
		maiusculaSobrenome  = sobrenome.toUpperCase();
		
		String nomesDoMeio = "";

		for(int i = 1; i < tamanho -1; i++){
			nomesDoMeio = nomesDoMeio+" "+separandoPalavras[i];	
		/*Para completar: faltam as primeiras letras de cada nome retornarem maiúsculas 
		com excessão dos nomes:"de", "da", "do" etc.*/
		}
		
		String sobrenome2 = "";
		String nomesDoMeio2 = "";
		
		for(int i = 1; i < tamanho -2; i++){
			nomesDoMeio2 = nomesDoMeio2+" "+separandoPalavras[i];
		}
			 if("neto".equals(sobrenome)||"neta".equals(sobrenome)||"filho".equals(sobrenome)
				||"filha".equals(sobrenome)||"sobrinho".equals(sobrenome)
				||"sobrinha".equals(sobrenome)||"junior".equals(sobrenome)){
				 
				 sobrenome2 = separandoPalavras[tamanho -2].toUpperCase();
				
				 return sobrenome2+" "+maiusculaSobrenome+", "+ maiusculaNome + restoNome + nomesDoMeio2;
			
			 }else 
			if(tamanho == 1){
				maiusculaNome = nome.toUpperCase();
				
				return maiusculaNome;
				
			}else{
				return maiusculaSobrenome+", "+ maiusculaNome  + restoNome + nomesDoMeio;
			 }
	
	}
}
