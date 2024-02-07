package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		Jyanken_Chapter26 jyanken =new Jyanken_Chapter26();
		
		String myhand = jyanken.getMyChoice();
		String rivalhand =jyanken.getRandom();
		
		System.out.println("自分の手は" + jyanken.rsphandMap.get(myhand)+",対戦相手の手は" + jyanken.rsphandMap.get(rivalhand));
		
		if(myhand.equals(rivalhand)) {
			System.out.println("あいこです");			
		}
		else if(myhand.equals("r") && rivalhand.equals("s") || myhand.equals("s") && rivalhand.equals("p") ||
					myhand.equals("p") && rivalhand.equals("r") ) {
			
				System.out.println("自分の勝ちです");			
		}
		else if(myhand.equals("r") && rivalhand.equals("p") || myhand.equals("s") && rivalhand.equals("r") ||
				myhand.equals("p") && rivalhand.equals("s") ) {
		
			System.out.println("自分の負けです");			
	}
	

	}

}
