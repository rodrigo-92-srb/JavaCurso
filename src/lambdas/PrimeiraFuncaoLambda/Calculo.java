package lambdas.PrimeiraFuncaoLambda;

public interface Calculo {

	//interfaces funcionais s� podem ter apenas um m�todo
	public abstract double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal !!!";
	}
}
