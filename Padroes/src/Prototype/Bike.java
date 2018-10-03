package Prototype;

class Bike implements Cloneable {
	private int marchas;
	private String tipo;
	private String modelo;
	
	public Bike() {
		tipo = "Padrão";
		modelo = "Caloi Rouge";
		marchas = 4;
	}

	public Bike clone() {
		return new Bike();
	}

	public void makeAdvanced() {
		tipo = "Avançado";
		modelo = "Caloi HTX";
		marchas = 8;
	}
	public String getModelo(){
		return modelo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getMarchas() {
		return marchas;
	}
}
