package base;

public class TesteListaPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha pilha = new Pilha();
		
		pilha.push("A");
		pilha.push("B");
		pilha.push("C");
		pilha.push("D");
		String a = pilha.pop();
		String b = pilha.pop();
		String c = pilha.pop();
		String d = pilha.pop();
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
		System.out.println("d " + d);
		
		
	}

}
