package pg_ex21_1;

public class E1 {

	//基本料金
		public static  int E1Vase(){
			GetInfo ｍoney = new GetInfo();
			int e1VaseMoney;
			e1VaseMoney = 200 + ｍoney.vase;
			return e1VaseMoney;
		}

		public static int E1talk(String word){
			GetInfo ｍoney = new GetInfo();
			int e1talkMoney;
			e1talkMoney = (ｍoney.phoneMin(word) * 15);
			return e1talkMoney;

		}


}
