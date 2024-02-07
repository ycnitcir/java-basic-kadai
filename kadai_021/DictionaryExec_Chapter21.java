package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		String[] searchArray = { "apple","banana","grape","orange"};
	
		for(int i=0 ; i < searchArray.length; i++) {
			int cnt =0;
			 for(String key : dictionary.dictionaryMap.keySet()){
				 
					if(searchArray[i].equals(key)) {
						 System.out.println(searchArray[i] +"の意味は"+ dictionary.dictionaryMap.get(searchArray[i]));	
						 break;
					}else {
						cnt++;						
					}				
			}
			 if(cnt == dictionary.dictionaryMap.size()) {
				 
				 System.out.println(searchArray[i] +"は辞書に存在しません");				 
			 }
					 
		}
		
	}

}
