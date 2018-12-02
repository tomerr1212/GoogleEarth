package File_format;

import java.io.File;
import GIS.GIS_layer;
import GIS.Layer;
import GIS.Project;
/**
 * @author Ortal and Tomer
 */

public class MultiCSV extends Project{

	/**
	 * @param folderDestination
	 * This Function gets a folder placement and finds the the files you looking for(in this case .csv files)
	 */
	public static void parseForCsvFiles(String folderDestination){
		File[] files = new File(folderDestination).listFiles();
		Project p =new Project();
		GIS_layer l = new Layer();
		Csv2kml tokml = new Csv2kml();
		for(File f : files){			//Looping recursively to find more folders
			if(f.isDirectory()){
				parseForCsvFiles(f.getAbsolutePath());
			}
			String filePath = f.getAbsolutePath(); //Getting the path and name of the file we found
			String fileExtenstion = filePath.substring(filePath.lastIndexOf(".") + 1,filePath.length());

			if("csv".equals(fileExtenstion)){ //Checks if its the file we wanted
				CSVReader csvr = new CSVReader();
				l = csvr.Reader(filePath); // Calls a function to read from this file
				p.add(l);		 //Adding to the project the data in the file 
			}
			tokml.convert(p); // Converting to kml file the data in the project  


		}
		System.out.println(p);

	}	

}