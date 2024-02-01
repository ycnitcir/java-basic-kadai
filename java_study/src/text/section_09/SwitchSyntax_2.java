package text.section_09;

public class SwitchSyntax_2 {

	public static void main(String[] args) {
		// 0～9のいずれかをランダムに生成
        int randNum = (int)(Math.random() * 10);

        // 乱数randNumの値を出力
        System.out.println(randNum);

        // 当たりはずれの判定
        switch(randNum) {
            case 0, 9 -> System.out.println("大当たりです");
            case 1, 8 -> System.out.println("当たりです");
	      default   -> System.out.println("はずれです");
        }

	}

}
