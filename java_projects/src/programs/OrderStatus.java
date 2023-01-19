package programs;

import java.util.Date;

import classes.OrderStatusClass;
import classes.enums.OrderStatusEnum;

public class OrderStatus {

	public static void main(String[] args) {
		
		
		// Novo objeto do tipo OrderStatusClass com o OrderStatusEnum como parâmetro,
		// Vindo do Construtor da classe
		OrderStatusClass orderStatusClass = new OrderStatusClass(1080, new Date(), OrderStatusEnum.PENDING_PAYMENT);
		
		// O toString() atuando aqui
		System.out.println(orderStatusClass);
		
		OrderStatusEnum os1 = OrderStatusEnum.DELIVERED;
		
		// Conversão de String para enum
		OrderStatusEnum os2 = OrderStatusEnum.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
