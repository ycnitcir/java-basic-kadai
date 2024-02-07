package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//フィールドの値
	public HashMap<String, String> rsphandMap;
	
	//コンストラクタ　マップの初期化処理
	public Jyanken_Chapter26() {
		rsphandMap = new HashMap<String, String>();
		rsphandMap.put("r","グー");
		rsphandMap.put("s","チョキ");
		rsphandMap.put("p","パー");
		
	}
	
	public String getMyChoice() {
		Boolean judg = true;
		String input = null;
		Scanner mychoice = new Scanner(System.in);
		
		while(judg) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		System.out.println("入力したらエンターキーを押してください");
		//Scannerクラスのオブジェクトをtry文でリソースを自動的にクローズ
		
			//入力した内容を取得する
			input = mychoice.next();
		
		int cnt =0;
			 for(String key : rsphandMap.keySet()){				 
					if(input.equals(key)) {
						judg = false;
					}else {
						cnt++;						
					}				
			}
			 if(cnt == rsphandMap.size()) {
				 System.out.println("不正な値が入力されました。r、s、pのいずれかを半角入力して下さい");	
				 
			 }
		}	
		mychoice.close();
		return input;
	}
	
	public String getRandom() {
		
		String[] rspArray = {"r", "s", "p"};
		int random;
		random = (int) Math.floor(Math.random()*2);
		
		String rsphand = rspArray[random];
		
		return rsphand;
	}
	
	
	
	
}
