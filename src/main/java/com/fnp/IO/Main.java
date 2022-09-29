import ioresource.*;
import java.io.*;
import java.util.*;

class Main {
	public static void main(String [] args){
		try{
			FileReader fr = new FileReader("./file.csv");
			BufferedReader br = new BufferedReader(fr);
			CsvReader csv = new CsvReader();
			csv.getInfo(br);
			br.close();
			fr.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileReader fr = new FileReader("./test.txt");
			BufferedReader br = new BufferedReader(fr);
			TabReader tab = new TabReader();
			tab.getInfo(br);
			br.close();
			fr.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
