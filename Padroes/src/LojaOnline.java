
public class LojaOnline extends ProcessoPedidosTemplate {

	@Override
	public void doSelect() {
		System.out.println("Item adicionado ao carrinho online,");
		System.out.println("Receber prefer�ncia por papel de embrulho,");
		System.out.println("Receber endere�o de entrega.");
	}

	@Override
	public void doPayment() {
		System.out.println("Pagamento Online atrav�s de Cart�es de Cr�dito.");
	}

	@Override
	public void doDelivery() {
		System.out.println("Envio do item atrav�s dos correios para o endere�o de entrega");
	}

}