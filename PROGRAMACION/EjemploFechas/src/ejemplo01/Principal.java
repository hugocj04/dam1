package ejemplo01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate hoy = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate domingo = hoy.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		LocalTime ahora = LocalTime.now();
		LocalTime especifico = LocalTime.of(19, 23);
		
		System.out.println(hoy);
		System.out.println(hoy.getDayOfMonth());
		System.out.println(hoy.minusWeeks(3));
		System.out.println(hoy.format(formato));
		System.out.println(domingo.format(formato));
		System.out.println(ahora);
		System.out.println(especifico);
	}

}
