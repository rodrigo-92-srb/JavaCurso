package lambdas.FuncaoConsumer;

public class Produto extends Object{

	public final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		String pFinal = String.format("%.2f", precoFinal);
		return nome + " -> R$ " + pFinal;
	}
}
