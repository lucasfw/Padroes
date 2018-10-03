package Decorator;

public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print("Adicionando caracter�sticas de Carro Esportivo.");
	}
}