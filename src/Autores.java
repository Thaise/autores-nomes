import java.util.Scanner;

public class Autores {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String continuar = "s";
		
		while(continuar.equalsIgnoreCase("s")){
			System.out.print("Digite o nome do autor: ");
			String nomeAutor = entrada.nextLine();
			System.out.println("Nome formatado: " + formata(nomeAutor));
			
			System.out.print("Digite N para sair ou S para continuar:  ");
			continuar = entrada.nextLine();
		}
	}

	public static String formata(String nomeAutor) {
		nomeAutor = nomeAutor.toLowerCase();//caso entre com todas as letras maiúsculas
		String[] separandoPalavras = nomeAutor.split(" ");

		String nome = separandoPalavras[0];
		String primeiraLetraNome = nome.substring(0, 1);
		primeiraLetraNome = primeiraLetraNome.toUpperCase();
		String restoNome = nome.substring(1, nome.length());
		String nomeCorreto = primeiraLetraNome + restoNome;

		String sobrenome = separandoPalavras[separandoPalavras.length - 1];
		String sobrenomeCorreto = "";
		sobrenomeCorreto = sobrenome.toUpperCase();

		String nomesDoMeio = formataNomeDoMeio(separandoPalavras, 1);
		
		String nomesDoMeioParaSobrenomeFamiliar= formataNomeDoMeio(separandoPalavras, 2);

		if ("neto".equalsIgnoreCase(sobrenome) || "neta".equalsIgnoreCase(sobrenome)
				|| "filho".equalsIgnoreCase(sobrenome) || "filha".equalsIgnoreCase(sobrenome)
				|| "sobrinho".equalsIgnoreCase(sobrenome) || "sobrinha".equalsIgnoreCase(sobrenome)
				|| "junior".equalsIgnoreCase(sobrenome)) {

			String sobrenomeFamiliar = "";
			sobrenomeFamiliar = separandoPalavras[separandoPalavras.length - 2].toUpperCase();

			return sobrenomeFamiliar + " " + sobrenomeCorreto + ", " + nomeCorreto
					+ nomesDoMeioParaSobrenomeFamiliar;

		} else if (separandoPalavras.length == 1) {
			return nome.toUpperCase();

		} else {
			return sobrenomeCorreto + ", " + nomeCorreto + nomesDoMeio;
		}
	}

	private static String formataNomeDoMeio(String[] separandoPalavras, int indiceFinalMaximo) {
		String nomesDoMeio = "";
		for (int i = 1; i < separandoPalavras.length - indiceFinalMaximo; i++) {

			if (!("de".equalsIgnoreCase(separandoPalavras[i])
					|| "da".equalsIgnoreCase(separandoPalavras[i])
					|| "do".equalsIgnoreCase(separandoPalavras[i])
					|| "das".equalsIgnoreCase(separandoPalavras[i]) 
					|| "dos".equalsIgnoreCase(separandoPalavras[i]))) {

				String primeiraLetraNomeDoMeio = separandoPalavras[i]
						.substring(0, 1);
				primeiraLetraNomeDoMeio = primeiraLetraNomeDoMeio.toUpperCase();
				String restoNomeDoMeio = separandoPalavras[i].substring(1,
						separandoPalavras[i].length());

				nomesDoMeio = nomesDoMeio + " " + primeiraLetraNomeDoMeio
						+ restoNomeDoMeio;

			} else {
				nomesDoMeio = nomesDoMeio + " " + separandoPalavras[i];
			}
		}
		return nomesDoMeio;

	}
}
