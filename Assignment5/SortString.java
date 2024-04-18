public class SortString{


	public static StringBuffer bubble(StringBuffer str){


		for(int i=0;i<str.length()-1;i++){

	
			for(int j = i+1;j<str.length();j++){

				if(str.charAt(i)>str.charAt(j)){

					char temp = str.charAt(i);
					str.setCharAt(i,str.charAt(j));
					str.setCharAt(j,temp);
				}
			}
		}

		return str;
	}


	public static void main(String[] args){


		StringBuffer s = new StringBuffer("pradeep");
		System.out.print(bubble(s));
	}
}