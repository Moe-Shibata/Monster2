package monster;

public class Nobita extends Monster  {

	private int HP = 30;
	private int ATK = 10;
	private int EXP = 10;
	private int gold = 10;
	private String name = "のびお";

	public void technic(Hero h) {
		System.out.println("　　　　　　　　　＿＿＿＿\r\n" +
				"　　　　　　 ／　　　　　　　　＼〟\r\n" +
				"　　　　　　i──────┐　ヽ\r\n" +
				"　　　　　　| ⌒ヽ　⌒ヽ＼　|　　 |　\r\n" +
				"　　　　　　|　 ＞|・　　 |─-|＿ /　\r\n" +
				"　　　　　　j ーｃ　─　′　　　 ヽ\r\n" +
				"　　　　 　 ⊂＿＿＿_ ／!　　 _ﾉ　\r\n" +
				"　　＿(＼　＼ ＼ ＿＿／　／　　　　　　\r\n" +
				"　（─　　 ヽ､　` ─_──イ- ､ 　　　　　　　　　　　\r\n" +
				"　 ヽ二＿ノ　＼／|/＼ ／　　 ＼\r\n" +
				"　　　　　 ＼\r\n");}

	public void profile() {
		System.out.println("No.1 のび のびお");
		System.out.println("とても射撃がとくいなモンスター");
		System.out.println("射撃のはやさはゴルゴ31よりはやい");
		System.out.println("　　　　 ,　 ───　 ､\r\n" +
				"　 ゝ／ ＿＿＿_＿_＿_＼\r\n" +
				"　 /　　|　/　─　､　─ ､ｌ\r\n" +
				"　/　　 |　/　　　　ｌ　　　 l\r\n" +
				"　|　　 |─|　 　 （・|＜ 　 |　　(⌒ヽ\r\n" +
				"　Y⌒｀　　ヽ＿　ノっ＿ ﾉ　三　　 ）\r\n" +
				"　 ヽ_　 　 ､＿＿＿＿つ ｌ　　(､_ ノ\r\n" +
				"　　　 ＼　 ＼－､-､_／ノ　 _　　 _\r\n" +
				"　　　　 /｀ ー |　ｌ　|‐ ´　　ｌ　ｌ／／)､\r\n" +
				"　　　/´ ＼／ `ー´ ＼　　 ｌ　)　 ヽ´ﾉ\r\n" +
				"　 　 |　　ヽ　　　　 |／＼／　　__ ／\r\n" +
				"　　 ├─┤　　　　| ､\r\n" +
				"");}
}
