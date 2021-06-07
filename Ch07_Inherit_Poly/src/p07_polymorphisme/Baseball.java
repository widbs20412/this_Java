package p07_polymorphisme;

public class Baseball extends Game {

	public void write() {
		System.out.println("BaseBall Method()");
	}
	@Override
	public void type() {
		System.out.println("inherit() - Super Game");
	}
}
