package monster;

public abstract class Monster {
	//フィールド
	private int HP;
	private int ATK;
	private int EXP;
	private int gold;
	private String name;

	//コンストラクタ
	public Monster() {System.out.println(getName()+"があらわれた！");}

	//アクセサー
	public String getName(){return this.name;}//モンスターは名前固定なのでgetterだけです


	public int getHP() {return this.HP;}
	public void setHP(int HP) {this.HP = HP;}

	public int getATK() {return this.ATK;}
	public void setATK(int ATK) {this.ATK = ATK;}

	public int getEXP() {return this.EXP;}

	public int getGold() {return this.gold;}
	public void setGold(int gold) {this.gold = gold;}

	//メソッド
	public void attack(Hero h) {
		System.out.println(getName()+"の攻撃！");
		h.hp -= getATK();
		System.out.println(getATK() + "のダメージ");}

	public abstract void technic();

	public abstract void profile();

}
