package com.coderscampus;

import java.util.ArrayList;
import java.util.List;

public class SalesApplication {

	public static void main(String[] args) {
		List<SalesData> model3 = new ArrayList<>();
		List<SalesData> modelS = new ArrayList<>();
		List<SalesData> modelX = new ArrayList<>();
		InputFileService fileService = new InputFileService ();
		String filePathModel3 = "model3.csv";
		String filePathModelS = "modelS.csv";
		String filePathModelX = "modelX.csv";
		
		//Processing and Printing Results for ......."Model3".......
		fileService.getModels(model3, filePathModel3);		
		String modelName = "Model 3";
		DataService dataProcessingmodel3 = new DataService();
		dataProcessingmodel3.groupingAndSorting(model3, modelName);
		
		
		//Processing and Printing results for ......"ModelS"......
		fileService.getModels(modelS, filePathModelS);		
		modelName = "Model S";
		DataService dataProcessingmodelS = new DataService();
		dataProcessingmodelS.groupingAndSorting(modelS, modelName);
		
		
		//Processing and Printing results for ......"ModelX"......
		fileService.getModels(modelX, filePathModelX);		
		modelName = "Model X";
		DataService dataProcessingmodelX = new DataService();
		dataProcessingmodelX.groupingAndSorting(modelX, modelName);	
	}
}
