package stream;

import java.io.*;

public class FileReaderWriterChar
{
    public void readFile()
    {
        try (FileReader fr = new FileReader("C:\\Users\\mike1\\Downloads\\Datafile.txt"))
        {
            System.out.println(fr.read());
            int data = fr.read();
            System.out.println((char) data);
            // should be more specific what exception might be thrown
        } catch (FileNotFoundException e)
        {
            System.out.println("Not Working: " + e.getMessage());
        } catch (IOException e)
        {
            System.out.println("error" + e.getMessage());
        }
    }

    public void readAllChar()
    {
        try
        {
            FileReader fr = new FileReader("C:\\Users\\mike1\\Downloads\\Datafile.txt");
            int i = 0;
            while ((i = fr.read()) != -1)
            {
                System.out.print((char) i);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void useFileWriter()
    {
        try
        {
            FileWriter fileWriter = new FileWriter("C:\\Users\\mike1\\Downloads\\Datafile.txt");
            char[] chars = new char[]{'A', 'B', 'C', 'D', 'E'};
            String content = "I dont like my country\n";
            fileWriter.write(content);
            fileWriter.write(chars);
            fileWriter.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    public void readAndWrite()
    {
        String inputFilePath = "C:" + File.separator + "Users" + File.separator + "mike1" + File.separator + "Downloads" + File.separator + "Datafile.txt";
        String outputFilePath = "C:" + File.separator + "Users" + File.separator + "mike1" + File.separator + "Downloads" + File.separator + "Datafileoutput.txt";

        try (FileReader in = new FileReader(inputFilePath);
             FileWriter out = new FileWriter(outputFilePath))
        {
            int c;
            while ((c = in.read()) != -1)
            {
                out.write(c);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void usePrintWriter()
    {

    }
}
