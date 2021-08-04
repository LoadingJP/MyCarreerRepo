package banking.core;
import java.util.regex.*;
public class Login {
	
	public boolean hasNumber(String passwordString) {
		
		boolean count = false;
		
		for (int i = 0; i < passwordString.length(); i++) {
			
			String string = Integer.toString(i);
			
			if (passwordString.contains(string)) {
				
				count = true;
				
			}
		}
		
		return count;
		
	}
	
	public boolean hasCapital (String passwordString) {
		
		  boolean containsCapital = false;
		while(true){
			
			for (int i = 65; i <=90; i++) {
				
				char c = (char)i;
				
				String string = Character.toString(c);
				
				if (passwordString.contains(string)) {
					
					containsCapital = true;
				}
	
				
			}
			
			return containsCapital;
		}
		
		
	}
	
	
	public boolean inLength(String passwordString) {
		
		int length = passwordString.length();
		
		boolean properLength = false;
		
		if (length > 8 && length < 15) {
			
			properLength = true;
			
		}
		
		else {
			
			properLength = false;
		}
		
		
		return properLength;
		
	}
	
	public boolean hasSpecialCharacter(String passwordString) {
		
		String requiredPattern = "^(.+)@(\\S+)$"; 
		Pattern pattern = Pattern.compile(requiredPattern);
		
		Matcher matcher = pattern.matcher(passwordString);
		
		return matcher.matches();
		
		
	}
	
	

}
