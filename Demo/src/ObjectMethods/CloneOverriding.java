package ObjectMethods;

public class CloneOverriding implements Cloneable {
	int id;

	public CloneOverriding(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
