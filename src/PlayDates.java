import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class PlayDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate now= LocalDate.now();
		System.out.println(now);
		LocalDate LocalDateBirthday = LocalDate.of(2000, 01, 05);
		System.out.println(LocalDateBirthday);
		System.out.println(LocalDateBirthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(LocalDateBirthday.getDayOfMonth());
		System.out.println(LocalDateBirthday.getMonth());
		System.out.println(LocalDateBirthday.getYear());
		
		//add up days to a LocalDate
		LocalDate future10=now.plusDays(10);
		System.out.println(future10);
		
		LocalDate future2months = now.plusMonths(2);
		System.out.println(future2months);
		
		LocalDate past1month= now.minusMonths(1);
		System.out.println(past1month);
		
		//calculate your age
		Period period=Period.between(LocalDateBirthday, now.plusDays(1));
		System.out.println(period);
		System.out.println(String.format("%s years,%s months", period.getYears(),period.getMonths()));
		
		//compare dates
		System.out.println(now.isAfter(LocalDateBirthday));
		System.out.println(now.isBefore(LocalDateBirthday));
		
		//DateTime Related operations
		LocalDateTime localDatetime = LocalDateTime.now();
		System.out.println(localDatetime);
		System.out.println();
		System.out.println(localDatetime.format(DateTimeFormatter.ofPattern("dd//MM/yyyy")));
		//zone based date time
		Set<String>zoneIds=ZoneId.getAvailableZoneIds();	
		System.out.println(zoneIds);
		
		ZonedDateTime zonedDateTime= ZonedDateTime.now(ZoneId.of("Australia/Tasmania"));
		System.out.println(zonedDateTime);
		
	}
	
	
	

}

