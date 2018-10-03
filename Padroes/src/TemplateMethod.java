
public class TemplateMethod{

	public static void main(String[] args) {
		System.out.println("------ Instância PedidoOnline a partir do Template ------");
		ProcessoPedidosTemplate netOrder = new LojaOnline();
		netOrder.processOrder();
		System.out.println("------ Instância PedidoLocal a partir do Template ------");
		ProcessoPedidosTemplate storeOrder = new LojaLocal();
		storeOrder.processOrder();

	}

}
