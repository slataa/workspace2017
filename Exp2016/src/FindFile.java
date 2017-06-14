import java.io.File;

public class FindFile 
{
	public static String searchForFile(File dir, String target)
	{
		int count = 0;
		String result = "";
		if(!dir.isDirectory())
			return "Path is not a directory";
		
		for(File folderItem : dir.listFiles())
		{
			if(folderItem.isDirectory())
			{
				result = searchForFile(folderItem, target);
				if(!result.equals(""))
					return result;
			}
			else
			{
				if(folderItem.getName().equals(target))
					return folderItem.getAbsolutePath();
			}
			
		}
		return "";
	}

	
	public static void main(String cheese[])
	{
		File rootFolder = new File("/Users/slataa");
		String result = searchForFile(rootFolder, "Waldo.txt");
		if(!result.equals(""))
			System.out.println(result);
		else 
			System.out.println("File not found!");
	}
}
