import java.util.Arrays;

public class Gymnastics implements Sport
{
    // Declare field of Array of ints
    int[] playerIDs;

    public Gymnastics()
    {

        // Initializing the int array size
        this.playerIDs = new int[11];
        System.out.println(Arrays.toString(playerIDs));
        for (int i = 0; i < playerIDs.length; i++)
        {
            // Assigning players ids to unique ones, 1-11
            playerIDs[i] = i + 1;
            System.out.println("Gymnast ID: " + playerIDs[i]);
        }
        System.out.println("A new gymnastics team has been formed.");
    }
    @Override
    public void calculateAvgAge(int[] age)
    {

    }

    @Override
    public void retirePlayer(int id)
    {

    }

}
