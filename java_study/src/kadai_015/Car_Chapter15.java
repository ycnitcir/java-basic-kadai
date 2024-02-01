package kadai_015;

public class Car_Chapter15 {

		//フィールド（内部データ）
		private int gear = 1;
		private int speed = 10;
		
		//コンストラクタ（初期化処理）
		public Car_Chapter15() {
		}
		
		public void gearChange(int afterGear) {
			
			if(0 < afterGear  && afterGear< 6 ) {
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.gear = afterGear;
			this.speed = afterGear * 10;	
			}else {
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.gear = afterGear;
			this.speed = 10;		
			}
		}
			
		public void run() {
			System.out.println("速度は時速" + this.speed + "kmです");
		}
			
}
