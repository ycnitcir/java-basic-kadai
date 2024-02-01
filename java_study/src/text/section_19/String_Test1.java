package text.section_19;

public class String_Test1 {

	public static void main(String[] args) {
		String moji1 = "テスト";
		 String moji2 = "テスト";
	     String moji3 = "サンプル";

	     //moji1とmoji2を比較する
	      System.out.println(moji1.equals(moji2));
	      //moji1とmoji3を比較する
	      System.out.println(moji1.equals(moji3));
	     
	      
	      String moji4 = new String("test");
	      String moji5 = new String("test");
	      
	      //equals()メソッドで比較する  
	      if(moji4.equals(moji5)) {
	         System.out.println("equals()メソッドで比較した結果は等しい");
	      } else {
	         System.out.println("equals()メソッドで比較した結果は等しくない");
	      }
	       
	      //等価演算子(==)で比較する 
	      if(moji4 == moji5) {
	         System.out.println("等価演算子(==)で比較した結果は等しい");
	      } else {
	         System.out.println("等価演算子(==)で比較した結果は等しくない");
	      }
	      
	      
	      
	      
	}

}
