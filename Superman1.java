package superman;

public class Superman1 {
private String ime;
private String strana;
private int godini;

public Superman1() {
	
}
public Superman1(String i) {
	ime = i;
}
public String getIme() {
	return ime;
}
public String getStrana() {
	return strana;
}
public int getGodini() {
	return godini;
}
public void setGodini(int g) {
	if (g >= 0 && g <=100) {
	godini = g;
	}
}

public Superman1(String i, String s) {
	ime = i;
	strana = s;
}

public void leti() {
	System.out.println("        ,");
	System.out.println("      0/");
	System.out.println("     /7,");
	System.out.println("   .'(");
	System.out.println(" '^ / >");
	System.out.println("   / <");
	System.out.println("   `");
	
}
public void bieSe() {
	System.out.println("         .=.,");
	System.out.println("        ;c =\\ ");
	System.out.println("       __|  _/");
	System.out.println("     .'-'-._/-'-._ ");
	System.out.println("    /..   __    \\ ");
	System.out.println("   /' _  [<_->] )  \\ ");
	System.out.println("  (  / \\--\\_>/-/'._ ) ");
	System.out.println("   \\-;_/\\__;__/ _/ _/ ");
	System.out.println("    '._}|==o==\\{_\\/ ");
	System.out.println("     /  /-._.--\\  \\_");
	System.out.println("    // /   /|   \\ \\ \\");
	System.out.println("   / | |   | \\;  |  \\ \\");
	System.out.println("  / /  |  |   \\: \\   \\_\\");
	System.out.println(" /  |  /.'|   /: |    \\ \\ ");
	System.out.println(" |  |  |--| . |--|     \\_\\");
	System.out.println(" / /   \\ | : | /___--.) \\");
	System.out.println("|_(---'-| >-'-| |       '-'");
	System.out.println("snd    /_/     \\_\\ ");
	
}

public void print() {
	System.out.println("Аз съм " + ime + " и съм " + strana);
	System.out.println("На " + godini + "години съм");
	//System.out.println("Аз съм " + ime + " и съм " + strana);
}
}
