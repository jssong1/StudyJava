package bitcamp.java142.common;

public abstract class CommonUtils {
	public static String extensionMethod(String fullName){
		String extens = "";
		if (fullName != null && fullName.length()>0){
			int index = fullName.indexOf('.');
			extens = fullName.substring(index+1);
		}//if끝
		return extens;
	}//함수끝



}
