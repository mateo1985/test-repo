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
		log.information('test ABC');
		return "inf";
	}
}
