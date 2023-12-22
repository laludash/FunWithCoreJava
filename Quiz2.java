package com.javaprogram.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Sport
{
	private String player;
	private String sport; 
	
	public Sport(String player, String sport)
	{
		this.player = player ; 
		this.sport = sport;
	}
	
	protected String getPlayer(){
		
		return player;
	}
	
	protected String getSport()
	{
		
		return sport;
	}
		
}

public class Quiz2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		List<Sport> sport2 = readSportCSV("Quiz_Sport.csv");
		if(sport2.isEmpty())
		{
			System.out.println("No Questions Found");
		}
		
		Collections.shuffle(sport2);
		Scanner sc3= new Scanner(System.in);
		int score   = 0; 
		List<String> wrongAns = new ArrayList<>();
		System.out.println("Sport Quize");
		int nofq  = Math.min(2, sport2.size());
		for(int i =0; i<nofq; i++)
		{
			Sport s1 = sport2.get(i); // write code here 
			System.out.println("Question" +(i+1)+ "To which sport does  "+s1.getPlayer()+"  belong to");		
			String Ans = sc3.nextLine().trim();
			if(Ans.equalsIgnoreCase(s1.getSport()))
			{
				
				score = score + 10;
				
			}
			
			System.out.println("Quiz Completed "+score);
			System.out.println("Quiz Completed");
		
		}
				
	}
	
	private static List<Sport> readSportCSV(String filename) throws FileNotFoundException, IOException
	{
		
		List<Sport> sportlist = new ArrayList<>();
		String line;
		try(BufferedReader readline = new BufferedReader(new FileReader(filename)))
		{
			readline.readLine();  //skip the header part
			while((line = readline.readLine()) != null)
			{
				String[] data = line.split(",");
				if(data.length == 2)
				{
					sportlist.add(new Sport(data[0], data[1]));
				}
			}
			
		
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return sportlist;	
	}
}
