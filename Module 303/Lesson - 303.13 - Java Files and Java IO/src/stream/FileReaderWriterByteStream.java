package stream;

import java.io.*;

public class FileReaderWriterByteStream
{
    public void useFileInputStream()
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\mike1\\Downloads\\Datafile.txt");
            int i = 0;
            while((i = fileInputStream.read()) != -1)
            {
                System.out.print((char) i);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void useFileInputAndFileOutputStream()
    {
        String inputFilePath = "C:" + File.separator + "Users" + File.separator + "mike1" + File.separator + "Downloads" + File.separator + "Datafile.txt";
        String outputFilePath = "C:" + File.separator + "Users" + File.separator + "mike1" + File.separator + "Downloads" + File.separator + "Datafileoutput.txt";

        try (FileInputStream in = new FileInputStream(inputFilePath);
             FileOutputStream out = new FileOutputStream(outputFilePath))
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
}
