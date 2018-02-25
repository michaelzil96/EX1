
public class Main {

	public static void main(String[] args) {
		Adress adress = new Adress(11,"Paris","France");
		Student s1 = new Student(21,"Freddy Noma",adress);
		Student s2 = new Student(25,"Simon Mercury",adress);
		
		System.out.println("Freddy's adress is:");
		s1.printAdress();
		System.out.println("Simon's adress is:");
		s2.printAdress();
		
	}

}
