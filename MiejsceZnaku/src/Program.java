import javax.print.attribute.standard.RequestingUserName;

public class Program {

	public static int NaKtorymMiejscuZnak (String tekst,char z){ //tylko dla 1 wyst¹pienia , jezeli nie ma -1
		
		
	 char[]tab=tekst.toCharArray();
		for (int i = 0; i <tab.length ; i++) {
			if(tab[i]==z){
				return i;
			}
		
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tekst="HEH SOKO£Y HEJ HEJ HEJ";
		char[]tab=tekst.toCharArray(); 
		tekst.toCharArray();
		for (int i = 0; i < tekst.length(); i++) {
			if(tab[i]=='H'){
				System.out.printf("H jest na miejscu: %s \n", i);
			}
		}
		System.out.println(NaKtorymMiejscuZnak(tekst, 'H'));
	}

}
