
import java.util.Date;
import entities.pedido;
import entities.enums.status_pedido;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pedido Pedido = new pedido(1080,new Date(),status_pedido.pagamento_pedendente);
		System.out.println(Pedido);
		status_pedido os1 = status_pedido.entregue;
		status_pedido os2 = status_pedido.valueOf("entregue");
		System.out.println(os1);
		System.out.println(os2);
	}

}
