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
	{	try
		{	PrintStream writer = new PrintStream( new File("randInts.txt"));
			Random r = new Random();
			final int LIMIT = 100;

			for(int i = 0; i < LIMIT; i++)
			{	writer.println( r.nextInt() );
			}
			writer.close();
		}
		catch(IOException e)
		{	System.out.println("An error occured while trying to write to the file");
		}
		
}