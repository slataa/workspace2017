import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileInputDemo {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String line;
		FileReader read = new FileReader("src/Robotics Logs.docx");
		BufferedReader inputStream = new BufferedReader(read);
		do
		{
			line = inputStream.readLine();
			System.out.println(line);
		
		}while(line != null);
		inputStream.close();
		

	}

}
