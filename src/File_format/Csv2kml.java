package File_format;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.util.Iterator;
import GIS.Element;
import GIS.GIS_element;
import GIS.GIS_layer;
import GIS.MData;
import GIS.Project;
/**
 * @author Ortal and Tomer
 */

public class Csv2kml extends MData{
	private File csv ;
	private PrintWriter pw; 
	private BufferedReader b_read;

	/**
	 * @param pro
	 * This function converting a given project with data(Point3D,MData) to a kml file
	 */
	
	public void convert(Project pro) {
		MData md =new MData();

		try {
			pw = new PrintWriter("C:\\Users\\tomer\\eclipse-workspace\\csvfiles\\destination.kml" ,"UTF-8"); //The destination file to the kml file we created


			pw.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");          // The first two lines in the csv files
			pw.append("<kml xmlns=\"http://www.opengis.net/kml/2.2\">"
					+ "<Document><Style id=\"red\"><IconStyle><Icon><href>"
					+ "http://maps.google.com/mapfiles/ms/icons/red-dot.png</href>"
					+ "</Icon></IconStyle></Style><Style id=\"yellow\">"
					+ "<IconStyle><Icon><href>http://maps.google.com/mapfiles/ms/icons/yellow-dot.png</href>"
					+ "</Icon></IconStyle></Style><Style id=\"green\"><IconStyle><Icon>"
					+ "<href>http://maps.google.com/mapfiles/ms/icons/green-dot.png</href>"
					+ "</Icon></IconStyle></Style><Folder><name>Wifi Networks</name>\r\n");

			Iterator<GIS_layer> itPro = pro.iterator(); 
			while(itPro.hasNext()) {         //Running on all the layers we got
				GIS_layer l =itPro.next();
				Iterator<GIS_element> itL = l.iterator(); //Running on all the elements we got

				while(itL.hasNext()) {
					Element e =(Element)itL.next();
					//for(File f : files)
					//while((e) !=null ) {


					String SpotColor =md.getColor();
					if(e.getMd().getColor().equals("GSM")) {  //Checks the type of the coordinates and color it correspondingly
						SpotColor ="#green";
					}
					
					/*
					 * Writing the data to the kml file
					 */
					pw.append("<Placemark>\n");
					pw.append("<name><![CDATA[" + e.getMd().getName() +"]]></name>\n");
					pw.append("<description><![CDATA[BSSID: <b>" + e.getMd().getBSSID() +"</b><br/>Capabilities: <b>" 
							+  e.getMd().getCapabilities() +"</b><br/>Frequency: <b>" +"1000"+
							"</b><br/>Timestamp: <b>" + md.getUTC()  + "</b><br/>Date: <b>" + 
							e.getMd().getDate()+"</b>]]></description><styleUrl>" +SpotColor +"</styleUrl>\n");
					pw.append("<Point>\n");
					pw.append("<coordinates>" + e.getP().x() +"," +e.getP().y() +"</coordinates></Point>\n");
					pw.append("</Placemark>\n");
					pw.flush();
				}
				

			}
			pw.append("</Folder>\n");
			pw.append("</Document></kml>\n");
			pw.flush();


		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't found file");
		}

	}

	public File getCsv() {
		return csv;
	}

	public PrintWriter getPw() {
		return pw;
	}

	public BufferedReader getB_read() {
		return b_read;
	}


}