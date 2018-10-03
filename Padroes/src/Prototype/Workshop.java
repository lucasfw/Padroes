package Prototype;

public class Workshop {
	public Bike makeJaguar(Bike basicBike) {
		basicBike.makeAdvanced();
		return basicBike;
	}
	
	public static void main(String args[]){
		Bike bike = new Bike();
		Bike basicBike = bike.clone();
		Workshop workShop = new Workshop();
		Bike advancedBike = workShop.makeJaguar(basicBike);
		System.out.println("Padrão de Projeto Prototype: \n Modelo: "+bike.getModelo()+"\n Tipo: "+bike.getTipo()+"\n Marchas: "+bike.getMarchas());
		System.out.println("---------Modelo Clonado-------------");		
		System.out.println("Padrão de Projeto Prototype: \n Modelo: "+advancedBike.getModelo()+"\n Tipo: "+advancedBike.getTipo()+"\n Marchas: "+advancedBike.getMarchas());
	}
}