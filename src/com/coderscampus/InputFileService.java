package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class InputFileService {
	public void getModels(List<SalesData> sales, String filePath) {
		String line;
		BufferedReader br = null;

		try {
			
			br = new BufferedReader(new FileReader(filePath));
			//Reading First Line and skipping it out as its the header of the file.
			br.readLine();
			int counter =0;
			
			//Starting a while loop to read data from file, as we don't know how many times our loop is going to be executed.
			while((line=br.readLine())!=null) {
				//grabbing the first line and split it into array of strings.
				String[] str = line.split(",");
				//Parsing given date to match the pattern "yyyy-MM"
				DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MMM-yy");
				YearMonth yearMonthSale = YearMonth.parse(str[0], inputFormat);
				DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM");
				String saleDate = yearMonthSale.format(outputFormat);
				YearMonth yearMonth = YearMonth.parse(saleDate);
				SalesData sale1 = new SalesData(yearMonth,Integer.parseInt(str[1]));
				sales.add(sale1);
				counter++;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}
}
