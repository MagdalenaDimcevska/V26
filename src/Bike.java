
public abstract class Bike {
	Bike(){
		System.out.println("Bike is created");
		}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
		}
}
class Honda extends Bike {
	void run() {
		System.out.println("running safely...");
		}
}