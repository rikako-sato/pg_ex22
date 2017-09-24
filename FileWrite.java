package pg_ex21_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {

	public static void Filewrite(){

		try{
			//出力先を作成する
	        FileWriter fw = new FileWriter("c:\\invoice.txt", false);
	        //書き込み
	        PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

	        GetInfo getInfo = new GetInfo();



	        //pw.println(getInfo.phone(word));

	        fw.flush();
	        fw.close();
		}catch (IOException ex) {
	        //例外時処理
	        ex.printStackTrace();
	    }
	}
}

