package pg_ex21_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

public class GetInfo {
	static String [] family = new String[2];
	public static int vase = 1000;


	public static void main(String[] args) {

		//ファイル読み込み
				try{


					File file = new File("data/record.log");
					BufferedReader filereader = new BufferedReader(new FileReader(file));

					String line;
					while((line = filereader.readLine())!= null){
						System.out.println(line);

						String [] word = line.split("",0);

						//1列目の情報を取得
						String firstnum = word[0];

						//2列目の情報を取得
						String secondnum = word[1];

						//1行目の情報によって処理を区別する
						switch(firstnum){
						//1の時、電話番号を格納する
						case "1":
							phone(word[1]);


						//2の時、サービス種別で区別する
						case "2":
							if(secondnum == "C1"){

									for(int i = 0;i <2; i++){
										family[i] = family(word[2]);
									}

							}else if(secondnum == "E1"){
							}
						case "5":
							String otherPhoneNum;
							LocalDateTime TIME;
							//通話した時刻の取得
							E1orNot(word[2]);
							//通話時間の取得
							phoneMin(word[3]);
							TIME = E1orNot(word[2]);

							LocalDateTime startTime = null;
							LocalDateTime endTime = null;
							startTime = LocalDateTime.of(1990, 01,01,8,0);
							endTime = LocalDateTime.of(2200, 12,31,17,59);

							boolean isAfter = TIME.isAfter(startTime);
							boolean isBefore = TIME.isBefore(endTime);
							//8:00~17:59の場合、E1の処理を行う、それ以外の場合は普通の処理を行う
							if(isAfter == true&& isBefore == true){
								E1 e1 = new E1();
								e1.E1Vase();
								e1.E1talk(word[3]);

							}else{
								Normal normal = new Normal();
								normal.Vase();
								normal.talk(word[3]);
							}



							//通話をした相手の電話番号の取得
							otherPhoneNum = word[4];
							 for(int j = 0; j <2; j++){
								if(otherPhoneNum == family[j] ){
									C1 c1 = new C1();
									c1.C1Vase();
									c1.C1talk(word[3]);
								}
								}
							}
					}
						}catch(IOException e){
					  System.out.println(e);
					}
			}


	public static String phone(String word){
	    String phones;
	    phones = word;
		return phones;
	}
	public static String family(String word){
		String fphone;
		fphone = word;
		return fphone;
	}
	public static int phoneMin(String word){
		int phoneMin;
		phoneMin =Integer.parseInt(word);
		return phoneMin;
	}
	//1桁目が１文字目と２文字目の日時を取得する

	public static LocalDateTime E1orNot(String word){
		LocalDateTime theTime = LocalDateTime.parse(word);
		return theTime;
	}

}

