
public class GoodBye {
	String msg;
	public GoodBye(String lang){
		switch (lang){
		case "English":msg = "Good bye!";
			break;
		case "Vietnamese":msg = "Tam biet!";
			break;
		default:msg = "Good bye!";
		}
	}

	public void printMsgOut(){
		System.out.println(msg);
	}
}
