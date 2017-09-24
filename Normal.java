package pg_ex21_1;

public class Normal {

			//基本料金
			public static  int Vase(){
				GetInfo ｍoney = new GetInfo();
				int VaseMoney;
				VaseMoney = ｍoney.vase;
				return VaseMoney;
			}
			//通話料金
			public static int talk(String word){
				GetInfo ｍoney = new GetInfo();
				int talkMoney;
				talkMoney = (ｍoney.phoneMin(word) * 20);
				return talkMoney;

			}


}
