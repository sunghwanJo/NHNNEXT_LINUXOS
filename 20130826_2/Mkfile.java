import java.util.*;
import java.io.*;

public class Mkfile {
	static final String PRE = "_file";
	static final String STR = 
		"This is is is sis \n"+
		"ByeByebyeybyebyeby ! \n";

	static Random r = new Random();

	public static void main(String[] args) throws IOException{
		String fname = PRE + r.nextInt(100);
		File f = new File("./", fname);

		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
			

		bos.write(STR.getBytes());
		bos.close();
		fos.close();
	}

}


