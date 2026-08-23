package tryWithResources;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class tryWithMultipleResources {

	public static void main(String[] args) {

	  try (FileWriter fileWriter = new FileWriter("data.txt",true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		) {
			bufferedWriter.write("hello");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
