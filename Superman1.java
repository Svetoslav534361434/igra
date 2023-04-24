
public class Superman1 {
    private String ime;
    private String strana;
    
    public Superman1() {
    	
    }
    public Superman1(String i) {
    	ime =i;
    }
    public Superman1(String i, String s) {
    	ime = i;
    	strana = s;
    }
    public void print() {
    	System.out.println("Аз съм " + ime + " и съм " + strana);
    }
    
    public void leti() {
    	System.out.println("         ,");
		System.out.println("       0/");
		System.out.println("      /7,");
		System.out.println("    .'(");
		System.out.println("  '^ / >");
		System.out.println("    / <");
		System.out.println("    `");
    }
//  public void bieSe() {
//  	String k = """
//   	    .=.,
//            ;c =\
//        __|  _/
//      .'-'-._/-'-._
//       /..   ____    \
//      /' _  [<_->] )  \
//     (  / \--\_>/-/'._ )
//      \-;_/\__;__/ _/ _/
//     '._}|==o==\{_\/
//        /  /-._.--\  \_
//       // /   /|   \ \ \
//      / | |   | \;  |  \ \
//    / /  | :/   \: \   \_\
//    /  |  /.'|   /: |    \ \
//    |  |  |--| . |--|     \_\
//    / _/   \ | : | /___--._) \
//   |_(---'-| >-'-| |       '-'
//          /_/     \_\
//    	""";
//    	System.out.println(k);
//   }
}
