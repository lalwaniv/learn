package FileHandling;
import java.io.*;
import java.nio.file.Path;
public class ListFolderNames {
	public static void main(String[] args) {
		File f = new File("/home/suren");
		String[] s = f.list();
		int i = 0;
		while (i < s.length) System.out.println(s[i++]);
	}
}

