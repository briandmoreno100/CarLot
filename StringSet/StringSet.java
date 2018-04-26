/*
 * 
 * author Brian Moreno
 */
import java.util.ArrayList;
public class StringSet extends ArrayList <String> {

	
	
	public StringSet() {
			
	}
	
	public int numChars() {
		int numChar = 0;
		
		for (int i = 0; i < super.size(); i++) {
			numChar += super.get(i).length();	
		}
		return numChar;
	}
	
	public int countStrings(int len) {
		int countStr = 0;
		for (int i = 0; i < super.size(); i++) {
			if (super.get(i).length() == len)
			countStr++;
		}	
		return countStr;
	}
		
}