//Trabalhando com encapsulamento e métodos equals(), charAt() e length().

package programa;

public class Palindromo {
	
	private String palavra = "";
	private String resultado = "";
	
	public String getPalavra() {
		return palavra;
	}
	
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	//Método que analisa a palavra informada e exibe resultado
	
	void mostraResultado() {
		
		for(int x = this.palavra.length()-1 ; x>=0 ; x--){
			this.resultado += palavra.charAt(x);
		}
		if(resultado.equals(palavra)){
			System.out.println("A palavra " + this.palavra + " é um palíndromo");
		} else{
			System.out.println("A palavra " + this.palavra + " NÃO é um palíndromo");
		}
	}

}
