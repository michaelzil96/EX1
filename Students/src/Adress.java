
public class Adress {
	private int houseNum;
	private String city;
	private String country;
	
	public Adress(int houseNum, String city, String country){
		this.houseNum = houseNum;
		this.city = city;
		this.country = country;
	}
	
	public int getHouseNum(){
		return this.houseNum;
	}
	public String getCity(){
		return this.city;
	}
	public String getCountry(){
		return this.country;
	}

}
