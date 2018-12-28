package prob4;

public class StringUtil {

    public static String concatenate(String[] str) {
        //문자열을 결합하여 리턴 하는 메소드 구현
    	String strSet = "";
    	
    	for (String s : str) {
    		strSet += s;
    	}
    	
    	return strSet;
    }

}
