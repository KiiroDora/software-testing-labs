package lab1;

public class StrReverse {

	public String strRev(String s) {
		String rev = ""; //reversed string to be returned
		String dummy = ""; //dummy string to be used on assignment operations only
		
		for (int i = s.length()-1; i >= 0; i--) { //starting at the string's length, count down and do the following until 0
			dummy = rev + s.charAt(i); //the current index char appended to current reversed string, assigned to dummy string
			rev = dummy; //assign dummy string to the string to be returned
		}
		
		return rev; //return the reversed string
	}
}
