public class Autores {

	public static String formata(String nomeAutor) {
		String[] separandoPalavras = nomeAutor.split(" ");
		int tamanho = separandoPalavras.length;
		
		String nome = separandoPalavras[0];
		String primeiraLetraNome = nome.substring(0,1); 
		String restoNome = nome.substring(1,nome.length());
		String maiusculaNome = "";		
		maiusculaNome  = primeiraLetraNome.toUpperCase();
		String nomeCorreto = maiusculaNome+restoNome;
				
		String sobrenome = separandoPalavras[tamanho -1];
		String sobrenomeCorreto  = "";
		sobrenomeCorreto  = sobrenome.toUpperCase();
		
		String nomesDoMeio = "";

		for(int i = 1; i < tamanho -1; i++){
			
			if("de".equals(separandoPalavras[i]) || "da".equals(separandoPalavras[i])||"do".equals(separandoPalavras[i])
				||"das".equals(separandoPalavras[i])||"dos".equals(separandoPalavras[i])){
				
				nomesDoMeio = nomesDoMeio+" "+separandoPalavras[i];
				
			}else{
				String primeiraLetraNomeDoMeio = separandoPalavras[i].substring(0,1);
				String maiusculaNomeDoMeio = "";
				maiusculaNomeDoMeio = primeiraLetraNomeDoMeio.toUpperCase();
				String restoNomeDoMeio =  separandoPalavras[i].substring(1,separandoPalavras[i].length());
				
				nomesDoMeio = nomesDoMeio+" "+maiusculaNomeDoMeio+restoNomeDoMeio;
				
			}
		}
		
		String sobrenome2 = "";
		String nomesDoMeio2 = "";
		
		for(int i = 1; i < tamanho -2; i++){
			String primeiraLetraNomeDoMeio2 = separandoPalavras[i].substring(0,1);
			String maiusculaNomeDoMeio2 = "";
			maiusculaNomeDoMeio2 = primeiraLetraNomeDoMeio2.toUpperCase();
			String restoNomeDoMeio2 =  separandoPalavras[i].substring(1,separandoPalavras[i].length());
			
			if("de".equals(separandoPalavras[i]) || "da".equals(separandoPalavras[i])||"do".equals(separandoPalavras[i])
				||"das".equals(separandoPalavras[i])||"dos".equals(separandoPalavras[i])){
					
				nomesDoMeio2 = nomesDoMeio2+" "+separandoPalavras[i];
					
			}else{
					
				nomesDoMeio2 = nomesDoMeio2+" "+maiusculaNomeDoMeio2+restoNomeDoMeio2;
			}	
			
		}
			 if("neto".equals(sobrenome)||"neta".equals(sobrenome)||"filho".equals(sobrenome)
				||"filha".equals(sobrenome)||"sobrinho".equals(sobrenome)
				||"sobrinha".equals(sobrenome)||"junior".equals(sobrenome)){
				 
				 sobrenome2 = separandoPalavras[tamanho -2].toUpperCase();
				
				 return sobrenome2+" "+sobrenomeCorreto+", "+ nomeCorreto + nomesDoMeio2;
			
			 }else	if(tamanho == 1){
				maiusculaNome = nome.toUpperCase();
				
				return maiusculaNome;
				
			}else{
				return sobrenomeCorreto+", "+ nomeCorreto + nomesDoMeio;
			}
	
	}
}
