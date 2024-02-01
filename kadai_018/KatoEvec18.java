package kadai_018;

public class KatoEvec18 {

	public static void main(String[] args) {
		
		KatoTaro18 taro = new KatoTaro18("東京都中野区〇×");
		KatoIchiro18 ichiro = new KatoIchiro18("東京都中野区〇×");
		KatoHanako18 hanako = new KatoHanako18("東京都中野区〇×");
		
		taro.setGivenName("太郎");
		ichiro.setGivenName("一郎");
		hanako.setGivenName("花子");
		
		taro.execIntroduce();
		
		ichiro.execIntroduce();
		
		hanako.execIntroduce();
	
	}
}
