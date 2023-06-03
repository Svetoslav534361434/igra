package superman;
import java.util.ArrayList;
import java.util.Scanner;
public class Superman {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        ArrayList <String> neshto = new ArrayList <String>();
		
		neshto.add("nametalo");
		for(int c = 0; c <= neshto.size(); c++) {
			System.out.print(neshto.get(c));
		}
        
		Superman1 s1 = new Superman1("Петър", "добър");
		Superman1 s2 = new Superman1("Ангел", "зъл");
		Superman1 s3 = new Superman1("Стивън");
		//System.out.println(s1.ime + "; " + s1.strana);
		//System.out.println(s2.ime + "; " + s2.strana);
		//System.out.println(s3.ime);
		
		int s1Godini = s1.getGodini();
		System.out.println(s1Godini);
		s1.setGodini(30);
		
		s1.leti();
		s2.bieSe();

		int[][] map = {
				{1, 1, 1} ,
				{2, 3, 3} ,
				{4, 1, 4} ,
				{3, 2, 1}
		};		
		for(int i = 0; i<=map.length; i++) {
			int[] arr = map[i];
			for(int j = 0; j<=arr.length; j++) {
				if (arr[j] == 1) {
					System.out.println("🌍");
				} else if (arr[j] == 2) {
					System.out.println('☀');
				} else if (arr[j] == 3) {
					System.out.println("🌙");
				} else if (arr[j] == 4) {
					System.out.println('⚠');
				}	
			}
		}
		
		//Избор на герой
		if(x==1) {
		System.out.println("Izbrahte geroy ot stranata na dobroto " + s1.getIme() + s1.getStrana());	
		s1.leti();
		}
		else {
		System.out.println("Izbrahte geroy ot stranata na zloto" + s2.getIme() + s2.getStrana());	
		s2.bieSe();
		}
	}

}
