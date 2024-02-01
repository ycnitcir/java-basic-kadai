package text.section_09;

public class AgeBaseFeeAnswer {

	public static void main(String[] args) {
		int ageGroup = 30; // 年代
		int fee;           // 料金

		fee = switch (ageGroup) {
			case 10 -> 1000;
			case 20 -> 2000;
			case 30, 40 -> 3000; // 30代と40代で同じ料金
			case 50 -> 4000;
			default -> 500;      // 上記以外の年代
		};

		System.out.println(ageGroup + "代の料金は" + fee + "円");

	}

}
