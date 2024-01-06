package sangamone.crm.com.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadFileControllerTwo {

	String filename = "demoinput.txt";
	@GetMapping("/ReadFile")
	public List<String> fetchData() throws IOException
	{
		
		//ReadFileControllerTwo ob = new ReadFileControllerTwo();
		return this.getData();
		
	}
	
	@GetMapping("/FilterWorld/{start}")
	public List<String> getFilterData(@PathVariable String start) throws IOException
	{
		return Files.lines(Path.of(filename))
				.filter(s -> s.startsWith(start))
				.collect(Collectors.toList());
		
		
	}
	
	
	
	
	public List<String> getData() throws FileNotFoundException
	{
		List<String>  list1 = new ArrayList<String>();
		
		String filename = "demoinput.txt";
		File f1 = new File(filename);
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNextLine())
		{
			String str = sc1.nextLine();
			list1.add(str);	
		}
		return list1;
	}
	
	
	
	
	
}
