package base;

/**
 * 
 * @author Andre Luiz Coelho Barros
 *
 *<p><b>
 * Classe Nó para ser utilizada em listas encadeadas
 *</b></p>
 *<p>@2020-08</p>
 */



public class Node  {
	
	// atributos
	private String valor;
	private Node antes;
	private Node depois;
	
	// construtor
	public Node() {
	
	}
		
	public Node(String valor) {
		this.valor = valor;
	}
		
	// getters / setters
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Node getAntes() {
		return antes;
	}
	public void setAntes(Node antes) {
		this.antes = antes;
	}
	public Node getDepois() {
		return depois;
	}
	public void setDepois(Node depois) {
		this.depois = depois;
	}
		
}
