package monster;

public class SugaSori extends Monster{

	private int HP = 70;
	private int ATK = 50;
	private int EXP = 30;
	private int gold = 70;
	private String name = "令和おじさん";
	private int MAX_HP = 70;

	public int getMAX_HP() {return this.MAX_HP;}

	public void technic(Hero h) {
		System.out.println(getName() + "は、パンケーキを食べだした！");;
		System.out.println(getName()+"は満足そうな顔をしている");

		int pancake = Math.min(getMAX_HP(),getHP() + 30);

		setHP(pancake);
		setATK(getATK() + 5);

		System.out.println(getName() + "はHPを回復した");
		System.out.println(getName() + "の攻撃力が上がった！");}


	public void profile() {
		System.out.println("No.15 令和おじさん");
		System.out.println("とても偉くなったモンスター");}
}