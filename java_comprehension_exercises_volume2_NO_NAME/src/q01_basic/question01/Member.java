package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	//TODO ここから実装する

	String name;
	int age;
	int rank;

	//引数なしのコンストラクタ
	public void showMember() {

		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("rank:" + rank);
		System.out.println("******************");

	}

}
