package File_format;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import GIS.Element;
import GIS.GIS_element;
import GIS.GIS_layer;
import GIS.Layer;
import GIS.MData;
import Geom.Point3D;
/**
 * @author Ortal and Tomer
 */
public class CSVReader {


	/**
	 * @param csvFile
	 * @return GIS_layer(hashest with elements) 
	 * This function reads from a given csv file and placing the data we want from it in an object layer 
	 */
	@SuppressWarnings("resource")
	public GIS_layer Reader(String csvFile) {

		BufferedReader br = null;
		String line = "";
		MData md = new MData();
		Point3D p =new Point3D(0,0);
		GIS_element e =new Element(md,p);
		GIS_layer l =new Layer();
		GIS_layer err =new Layer();
		try {
			br = new BufferedReader(new FileReader(csvFile)); //Reads from the csv file
			line=br.readLine();  // Skips the first 
			line=br.readLine();  // two lines

			if(!line.contains("CurrentLatitude") || !line.contains("AltitudeMeters") || !line.contains("CurrentLongitude")) {  //If the file doesn't contains one of this it is not a good file 

				return err;
			}
			while ((line = br.readLine()) != null) { //Progressing while we have a next line to read

				String[] s = line.split(","); //Splits the line to array by the ","
				md = new MData(s[1],s[0],s[2],23,new Date().getTime(),s[3],s[10]); //Placing each data to its place
				p = new Point3D(Double.parseDouble(s[7]),Double.parseDouble(s[6])); 
				e =new Element(md,p);
				l.add(e); //Adding to layer the line(element) we got

			}


		}catch (IOException er) {
			er.printStackTrace();
		}
		return l;
	}

}