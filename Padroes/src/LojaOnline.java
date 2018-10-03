
public class LojaOnline extends ProcessoPedidosTemplate {

	@Override
	public void doSelect() {
		System.out.println("Item adicionado ao carrinho online,");
		System.out.println("Receber preferência por papel de embrulho,");
		System.out.println("Receber endereço de entrega.");
	}

	@Override
	public void doPayment() {
		System.out.println("Pagamento Online através de Cartões de Crédito.");
	}

	@Override
	public void doDelivery() {
		System.out.println("Envio do item através dos correios para o endereço de entrega");
	}

}