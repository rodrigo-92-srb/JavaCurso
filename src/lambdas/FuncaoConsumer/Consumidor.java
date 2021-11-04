package lambdas.FuncaoConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome + "!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		System.out.println("Imprimindo produto específico: ");
		imprimir.accept(p1);
		
		
		Produto p2 = new Produto("Notebook", 3000.50, 0.29);
		Produto p3 = new Produto("Caderno", 30.50, 0.09);
		Produto p4 = new Produto("Borracha", 8.60, 0.18);
		Produto p5 = new Produto("Lápis", 4.50, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		System.out.println("Imprimindo lista de produtos: ");
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
