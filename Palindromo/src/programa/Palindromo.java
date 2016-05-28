//Trabalhando com encapsulamento e m�todos equals(), charAt() e length().

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
	
	//M�todo que analisa a palavra informada e exibe resultado
	
	void mostraResultado() {
		
		for(int x = this.palavra.length()-1 ; x>=0 ; x--){
			this.resultado += palavra.charAt(x);
		}
		if(resultado.equals(palavra)){
			System.out.println("A palavra " + this.palavra + " � um pal�ndromo");
		} else{
			System.out.println("A palavra " + this.palavra + " N�O � um pal�ndromo");
		}
	}

}
