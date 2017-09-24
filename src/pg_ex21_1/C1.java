package pg_ex21_1;

public class C1 {

	//基本料金
	public static  int C1Vase(){
		GetInfo ｍoney = new GetInfo();
		int c1VaseMoney;
		c1VaseMoney = 100 + ｍoney.vase;
		return c1VaseMoney;
	}

	public static int C1talk(String word){
		GetInfo ｍoney = new GetInfo();
		int c1talkMoney;
		return c1talkMoney = (ｍoney.phoneMin(word) * 20)/2;

	}
}
