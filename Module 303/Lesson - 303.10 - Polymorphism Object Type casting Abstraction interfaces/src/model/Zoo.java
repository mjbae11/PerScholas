package model;

public class Zoo
{

    public static class Cage
    {
        private String cageType;

        public Cage(String cageType)
        {
            this.cageType = cageType;
        }

        public void describe()
        {
            System.out.println("This is a " + cageType + " Cage");
        }
    }

}
