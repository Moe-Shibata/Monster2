package monster;

public class AbenoMask extends Monster{

	private int HP = 60;
	private int ATK = 50;
	private int EXP = 50;
	private int gold = 10;
	private String name = "アベノマスク";
	private int MAX_HP = 60;

	public int getMAX_HP() {return this.MAX_HP;}

	public void technic() {
		System.out.println(getName() + "は、給付金を発動した！");;
		System.out.println(getName()+ "のゴールドと攻撃力が上がった！");

		setATK(getATK() + 20);
		setGold(getGold() + 100);}

	public void technic1() {
		System.out.println(getName()+"は官製マスクを配布した！");

		setHP(Math.min(getMAX_HP(),getHP() + 20));

		System.out.println(getName() + "はHPを回復した!");
		}

	public void profile() {
		System.out.println("No.16 アベノマスク");
		System.out.println("とてもありがたいマスク型のモンスター");
		System.out.println("日本史上はじめて国民に配給されたマスク");	}
}
