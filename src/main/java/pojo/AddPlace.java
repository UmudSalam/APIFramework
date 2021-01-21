package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//@Data
//@AllArgsConstructor
public class AddPlace {

	private int accuracy;
	private String name;
	private String phone_number;
	private String address;
	private String website;
	private String language;
	private Location location;
	private List<String> types;

//	public AddPlace(int accuracy, String name, String phone_number, String address, String website, String language, Location location, List<String> types) {
//		this.accuracy = accuracy;
//		this.name = name;
//		this.phone_number = phone_number;
//		this.address = address;
//		this.website = website;
//		this.language = language;
//		this.location = location;
//		this.types = types;
//	}

		public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}



//	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		AddPlace ap = new AddPlace(50, "Arpat",  "133243242", "hfiwfgpiu fi road", "ww.jof.c0om", "frendh", new Location(2.0,3.0), list );
//
//		ap.getAccuracy();
//	}

}