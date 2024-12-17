import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        // Create a weather Reader Object
        WeatherReader reader = new WeatherReader();
        String fileInput = reader.getFileNameFromUser();

        // Invoke the method to process the weather file
        reader.processWeatherFile(fileInput);
    }
}