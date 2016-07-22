package FileHandling;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) throws FileNotFoundException {
		//Location of input file in a string
		String inputFile = "/home/suren/test.txt";
		//Location of output file in a string
		String outputFile = "/home/suren/test1.txt";
		
		//If input file does not exist then give a message and return/exit
		File f = new File(inputFile);
		if (!f.exists()) {
			System.out.println("File doesnt exists");
			return;
		}
		
		//If output file exist then delete it and give a message
		f = new File(outputFile);
		if (f.exists()) {
			System.out.println("Output file exists, deleting");
			f.delete();
		}
		
		
		//Declare a file reader to the input file
		FileReader fr = new FileReader(inputFile);
		
		//A buffered reader to read from the input file
		BufferedReader br = new BufferedReader(fr);
		
		
		//Write to output file using a printwriter
		try {
			PrintWriter pw = new PrintWriter(outputFile,"UTF-8");
			String line;
			while ((line = br.readLine()) != null)
				pw.println(line);
			pw.close();
			System.out.println("Finished writting");
		} 
		catch (IOException e) {
	        System.err.println("Error: " + e.getMessage());
		}
	}

}
