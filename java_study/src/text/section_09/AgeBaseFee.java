package text.section_09;

public class AgeBaseFee {

	public static void main(String[] args) {
		int fee = 3000;
		int age = 30;
		
		switch (fee) {
		case 1000 -> System.out.println("10代の料金は" + fee + '円');
		case 2000 -> System.out.println("20代の料金は" + fee + '円');
		case 3000  -> {
			if (age == 30) {
				System.out.println("30代の料金は" + fee + '円');
			}else {
				System.out.println("40代の料金は" + fee + '円');
			}
		}
		case 4000 -> System.out.println("50代の料金は" + fee + '円');
		default -> System.out.println("それ以外は" + 500 + '円');
		}
		
		
	}

}
