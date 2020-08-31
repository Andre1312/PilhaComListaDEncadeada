package base;

/**
 * 
 * @author Andre Luiz Coelho Barros
 * 
 * <p><b>Implementa Pilha com Lista Duplamente Encadeada</b></p>
 * <p>@2020-08</p>
 *
 */


public class Pilha extends ListaDE{
	
	//
	public Pilha() {
		ListaDE pilha = new ListaDE();
	}
	
	//
	
	ListaDE pilha = new ListaDE();
	/**
	 * Implementa método PUSH para Pilha
	 * @param valor:String
	 */
	public void push(String valor) {
		pilha.adcFinal(valor);
	}
	
	/**
	 * Implementa método POP para Pilha
	 * @return valor: String
	 */
	public String pop() {
		String aux = pilha.getCauda().getValor();
		pilha.removeFinal();
		return aux;
	}

}
