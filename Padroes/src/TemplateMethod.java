
public class TemplateMethod{

	public static void main(String[] args) {
		System.out.println("------ Inst�ncia PedidoOnline a partir do Template ------");
		ProcessoPedidosTemplate netOrder = new LojaOnline();
		netOrder.processOrder();
		System.out.println("------ Inst�ncia PedidoLocal a partir do Template ------");
		ProcessoPedidosTemplate storeOrder = new LojaLocal();
		storeOrder.processOrder();

	}

}
