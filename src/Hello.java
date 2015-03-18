
public class Hello {
	String greeting;
	public Hello(String lang){
		switch (lang){
		case "English": greeting = "Hello!";
			break;
		case "Vietnamese": greeting = "Xin Chao!";
			break;
		default:greeting = "Hello";
		}
	}
	
	public void printMsgOut(){
		System.out.println(greeting);
	}
}
