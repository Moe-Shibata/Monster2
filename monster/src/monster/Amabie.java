package monster;

public class Amabie extends Monster{

	private int HP = 60;
	private int ATK = 40;
	private int EXP = 20;
	private int gold = 50;
	private String name = "アマビエ";
	private int MAX_HP = 60;

	public int getMAX_HP() {return this.MAX_HP;}

	public void technic() {
		System.out.println(getName() + "は" + h.getName() + "に自分の姿を描かせた！");

		setHP(Math.min(getMAX_HP(),getHP() + 30));

		System.out.println(getName() + "はHPを回復した");
	}
	public void profile() {
		System.out.println("No.11 アマビエ");
		System.out.println("とても日本に伝わるモンスター");
		System.out.println("自分の絵を描かせたい");
		System.out.println("　　／三三＼／三三＼\r\n" +
				"　 / 彡三ミ/彡三ヾヾヽ\r\n" +
				"　f||||／￣￣＼|||||||\r\n" +
				"　||||/　　　　ヽ|||||\r\n" +
				"　||||K･〉〈･〉／＼|||\r\n" +
				"　||／￣￣　　 Y女/|||\r\n" +
				"　||￣￣＞　　 |／||||\r\n" +
				"　||||＜＿　　　||||||\r\n" +
				"　|||||/＼＿＿＿||||||\r\n" +
				"　||||/＼＿＿＿_／||||\r\n" +
				"　||||L人_人_人_人||||\r\n" +
				"　||||L_人_人_人_ ||||");
}
