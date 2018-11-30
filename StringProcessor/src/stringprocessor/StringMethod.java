package stringprocessor;

public class StringMethod {
	
	public static int countYZ(String str) {
		  int count = 0;
		  
		  for (int i = 0; i < str.length(); i++) {
		    if (!Character.isLetter(str.charAt(i)) && i > 0) {
		      if (Character.toLowerCase(str.charAt(i - 1)) == 'y' || Character.toLowerCase(str.charAt(i - 1)) == 'z') {
		        count++;
		      }
		    } else if (i == str.length() - 1 && (Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z')) {
		      count++;
		    }
		  }
		  return count;
	}
	
	public static String withoutString(String base, String remove) {
		  String s = "";
		  String b = base.toLowerCase();
		  String r = remove.toLowerCase();
		  
		  for (int i = 0; i < base.length(); i++) {
		    if (i > base.length() - remove.length() && !b.substring(i).equals(r)) {
		      s += base.substring(i, i + 1);
		    } else if (b.substring(i, i + remove.length()).equals(r)) {
		      i += remove.length() - 1;
		    } else {
		      s += base.substring(i, i + 1); 
		    } 
		  }
		  return s;
	}
	
	public static boolean equalIsNot(String str) {
		  int is = 0;
		  int not = 0;
		  
		  for (int i = 0; i < str.length() - 1; i++) {
		    if (str.substring(i, i + 2).equals("is")) {
		      is++;
		    }
		  }
		  for (int i = 0; i < str.length() - 2; i++) {
		    if (str.substring(i, i + 3).equals("not")) {
		      not++;
		    }
		  }
		  return is == not;
	}
	
	public static String startWord(String str, String word) {
		  if (str.length() > 0 && str.length() > word.length()) {
		    if (str.substring(1, word.length()).equals(word.substring(1))) {
		      return str.charAt(0) + word.substring(1);
		    }
		    return "";
		  } else if (str.length() > 0 && str.length() == word.length()) {
		    if (str.substring(1).equals(word.substring(1))) {
		      return str;
		    }
		  }
		  return "";
	}
	
	public static String nTwice(String str, int n) {
		if(str.length() == 0) {
			return "";
		}
		  return str.substring(0, n) + str.substring(str.length() - n); 
	}

	public static String twoChar(String str, int index) {
		  if (index < str.length() - 1 && index >= 0) {
		    return str.substring(index, index + 2);
		  } else {
		    return str.substring(0, 2);
		  }
	}
	
	public static String comboString(String a, String b) {
		  if (a.length() > b.length()) {
		    return b + a + b;
		  } else {
		    return a + b + a;
		  }
	}
	
	public static String theEnd(String str, boolean front) {
		  if (front) {
		    return str.substring(0, 1);
		  } else {
		    return str.substring(str.length() - 1);
		  }
	}
	
	public static String withoutX(String str) {
		  if (str.length() > 1) {
		    if (str.substring(0, 1).equals("x")) {
		      if (str.substring(str.length() - 1).equals("x")) {
		        return str.substring(1,str.length() -1);
		      }
		      return str.substring(1);
		    }
		    if (str.substring(str.length() - 1).equals("x")) {
		      return str.substring(0, str.length() - 1);
		    }
		    return str;
		  }
		  if (str.equals("x")) {
		    return "";
		  }
		  return str;
	}
	
	public static boolean endsLy(String str) {
		  if (str.length() > 1) {
		    if (str.indexOf("ly") == str.length() - 2){
		      return true;
		    }
		  }
		  return false;
	}

}
