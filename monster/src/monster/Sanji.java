package monster;

public class Sanji extends Monster{

	private int HP = 50;
	private int ATK = 30;
	private int EXP = 20;
	private int gold = 30;
	private String name = "金髪コック";
	private int MAX_ATK = 100;

	public void technic() {
		System.out.println(getName()+"は黒足を発動した！");
		System.out.println("攻撃力が上がった！");

		setATK(getATK()+20);}

	public void profile(){
		System.out.println("No.5 金髪コック");
		System.out.println("とても女好きなモンスター");
		System.out.println("クソお世話になる");
		System.out.println(" 　 　 ,.r'r-―-ﾐ　r―-､ヽ､　 ＼ ヽ　＼\r\n" +
				"　　　　　　　　／／r'\"⌒ヽ,.r'　ヽ､ ＼､ヽ　 ヽ ヽヽ､＼\r\n" +
				"　　　　　 　 /／ｒ'´ ／⌒　,.､ヽ、 ヽ　 ＼ヽ　 ヽ丶 ヽ ヽ\r\n" +
				"　　　　　　// /　,r'／　ｒヽ _ヽヽヽ　ヽ　丶ヽ　 i　､ 、　 ',\r\n" +
				"　　　　　 ,'/　　/ 〃 //`ﾞ \" ヽヾ､i　　i　　i i i　 ll　l　i i　',\r\n" +
				"　　 　 　 li / 〃〃　//　　　　', i l l!　 l! 　 l!l l　 i! l l|! !　i\r\n" +
				"　　 　 　 !il　//〃　ｉ,'　　 　 　 ', i l i!　 l|　 lｉ li　 li　!li! l　|\r\n" +
				"　　 　 　 ! ｌ l !i l!i　 li __　　　 　 i l l l!　 li 　 !! il　li! li|｜ !\r\n" +
				"　　 　 　 l | l!|l　lil　!｢,. ヽ　 　 　 l i l i!　 l !　li　il　l| |l 　 !\r\n" +
				"　　　　　 l | | lii |!　i|ヽﾞ.ノ　　　　 l ! ', i　 lｉ　 l! l!l　l| il　 l\r\n" +
				"　　　　　 |!|i!L!|i l! ||｀＞-､..__　 　 !ﾄ l　　 l|　 | l!　l!|ﾚ､ |\r\n" +
				"　　 　 　 ハ{ rヾil! ｌ|-―ｔ;ｧ‐ミ` 、 l|i　ﾄ、　l　　　 lil/- N\r\n" +
				"　　　　　 　 ヽ（ヾ ',|!｀`'' '''\"´ 　 ｌ　| ', | ', 　 li　　 /,'ｧ ﾉ\r\n" +
				"　　　 　 　 　 ＼ﾍNl　　 　 　 　 |　　 l|　! /ｲ/!,.ｲノ／\r\n" +
				"　　　　　　 　 　 ＼',　 _　　　 　 '、,　 l　ﾚ' /　 /／\r\n" +
				"　　　　　　　 `ｰ-､._ヽ, >‐､ー‐_-___-_--;‐=''　/´\r\n" +
				"　　　　　‐'⌒`ｰ､ 　 r燃y'´ ｀¨ニニニ´　　／!\r\n" +
				"　　　　　　　　　　｀ヽ--' iヽ、　　　　 　 ／:. :ﾄヾ'ヽ､\r\n" +
				"　　　　　　　　　　 　 　 _,|　　ヾ､!.!.! -'´ 　 ,､ﾍ.l::::::::::`''ｰ-､._\r\n" +
				"　 　 　 　 　 　 　 　 ,r;Ｚﾘ　　　 :. :. :. : ,､ﾍ`､ヽl::::::::::::::::::::::::::::｀''ｰ-､._\r\n" +
				"　　　　　　　　　,..-'´/´ヾ 　 　 　 ,..＜ヽヽヽヽ!:::::::::::::::::::::::::::::::::::::::::::::::｀`'ヽ.､\r\n" +
				"　 　 　 　 ,.-‐'´::::::////`ヽ　 ,..へ ヽ ヽヽヽヽl::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::｀ヽ、\r\n" +
				"　　 ,. -:'´:::::::::::::::///// rｰ`‐ヽヽヽ ヽ ヽヽヽ!:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::ヽ\r\n" +
				".-:'´:::::::::::::::::::::::://///ﾍヽ::::::::::;ﾍヽ ヽヽ ヽヽ!::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::ヽ");
	}
}
