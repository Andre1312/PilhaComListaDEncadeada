package base;

/**
 * 
 * @author Andre Luiz Coelho Barros
 * <p><b>
 * Implementação da Lista Duplamente Encadeada
 * </b></p>
 * <p>@2020-08</p>
 */


public class ListaDE {
	
	// atributos
	private Node cabeca;
	private Node cauda;
	private int tamanho = 0;
	
	// construtor
	public ListaDE() {
		this.cabeca = null;
		this.cauda = null;
		this.tamanho = 0;
	}

	// getters/setters
	public Node getCabeca() {
		return cabeca;
	}

	public void setCabeca(Node cabeca) {
		this.cabeca = cabeca;
	}

	public Node getCauda() {
		return cauda;
	}

	public void setCauda(Node cauda) {
		this.cauda = cauda;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	// metodos especificos Lista
	/**
	 * <p><b>Adicionar no inicio da lista</b><p>
	 * <p>Testa se a lista está vazia, primeiro elemento será igual a cabeça e cauda da lista.</p>
	 * <p>Testa se a lista contem elementos ja inseridos, cabeca recebe o novo nó apontando para seguinte. 
	 * </p>
	 * @param valor : String
	 * @return void
	 */
	public void adcInicio(String valor) {
		//
		Node nodo = new Node(valor);
		
		
		//
		if (this.cabeca == null) {
			this.cabeca = nodo;
			this.cauda = nodo;
			nodo.setAntes(null);
			nodo.setDepois(null);
		}
		nodo.setDepois(cabeca);
		cabeca.setAntes(nodo);
		nodo.setAntes(null);
		cabeca = nodo;
		tamanho += 1;
	}
	
	/**
	 * <p><b>Adicionar no final da lista</b><p>
	 * <p>Testa se a lista está vazia, primeiro elemento será igual a cabeça e cauda da lista.</p>
	 * <p>Se a lista contem elementos ja inseridos, cauda recebe o novo nó. 
	 * </p>
	 * @param valor : String
	 * @return void
	 */
	public void adcFinal(String valor) {
		//
		Node nodo = new Node(valor);
		
		//
		if(this.cabeca == null) {
			this.cabeca = nodo;
			this.cauda = nodo;
			nodo.setDepois(null);
			nodo.setAntes(null);
		}
		cauda.setDepois(nodo);
		nodo.setAntes(cauda);
		nodo.setDepois(null);
		this.cauda = nodo;
		
		tamanho += 1;
		
		}
	
	/**
	 * <p><b>Remover nó no inicio da lista</b><p>
	 * <p>Testa se a lista está vazia.</p>
	 * <p>Se a lista contem elementos ja inseridos, cabeca recebe o nó seguinte. </p>
	 * 
	 * @return void
	 */
	public void removeInicio() {
		//
		if(this.cabeca==null) {
			return; // devolver mensagem lista vazia !
		}
		this.cabeca = cabeca.getDepois();
		this.cabeca.setAntes(null);
		
		tamanho -= 1;
			
	}
	
	/**
	 * <p><b>Remover nó no final da lista</b><p>
	 * <p>Testa se a lista está vazia.</p>
	 * <p>Se a lista contem elementos ja inseridos, cauda recebe o nó anterior. </p>
	 * 
	 * @return void
	 */
	public void removeFinal() {
		//
		if(this.cabeca==null) {
			return; // devolver mensagem lista vazia !
		}
		this.cauda = cauda.getAntes();
		this.cauda.setDepois(null);
		
		tamanho -= 1; 
		
	}
	
	/**
	 * <p><b> Remover valor da lista</b></p>
	 * <p>Verifica se lista está vazia.</p>
	 * <p>Remove valor da lista, utilizando dois nós auxiliares antes e depois</p>
	 *  
	 * @param valor : String
	 * @return void
	 */
	public void removeValor(String valor) {
		//
		Node auxAntes = new Node();
		Node auxDepois = new Node();
		auxAntes = null;
		auxDepois = null;
		//
		if(this.cabeca==null) {
			return; // devolver mensagem lista vazia !
		}
		for (Node n=cabeca;cabeca!=null;n=n.getDepois()) {
			if(n.getValor().equals(valor)) {
				
				auxAntes = n.getAntes();
				auxAntes.setDepois(n.getDepois());
							
				auxDepois = n.getDepois();
				auxDepois.setAntes(n.getAntes());
				
				tamanho -= 1;
			}
		}
		
	}
	
	/**
	 * <p><b>Procurar um valor na lista</b></p>
	 * <p>Procura um valor na lista e retorna quantas vezes ele ocorre. </p>
	 * <p> 0 - nenhuma ocorrencia
	 * @param valor
	 * @return ocorrenciasValor : int
	 */
	public int contemValor(String valor) {
		//
		int ocorrenciasValor = 0;
		//
		if(this.cabeca==null) {
			return 0; 
		}
		for (Node n=cabeca;cabeca!=null;n=n.getDepois()) {
			if(n.getValor().equals(valor)) {
				ocorrenciasValor += 1;
				
			}
		}
		return ocorrenciasValor;
	}
	
	/**
	 * <p><b>Procurar um valor na lista</b></p>
	 * <p>Procura um valor na lista e retorna quantas vezes ele ocorre. </p>
	 * <p> 0 - nenhuma ocorrencia
	 * @param valor
	 * @return ocorrenciasValor : int
	 */
	public boolean contem(String valor) {
		//
		if(this.cabeca==null) {
			return false; 
		}
		for (Node n=cabeca;cabeca!=null;n=n.getDepois()) {
			if(n.getValor().equals(valor)) {
				return true;
				
			}
		}
		return false;
	}
	
	/**
	 * <p><b>Limpar lista</b></p>
	 * <p>Nó cabeça e nó cauda iguais a null.</p>
	 * 
	 * @return void
	 * 
	 */
	public void clear() {
		this.cabeca = null;
		this.cauda = null;
	}
	
	/**
	 * <p><b>Verificar se lista está vazia</b></p>
	 * <p>Testa se cabeça da lista está nulo</p>
	 * 
	 * @return boolean
	 * 
	 */
	public boolean isEmpty() {
		//
		if(this.cabeca==null) {
			return false; 
		}else {
			return true;
		}
		
	}
	
	/**
	 * <p><b>Informar tamanho da lista</b></p>
	 *  
	 * @return tamanho : int
	 * 
	 */
	public int length() {
		//
		return this.tamanho;
		}
		
	
	
}
