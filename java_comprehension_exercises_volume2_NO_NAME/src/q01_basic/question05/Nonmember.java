package q01_basic.question05;

public class Nonmember extends AbstMember {

	public Nonmember(String name) {
		this.name = name;

	}

	@Override
	public void buyItem() {

		System.out.println("---BUY ITEM---");
		System.out.println(name + "purchased the item at a fixd price");

	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println(name + "is a non-member");
		System.out.println("******************");

	}

}
