package week1.day2;

public class Car {
	public static void main(String[] args) {
		Car vehicle = new Car();
		vehicle.carName();
		String applyBreak = vehicle.applyBreak();
		System.out.println(applyBreak);
		String applyGear = vehicle.applyGear();
		System.out.println(applyGear);
		boolean switchOnAc = vehicle.switchOnAc();
		System.out.println(switchOnAc);
		String applyAccelerate = vehicle.applyAccelerate();
		System.out.println(applyAccelerate);
	
	}
	public void carName() {
		System.out.println("Hyundai");		
	}
	
	public String applyBreak() {
		String applyBreak = "Vehicle Stopped";
		return applyBreak;
	}
	
	public String applyGear() {
		String applyGear = "Gear Shifted To 1";
		return applyGear;
	}
	
	public boolean switchOnAc() {
		return true;
	}
	
	public String applyAccelerate() {
		String applyAccelerate = "Vehicle Started Moving On 20kmph";
		return applyAccelerate;
	}
	
}
