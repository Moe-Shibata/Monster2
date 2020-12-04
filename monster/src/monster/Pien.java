package monster;

public class Pien extends Monster{

	private int HP = 50;
	private int ATK = 30;
	private int EXP = 10;
	private int gold = 20;
	private String name = "ぴえん";

	public void technic() {
		System.out.println(getName() + "はぴえんこえてぱおんを発動した！");
		Paon p = new Paon();
		System.out.println("ぴえんはぱおんを呼び出した");
	}

	public void profile() {
		System.out.println("No.12");
		System.out.println("とても地雷なモンスター");
		System.out.println("ぴえんと口にする女性に近づいてはいけない");

	}
}
