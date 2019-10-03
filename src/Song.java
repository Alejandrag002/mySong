public class Song
{
    //1) Instance Variables
    private  String title;
    private  String artist; //can also be composer
    private boolean hasLyrics;
    private int length; //in seconds
    private double fileSize; //in megaBytes

    //2) Constructor
    //Overloaded constructors (methods) have early binding
    public Song()
    {
        title = null;
        artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
    }// end zero-arg or default constructor

    // 3.
    public String toString()
    {
        String output = "";
        output += "Title: " + title;
        output += "\nArtist: " + artist;
        output += "\nHas Lyrics?: " + hasLyrics;
        output += "\nLength (in seconds): " + length;
        output += "\nFile Size (in mB): " + fileSize;

        return output;
    }// end toString

    public Song(String newTitle, String newArtist, boolean newHasLyrics)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = 0;
        fileSize = 0.0;

    }// end three-arg constructor

    public Song(String newTitle, String newArtist, Boolean newHasLyrics, int newLength, double newFileSize)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = checkLength(newLength);
        fileSize = newFileSize;
    }// end multi-arg constructor

    // 4 Getter
    public String getTitle()
    {
        return title;
    }//title getter

    public String getArtist()
    {
        return artist;
    }//artist getter

    public boolean getHasLyrics()
    {
        return hasLyrics;
    }//artist getter

    public int getLength()
    {
        return length;
    }//length getter

    public double getFileSize()
    {
        return fileSize;
    }//filesize getter


    //5 Setters
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }//end Title setter

    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }// end artist setter

    public void setHasLyrics(boolean newHasLyrics)
    {
        hasLyrics = newHasLyrics;
    }//end haslyrics setter

    //Pre-condition: the object exsits
    //Post-condition: length == newLength validated to (0,20)
    public void setLength(int newLength)
    {
         length = checkLength(newLength);
    }//end setLength
    //6 Brain Methods

    public  String toMinSec()
    {
        int minutes = length / 60;
        int seconds = length % 60;
        return minutes + " min " + seconds + " sec" ;//length / 60.0 ;
    }// end brain method to convert length

    /*
    CheckLength is a helper method.  It is private because
    it "helps" the other public methods by validating entry'
    This is an example of method decomposition - each method
    class just does one thing.
    */
    private int checkLength(int newLength)
    {
        int tempLength = newLength;
        if (tempLength < 0)
        {
            tempLength = 0;
        }//end if
        else if (tempLength > 1200)
        {
            tempLength = 1200;
        }//end else if
        return tempLength;
    }//end length validation method checkLength


}//end class song
