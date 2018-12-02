package GIS;

import java.util.Date;
import Geom.Point3D;
/**
 * @author Ortal and Tomer
 */
public class MData implements Meta_data{

	private String Name;
	private String BSSID;
	private String Capabilities;
	private int Frequency;
	private long Timestamp;
	private String Date;
	private String Color;


	public MData(String name,String bssid,String capabilities,int frequency,
			long timestamp,String date,String color) {
		this.Name=name;
		this.BSSID=bssid;
		this.Capabilities=capabilities;
		this.Frequency=frequency;
		this.Timestamp=timestamp;
		this.Date=date;
		this.Color=color;
	}
	public MData() {
		this.Name="";
		this.BSSID="";
		this.Capabilities="";
		this.Frequency=0;
		this.Timestamp=0; 
		this.Date="";
		this.Color="#red";
	}
	/**
	 * @return timestamp by milliseconds 
	 */
	public long getUTC() {
		return new Date().getTime();
	}

	public Point3D get_Orientation() {
		return null;
	}

	/**
	 * @param md
	 * @return true if two MDatas are equals
	 */
	public boolean equals(MData md) {
		if(this.Name==md.Name && this.BSSID==md.BSSID && this.Capabilities==md.Capabilities 
				&& this.Frequency==md.Frequency && this.Timestamp==md.Timestamp 
				&&this.Date==md.Date && this.Color==md.Color) return true;
		return false;
	}

	public String getName() {
		return Name;
	}
	public void setNAME(String nAME) {
		Name = nAME;
	}
	public String getBSSID() {
		return BSSID;
	}
	public void setBSSID(String bSSID) {
		BSSID = bSSID;
	}
	public String getCapabilities() {
		return Capabilities;
	}
	public void setCapabilities(String capabilities) {
		Capabilities = capabilities;
	}
	public int getFrequency() {
		return Frequency;
	}
	public void setFrequency(int frequency) {
		Frequency = frequency;
	}
	public long getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(long timestamp) {
		Timestamp = timestamp;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "MData :Name=" + Name + ", BSSID=" + BSSID + ", Capabilities=" + Capabilities + ", Frequency="
				+ Frequency + ", Timestamp=" + Timestamp + ", Date=" + Date + ", Color=" + Color;
	}

}