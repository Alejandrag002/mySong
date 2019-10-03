public class songDriver
{
    public static void main (String args[])
    {
         //1. Create a song, or more
        Song someSong = new Song();
        Song fireworks = new Song("Fireworks", "Katy Perry", true, 234, 6.94);
        Song deadlochs = new Song("Deadlochs", "Blue Face", true, 150,3.57);
        Song overture = new Song ("1812 Overture", "Petyr Ilych Tchaicovsky", false, 1093, 11.11);
        Song happySong = new Song("Happy Song", "Alejandra", true);

        //4checking other methods and properties
        deadlochs.setLength(-5);
        System.out.println(deadlochs);
        //fireworks.title = "Happy Song";
        //System.out.println(fireworks);
        //System.out.println("In minutes: " + overture.toMinSec());
        //3 Testing getters
        //System.out.println(fireworks.getTitle());
        //System.out.println(deadlochs.getArtist());
       // System.out.println(overture.getHasLyrics());

        //Testing Setters
       // System.out.println("\n" + someSong + "\n");
       //someSong.setTitle ("Lalalalala");
        //someSong.setArtist("A Singer");
        //System.out.println(someSong);





        //2. Print it out
        //System.out.println(happySong);
         //System.out.println (fireworks);
        //System.out.println();
         //System.out.println (deadlochs);
         //System.out.println();
        //System.out.println(overture);

    }// end main method

}// end class songDriver. This is where all the fun stuff happens.
