package com.coderscampus;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataService {
	
	public void groupingAndSorting(List<SalesData> model, String modelName) {
		
		//Using stream to group by year on SalesData for specific model of a car.
		System.out.println(modelName +" Yearly Sales Report");
		System.out.println("----------------------------");
		Map<Object, Integer>  modelGroupedByYear = model.stream()
														.collect(Collectors.groupingBy((year) -> year.getSaleDate().getYear(), 
																	Collectors.summingInt((year)->year.getSalePrice())));

		modelGroupedByYear.forEach((key, value) -> System.out.println(key + " -> " + value));
		
		//Using stream sort and collect to sorting list to find best and worst month
		List<SalesData> sortedSalesData = model.stream()
												.sorted(Comparator.comparingInt(SalesData::getSalePrice))
												.collect(Collectors.toList());
		System.out.println("The worst month for "+ modelName +"  was: " +sortedSalesData.get(0).getSaleDate());
		System.out.println("The best month for "+ modelName +"  was: " +sortedSalesData.get(model.size() - 1).getSaleDate());
	}
}
