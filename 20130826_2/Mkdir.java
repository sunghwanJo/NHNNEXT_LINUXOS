import java.io.*;
import java.util.*;

public class Mkdir {
	static Random r = new Random();
	static final String PRE = "dir_";

	public static void main(String[] args) throws FileNotFoundException{
		boolean isCreate = false;
		String dname = PRE + r.nextInt(100);
		File f = new File("./", dname);

		if(!f.exists()){
			isCreate = f.mkdir();
		}else{
			System.err.printf("%s exists!\n", dname);
			System.exit(1);
		}

		if(isCreate)
			System.out.printf("create %s success\n", f.getAbsolutePath());

		else
			System.out.println("fail");
	}
}
