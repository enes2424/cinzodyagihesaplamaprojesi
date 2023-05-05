import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Doğum Yılınızı Giriniz : ");
		int yil = input.nextInt();
		String burc = "";
		switch(yil % 12) {
			case 0 -> burc = "Maymun";
			case 1 -> burc = "Horoz";
			case 2 -> burc = "Köpek";
			case 3 -> burc = "Domuz";
			case 4 -> burc = "Fare";
			case 5 -> burc = "Öküz";
			case 6 -> burc = "Kaplan";
			case 7 -> burc = "Tavşan";
			case 8 -> burc = "Ejderha";
			case 9 -> burc = "Yılan";
			case 10 -> burc = "At";
			case 11 -> burc = "Koyun";
		}
		System.out.print("Çin Zodyağı Burcunuz : " + burc);
	}

}
