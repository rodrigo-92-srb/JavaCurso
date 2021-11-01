package lambdas.InterfaceFuncional;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// N�o converte direto:  int -> Double por isso deve ser 2.0 e 3.0 nos par�metros
		
		BinaryOperator<Double> calc = (x, y) -> { return x+y; };
		System.out.println(calc.apply(2.0, 3.0));
	
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x+y; };
		System.out.println(calc2.apply(2, 3));
		
		calc2 = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
	}
}
