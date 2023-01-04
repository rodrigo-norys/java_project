package programs;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Timezone {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

		LocalDate d01 = LocalDate.now(); // Data local
		LocalDateTime d02 = LocalDateTime.now(); // Data e hora local
		Instant d03 = Instant.now(); // Data e hora baseada no GMT
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); // ISO 8601 local para o formato de texto
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T12:36:50"); // ISO 8601 local para o formato de texto
		Instant d06 = Instant.parse("2022-07-20T12:36:50Z"); // ISO 8601 GMT para o formato de texto
		Instant d07 = Instant.parse("2022-07-20T12:36:50-03:00"); // ISO 8601 GMT para o formato de texto. Estou perguntando aqui o seguinte:
																  // Às 12:36:50 no horário de São Paulo, que horas serão no GMT?
		LocalDate d08 = LocalDate.parse("08/12/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d09 = LocalDateTime.parse("08/12/2022" + "01:23", DateTimeFormatter.ofPattern("dd/MM/yyyy" + "HH:mm"));
		
		LocalDate d10 = LocalDate.of(2022, 05, 12);
		LocalDateTime d11 = LocalDateTime.of(2022, 05, 12, 18, 0, 01);
		
		LocalDate d12 = LocalDate.parse("2022-09-12");						// Função utilizada para transformar a data para o nosso padrão
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // O padrão
		
		LocalDateTime d13 = LocalDateTime.parse("2022-09-12T09:43:50");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Instant d14 = Instant.parse("2022-07-20T01:30:26Z");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm") -> Chamada normal para atender o formato de texto que eu quero.
		// .withZone(ZoneId.systemDefault() -> Essa função faz considerar a conversão da data e hora para o GMT, baseada no fuso horário da máquina local.
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println("d12 = " + d12.format(fmt2));
		System.out.println("d13 = " + d13.format(fmt3));
		System.out.println("d14 = " + fmt4.format(d14));
		
		System.out.println("d05 = " + d05.format(fmt5));
	}
}