package monster;

public class Paon extends Monster{

	private int HP = 40;
	private int ATK = 50;
	private int EXP = 50;
	private int gold = 100;
	private String name = "ぱおん";

	public void technic() {
		System.out.println(getName() + "はMCMのリュックを背負っている！");	}

	public void profile() {
		System.out.println("No.13 ぱおん");
		System.out.println("とてもぴえんなモンスター");
		System.out.println("ぴえんこえてぱおん");
}
}