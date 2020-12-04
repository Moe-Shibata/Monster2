package monster;

public class Choppar extends Monster{

	private int HP = 50;
	private int ATK = 30;
	private int EXP = 20;
	private int gold = 30;
	private String name = "トナカイ";
	private int MAX_HP = 50;

	public int getMAX_HP() {return this.MAX_HP;}

	public void technic() {
		System.out.println(getName()+"はわたあめを食べだした！");

		setHP(Math.min(getMAX_HP(),getHP() + 20));

		System.out.println(getName() + "はHPを回復した！");	}

	public void profile(){
		System.out.println("No.9 トナカイ");
		System.out.println("とてももふもふなモンスター");
		System.out.println("10年前ギャルに大流行した");}

}
