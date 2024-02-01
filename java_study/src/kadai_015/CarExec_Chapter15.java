package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		
		Car_Chapter15 carinfo = new Car_Chapter15();
		
		carinfo.gearChange(3);
		carinfo.run();
		
		carinfo.gearChange(2);
		carinfo.run();
		
		carinfo.gearChange(4);
		carinfo.run();
		
		carinfo.gearChange(5);
		carinfo.run();
	}
}
