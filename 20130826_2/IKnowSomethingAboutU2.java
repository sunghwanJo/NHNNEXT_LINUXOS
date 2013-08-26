import java.io.File;

public class IKnowSomethingAboutU2 {
	static final int MAX = 20;

	public static void main(String[] args){
		File f = new File("./");
		String[] astr = new String[MAX];

		if(f.isDirectory()){
			astr = f.list();
		}else {
			System.err.printf("%s is not dir", f.getName());
			System.exit(1);
		}
		
		for (String s: astr)
			System.out.println(s);

	}
}
