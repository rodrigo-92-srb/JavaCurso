package lambdas.PrimeiraFuncaoLambda;

public interface Calculo {

	//interfaces funcionais só podem ter apenas um método
	public abstract double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal !!!";
	}
}
