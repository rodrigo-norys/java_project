package programs;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimezoneCalculation {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2022-12-13");
		LocalDateTime d02 = LocalDateTime.parse("2022-12-13T10:29:40");
		Instant d03 = Instant.parse("2022-12-13T10:29:40Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7); // Subtração de dias no localdate
		LocalDate nextWeekLocalDate = d01.plusDays(7); // Adição de dias no localdate
		
		System.out.println("PastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("NextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime lastHourLocalDateTime = d02.minusHours(2); // Subtração de horas no localdatetime
		LocalDateTime nextHourLocalDateTime = d02.plusHours(2); // Adição de horas no localdatetime
		
		System.out.println("LastHour = " + lastHourLocalDateTime);
		System.out.println("NextHour = " + nextHourLocalDateTime);
		
		Instant lastDayInstant = d03.minus(1, ChronoUnit.DAYS); // Para subtrair dias no instant, é necessário chamar o objeto CHRONOUNIT e depois classe DAYS por exemplo
		Instant nextDayInstant = d03.plus(1, ChronoUnit.DAYS); // Para adicionar dias é a mesma coisa
		
		System.out.println("LastDayInstant = " + lastDayInstant);
		System.out.println("NextDayInstant = " + nextDayInstant);
		
		
		/**  **/
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());	
		System.out.println("Duration t1 = " + t1.toDays());
		
		Duration t2 = Duration.between(lastHourLocalDateTime, d02);
		System.out.println("Duration t2 = " + t2.toHours());
		
		Duration t3 = Duration.between(lastDayInstant, d03);
		System.out.println("Duration t3 = " + t3.toDays());
		
		Duration t4 = Duration.between(d03, lastDayInstant);
		System.out.println("Duration t4 = " + t4.toDays());
	}

}
