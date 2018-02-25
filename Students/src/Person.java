
public class Person {
	private int age;
	private String fullName;
	private Adress adress;
	
	public Person(int age, String fullName, Adress adress){
		this.age = age;
		this.fullName = fullName;
		this.adress = adress;
	}
	
	public void printAdress(){
		System.out.println("House number:" + adress.getHouseNum());
		System.out.println("City:" + adress.getCity());
		System.out.println("Country: " + adress.getCountry() + "\n");
	}
}
