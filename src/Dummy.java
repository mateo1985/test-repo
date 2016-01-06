package dummy;

public class Dummy {
	public String toString() {
		return "some string:"+1;
	}
	
	public Integer getAge() {
		return 130;
	}
	
	public String AllowedStr(){
		return "ALLOW";
	}
	
	public String Information() {
		int i = 5;
		while ( i > 5 ) {
			console.log("test inforation");
			i--;
			
		}
		return "information";
	}
}
