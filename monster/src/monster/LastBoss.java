package monster;

public class LastBoss extends Monster{

	private int HP = 200;
	private int ATK = 60;
	private int EXP = 0;
	private int gold = 1000;
	private String name = "コロナウイルス";

	int r = new java.util.Random().nextInt(2);

	public void technic() {
			System.out.println(getName() + "は、ロックダウンを発動した！");
			System.out.println(h.getName()+ "はこの戦いを逃げ出せなくなった！");
			setEnmaku(0);}


	public void technic1() {
		System.out.println(getName()+"はアンチソーシャルディスタンスを発動した！");
		if (r == 0) {
			Amabie ama = new Amabie();
			SugaSori Su = new SugaSori();
			AbenoMask abe = new AbenoMask();

		}else if (r == 1){
			System.out.println("特に何も起こらなかった！");
		}else {
			Amabie ama = new Amabie();
			SugaSori Su = new SugaSori(); }}

	public void technic2() {
		System.out.println(getName() + "は、緊急事態宣言を発動した！");
		System.out.println(getName()+"の攻撃力が下がった！");
		System.out.println(getName() + "のHPが上がった！");
		setATK(getATK() -10);
		setHP(getHP() +50);

	}


	public void profile() {
		System.out.println("No.17 コロナウイルス");
		System.out.println("とても時事的なモンスター");
		System.out.println("いまだ謎に包まれており、パンデミックを企んでいる");	}
}


