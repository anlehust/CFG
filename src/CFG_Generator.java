import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class CFG_Generator {
	private static Graph graph;
	public static void main(String[] args) {
		System.out.println("Hello World.");

		graph = new Graph();

		readSource("/src");
		graph.setDebug(true);

		graph.build();
		graph.writePng("Output2.png");
	}

	private static void readSource(String path){

		FileInputStream fstream = null;

		try{
			fstream = new FileInputStream(path);
		}
		catch (IOException e){
			System.err.println("Unable opening file "+path+".\n"+e.getMessage());
			System.exit(1);
		}

		Scanner s = new Scanner(fstream);
		while (s.hasNextLine()){
			graph.AddSrcLine(s.nextLine());
		}
		s.close();
		try{
			fstream.close();
		}
		catch (IOException e){
			System.err.println("Error closing file "+path+".\n"+e.getMessage());
		}

	}
}