//package codingbat;
//
//public class check {
//	public static void main(String[] args) {
//		String str = "32423432";
//	
//	
//		if(str.length() == 0){
//		    return "";
//		  }else if(str.length()) == 1{
//		    if(str.substring(0,1).equals("a")){
//		     return "a"; 
//		    }else{
//		      return "";
//		    }  
//		  }else if(str.length() == 2){
//		    if(str.charAt(0) == 'a'){
//		      if(str.charAt(1) == 'b'){
//		        return "ab";
//		      }else{
//		        return "a";
//		      }
//		    }else{
//		      return "";
//		    }
//		  }else{
//		    if(str.substring(0,1).equals("a")){
//		      if(str.substring(1,2).equals("b")){
//		        return str;
//		      }else{
//		        return "a" + str.substring(2);
//		      }
//		    }else if(str.substring(1,2).equals("b")){
//		      return str.substring(1);
//		    }
//		  }else{
//		    return str.substring(2);
//		  }
//
//}