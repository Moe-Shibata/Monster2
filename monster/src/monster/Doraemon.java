package monster;

public class Doraemon extends Monster{

	private int HP = 60;
	private int ATK = 25;
	private int EXP = 20;
	private int gold = 100;
	private String name = "あおたぬき";
	private int MAX_HP = 60;

	public int getMAX_HP() {return this.MAX_HP;}

	public void technic(Hero h) {
		System.out.println(getName() + "は、ポケットからどらやきを取り出した！");;
		System.out.println(getName()+"はどらやきを食べだした！");

		setHP(Math.min(getMAX_HP(),getHP() + 20));

		System.out.println(getName() + "はHPを回復した");
		System.out.println("　 　 ,　────　､\r\n" +
						"　　　／　　　/ ⌒ヽ⌒ヽ＼\r\n" +
						"　　/　　　, -|　　 ・|・　 |ヽヽ\r\n" +
						"　/　　 ／ 　 ｀ ー ●ｰ′ ヽｌ\r\n" +
						"　ｌ　　/　　　二　 　 |　二　　|\r\n" +
						"　| 　 l　　　 ─　　　|　─　 -､\r\n" +
						"　l 　 |　　　　　　 　 |　 　 __ ノ\r\n" +
						"　ヽ　ヽ　／´￣￣￣￣￣ /\r\n" +
						"　　 〉━━━━━O━━〈\r\n" +
						"　 /　　　 ／ ＿＿＿ ヽ　 ヽ\r\n" +
						"　/　　　 |　 ヽ　　　　ﾉ |　ｌ◯\r\n" +
						"　◯/　　 `ー‐<⌒ヽ─　 ヽ\r\n" +
						"　　 ｌ　　　　　　|　　|　　 　 ｌ\r\n" +
						"　 　 ` ー──く __ノ──");}

	public void profile() {
		System.out.println("No.4 あおたぬき");
		System.out.println("とてもどら焼きが好きなモンスター");
		System.out.println("ポケットにはいろいろなものが入っている");
		System.out.println("　　　　　　　　　　　　　　　 ______,,,,,,,,,,,,,,,,______\r\n" +
				"　　　　　　　　　　　　　,,,,:::::::ﾞﾞﾞﾞ､-‐‐-､:::::: -‐‐-､ﾞﾞﾞﾞ:::::::,,,,\r\n" +
				"　　　　　　　　　　　,,::\"::::::::::::::/　　　　ヽ/　　　　ヽ:::::::::::::\"::,,\r\n" +
				"　　　　　　　　　 ／::::::::::::::::;;;;l　　　　◎|＜　　　　l;;;;::::::::::::::::＼\r\n" +
				"　　　　　　　　／:::::::::::: ''\" 　 ヽ.　　　,.-‐-､　　　ノ　　\"'' ::::::::::::＼\r\n" +
				"　　　　　　　/::::::::::／　 ｰ-､,,,_　 ￣´l::::::::::::l｀￣ 　_,,,､-‐　＼:::::::::ヽ\r\n" +
				"　　　　　　 i':::::,､-‐-､.　　　　 ｀'''‐-　`‐-‐'　-‐'''´　　　　,.-‐-､::::::::i,\r\n" +
				"　　　　 　 i'::::/　　　　 　──-----　　|　　-----── 　　 　ヽ:::::::i,\r\n" +
				"　　　　　 i':::::{.　　　　　-----‐‐‐‐‐　 │　 ‐‐‐‐‐-----　　　　}::::::::i\r\n" +
				"　　　　　.|:::::i ヽ.,　　　　　　　　 _____,,,,,,,,|,,,,,,,_____　　　　　　 　 ,ノ i:::::::|\r\n" +
				"　　　　　.|::::|　　 ｀'t‐----‐''''''´　　　　　　　　　｀''''''‐---‐t''´　　|::::::i\r\n" +
				"　　　　　 i::::i　　　　i 　　　　　　　　　　　　　　　　　　　　　i　　　 i:::::i'\r\n" +
				"　　　　　 .'i:::i　　　　i 　　　　　　　　　　　　　　　　　　　　 i　　　 i::::i'\r\n" +
				"　　, -‐‐- ､::i,　　　 ヽ. 　　　　　 　　　　　　　　　　　　　 /　　　/::i'\r\n" +
				"　/　　　　　ヽi,　　　　ヽ　　　／ﾞﾞﾞﾞﾞﾞﾞ\"'‐--‐'\"ﾞﾞﾞﾞﾞ＼　　／ 　　 /:i'\r\n" +
				"　{　　　　　　} ヽ　　　　 ＼ /　　　　　　　　　　　　 i／ 　　　./'´\r\n" +
				"　ヽ 　　　　ノ:::::::＼　　　　 `''‐-､,,,,,,,,,_______,,,,,,,､-‐'´　　　 ／\r\n" +
				"　　｀'''''''''t\":::::::::::::::::＼,,,,__　 　　　　　　　　　　　　　__,,,,,／\r\n" +
				"　　　　 　 ＼::::::::::::::/;,,,,,,,,\"\"\"'''''''''''''ゝ‐-､''''''''''''''\"\"\",,,,,,,}\r\n" +
				"　　　　　　　 ＼::::::/:::::::::::\"\"\"'''''''''''''{=＝=}'''''''''''''\"\"\":::::::ヽ\r\n" +
				"　　　　　　　　　＼:::::::::::::::::::／　　　`ｰﾞ‐\"　　　 ＼:::::::::::::::＼");}
}
