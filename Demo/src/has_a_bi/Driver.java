package has_a_bi;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car();
		Engine engine = new Engine();
		
		System.out.println("car.col: " + car.col);
		System.out.println("car.engine: "+car.engine);
		//System.out.println("car.engine.noOfCyl: "+car.engine.noOfCyl);
		engine.car=car;

		System.out.println("car.col: " + car.col);
		System.out.println("car.engine: "+car.engine);
		System.out.println("car.engine.noOfCyl: "+car.engine.noOfCyl);
		
	}

}
