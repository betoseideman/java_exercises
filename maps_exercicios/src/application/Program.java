package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\temp\\can.csv";
		Map<String, Integer> votes = new HashMap<String, Integer>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line  != null) {
				
				String[] field = line.split(",");
				String name = field[0];
				int Count = Integer.parseInt(field[1]);
				
				if (votes.containsKey(name)) {
					int sum = votes.get(name);
					votes.put(name, sum + Count);
				}
				else {
					votes.put(name, Count);
				}
				line = br.readLine();
			}
			for(String can : votes.keySet()) {
				System.out.println(can + ": " + votes.get(can));
			}
			
		}
		catch (IOException e ) {
			System.out.print("Error : " + e.getMessage());
		}
		
				
		sc.close();
	}

}
