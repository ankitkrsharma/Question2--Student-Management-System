package has_a_uni;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine();
		Car car=new Car();
		car.engine=engine;
		
		System.out.println("car.col: " + car.col);
		System.out.println("car.engine: "+car.engine);
		System.out.println("car.engine.noOfCyl: "+car.engine.noOfCyl);

	}

}
