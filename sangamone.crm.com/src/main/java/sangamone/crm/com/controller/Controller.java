package sangamone.crm.com.controller;
import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
	
	@GetMapping("/hello")
	public String getMessage()
	{
		return "Hello World";
	}
	
	@GetMapping("/today")
	public String  getToday()
	{
		boolean isFastingDay = false;
		LocalDateTime today = LocalDateTime.now();
		String  today2 = today.getDayOfWeek().toString();
		String today1 = today.toString();
		if(today2.equals("TUESDAY"))
		{
			isFastingDay = true;
		}
		
		return today1+today2+"isFastingDay"+isFastingDay;
		//System.out.println("today"+today);
	}
	
}
