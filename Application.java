import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadAndPrintScores
{
    public static void main(String[] args)
    {	try
	{   Scanner s = new Scanner( new File("scores.dat") );
	    while( s.hasNextInt() )
	    {	System.out.println( s.nextInt() );
	    }
	}
	catch(IOException e)
	{	System.out.println( e );
	}
    }
	 // create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }
#for Github Webhook job demo following changes done in the code
class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }		
}
