import java.io.*;
import java.util.Scanner;

public class WeatherReader
{
    /*
    Step 1: Method to check if the file exists, if file does not exists it throws and
    will throw a WeatherFileNotFoundException
    */
    public void checkFileExists(File file)
    {
        try
        {
            if (file.exists() == false)
                throw new WeatherFileNotFoundException("Weather File Not Found");
        } catch (WeatherFileNotFoundException e)
        {
            System.out.println("Weather file not found!");
            e.printStackTrace();
        }
    }
    /*
    Step 2: Method to read file using Scanner methods and display the file content
    In this method catch the FileNotFoundException only
    */
    public void readFile(File file) {
        // Reading file line by line and display each line
        try
        {
            if (file.exists() == true)
            {
                Scanner fileReader = new Scanner(file);
                System.out.println("Reading weather data from file:\n");
                while(fileReader.hasNextLine())
                {
                    System.out.println(fileReader.nextLine());
                }
                System.out.println();
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    /*
    Step 3: Method to process the file by combining both tasks.
    In this method catch the WeatherFileNotFoundException only
    */
    public void processWeatherFile(String filePath) {
        // Step 1: Create File object to assign filePath
        File file = new File(filePath);
        // Step 2: Check file existence
        checkFileExists(file);
        // Step 3: Read the file
        readFile(file);
        // CHALLENGE
        // Step 4: read file as bytes
        readFileAsBytes(filePath);
        // Step 5: write content into the file as bytes
        writeFileAsBytes(filePath, "Saturday:Foggy\n" +
                "Sunday:Rainy");
        // Step 6: re-read the new written file content as bytes
        readFileAsBytes(filePath);
    }

    // CHALLENGE

    // Method to read a file as a byte stream- FileInputStream
    //Make sure to include the IOException and printStackTrace() in the catch block.
    public void readFileAsBytes(String filePath)
    {
        try (FileInputStream in = new FileInputStream(filePath))
        {
            int i;
            while ((i = in.read()) != -1)
            {
                System.out.print((char) i);
            }
            System.out.println();
        }
        catch (IOException e)
        {
            System.out.println("IO Error");
            e.printStackTrace();
        }
    }
    // Method to write data to a file as a byte stream- FileOutputStream
    //Make sure to include the IOException and printStackTrace() in the catch block.
    public void writeFileAsBytes(String filePath, String content)
    {
        try
        {
            FileOutputStream out = new FileOutputStream(filePath);
            out.write(content.getBytes());
            System.out.println("\nContent written to file successfully as bytes\n");
        }
        catch (IOException e)
        {
            System.out.println("IO Error");
            e.printStackTrace();
        }
    }
    // Method to accept user input for file names
    public String getFileNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name (with path): ");
        return scanner.nextLine();
    }
}
