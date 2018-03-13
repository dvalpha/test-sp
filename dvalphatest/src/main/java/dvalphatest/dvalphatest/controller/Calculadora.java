package dvalphatest.dvalphatest.controller;

public class Calculadora {
	Double n1;
	Double n2;
	
	
	public Calculadora(){}
	
	public Calculadora(Double n1, Double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}




	public Double suma() {
		return n1+n2;
	}
	
	public Double resta() {
		return n1-n2;
	}
	public Double multiplica() {
		return n1*n2;
	}
	public Double divide() {
		return n1/n2;
	}
	
}
