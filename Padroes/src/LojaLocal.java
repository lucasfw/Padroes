
public class LojaLocal extends ProcessoPedidosTemplate {

	@Override
	public void doSelect() {
		System.out.println("Cliente seleciona o item da prateleira.");
	}

	@Override
	public void doPayment() {
		System.out.println("Paga no balc�o atrav�s de dinheiro");
	}

	@Override
	public void doDelivery() {
		System.out.println("Item entregue no balc�o de entrega.");
	}

}
