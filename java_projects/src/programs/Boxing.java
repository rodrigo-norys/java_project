package programs;

public class Boxing {

	public static void main(String[] args) {		
		int x = 20;
		Object obj = x; // BOXING
		System.out.println(obj);
		
		int y = (int) obj; // UNBOXING
		System.out.println(y);
		
		int z = 30;
		Integer obj2 = z; // BOXING UTILIZANDO WRAPPER CLASSES NO JAVA
		System.out.println(z);
		
		int w = obj2; // NO UNBOXING NÃO PRECISAMOS REFERENCIAR O TIPO PRIMITIVO
		System.out.println(w);

		/* AULA 95 DO CURSO*/
	}

}
