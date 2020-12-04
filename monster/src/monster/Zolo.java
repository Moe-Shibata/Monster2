package monster;

public class Zolo extends Monster{

	private int HP = 50;
	private int ATK = 30;
	private int EXP = 20;
	private int gold = 30;
	private String name = "ソロ";
	private int MAX_ATK = 100;

	public void technic() {
		System.out.println(getName()+"は海賊狩りを発動した！");
		System.out.println("攻撃力が上がった！");

		setATK(getATK()+20);}


	public void profile(){
		System.out.println("No.5 ソロ");
		System.out.println("とても強い剣士なモンスター");
		System.out.println("世界一の剣豪を目指している");
		System.out.println("　　　　　　　　　 _＞'´.:::::::::::::::::::::::::::::::::::::.｀ﾞ:.＜_\r\n" +
				"　　　 　 　 　 ,.イ.:::::::::::::::::::::::::::::::::::::::::::::::::::::::::ヾ::::＼　 .／\r\n" +
				"　　　　　　　/.:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.ﾐト-<／　／.::／\r\n" +
				"　　　　　　〃.:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.Y ／　／.::／\r\n" +
				"　　　　　 iﾞ.:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.／　／.::／\r\n" +
				"　　　　　 |:::::::::::::::::;::'´:::::::::::::::::::::::::::::::::::::::::::.／　／:::／＞ー\r\n" +
				"　　　　　 |::::::::,;::'´:::::::::::::::::::::_＿＿＿＿_／　／.: ／≦彡j:::\r\n" +
				"　　　　　 j;;イ;;彡＞'´7￣￣ヾ三　､ヽ／　／.::／｀Y!ﾐ､ノ｀ﾞー\r\n" +
				"　　　　　Kノ´.:K.°_ノ　　　＿」彡.／　／.::／　 ﾍi ﾄ､:::::::::::\r\n" +
				"　　　　　　 j;:::::; '´　　　／彡＝／　／.::／　　　ヾﾐ}　ヽz_彡\r\n" +
				"　　　　 　 /　　　　　 〃/　 ∠　.／.::／ /＿ｚ=＝彡､\r\n" +
				"　　　　　ノ　　　 _＿jﾞ i {　　ヽ二ニフ　| |　　　　　　　｀ヽ\r\n" +
				"　　　　 ﾞー,　 ／ __,人ミ:.､_＿＿＿__.ノ丿\r\n" +
				"　　　　　　ゝ<_／ﾐz､z､＞ー--――＝ﾞ\r\n" +
				"　　 　 　 　 ／ﾐｚ､<>'´　　　　 j::::::.__\r\n" +
				"　　　　　 ／ﾐz､Y´ ｚ=-　　　,彡'´　　＞ ､\r\n" +
				"　　　　／ﾐz､_ﾐz>=､　　　　/　　　　〃　　＼\r\n" +
				"　　 ／ﾐz､_ﾐz／　　｀ー―'ﾞ　　　 ／　　　 //＼\r\n" +
				"　　∧_ 　 .／　　　　　　　　　_／　　　　　i/　　＼\r\n" +
				"　 jヾー=ソ　　　　 　 _,.．-'''\"　　　　　　　i!＿__　 ヽ\r\n" +
				"　 ｀ー―′　　　　／　　　　　　　　　　　 |!　　 ｀ー");
	}
}