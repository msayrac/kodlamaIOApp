package kodlamaIOApp.core.logging;

public class EmailLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("Logged into the email : "+ data);
		
	}

}
