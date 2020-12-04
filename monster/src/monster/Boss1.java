package monster;

public class Boss1 extends Monster {

	private int HP = 110;
	private int ATK = 60;
	private int EXP = h.MAX_EXP;
	private int gold = 200;
	private String name = "季節性肺炎";

	int r = new java.util.Random().nextInt(2);

	public void technic() {
		if (r == 0) {
			System.out.println(getName() + "は、エアロゾルを発動した！");;
			System.out.println(getName()+ "に65ダメージ！");
		}else {
			System.out.println(getName() + "はこちらの様子をうかがっている");}}

	public void technic1() {
		System.out.println(getName()+"は集団感染を発動した！");
		if (r == 0) {
			Amabie ama = new Amabie();
		}else if (r == 1){
			System.out.println("特に何も起こらなかった！");
		}else {
			SugaSori Su = new SugaSori(); }}

	public void profile() {
		System.out.println("No.17 季節性肺炎");
		System.out.println("とても季節性の肺炎モンスター");
		System.out.println("ただの肺炎と言われているが・・・？");	}
}


