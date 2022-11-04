
import java.util.ArrayList;

public class Music 
{ 
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)

    {
        System.out.println(CONSOLE_CLEAR);

        Artists Ed_Sheeran = new Artists("Bad Habbits", "Ed Sheeran", 863015);
        Artists Anne_Marrie = new Artists("Beautiful", "Anne Marie", 197191452);
        Artists Beyonce = new Artists("Halo", "Beyonce", 991888598);
        Artists Dave = new Artists("Clash", "Dave", 7070513);
        Artists Sweedish_House_Mafia = new Artists("It Gets Better", "Sweedish House Mafia", 7563930);
        Artists Glass_Animals = new Artists("Heatwaves", "Glass Animals", 2066913268);
        Artists The_Kid_Laroi = new Artists("Wihtout You", "The Kid Laroi", 764963054);
        Artists Jack_Harlow = new Artists("First Class", "Jack Harlow",524921921);
        Artists One_Republic = new Artists("I Ain't Worries", "One Republic", 422792883 );
        Artists Polo_G = new Artists("Rapstar", "Polo G", 682281114);
        Artists Juice_WRLD = new Artists("Robbery", "Juice WRLD",1054434510 );
        

        ArrayList<Artists> artists = new ArrayList<Artists>();
        artists.add(Ed_Sheeran);
        artists.add(Anne_Marrie);
        artists.add(Beyonce);
        artists.add(Dave);
        artists.add(Sweedish_House_Mafia);
        artists.add(Glass_Animals);
        artists.add(The_Kid_Laroi);
        artists.add(Jack_Harlow);
        artists.add(One_Republic);
        artists.add(Polo_G);
        artists.add(Juice_WRLD);

        artists.remove(Dave);
        
        for(Artists Artists: artists)
        {
            Artists.print();
        }

        Songs Love_Sick = new Songs("Love sick");

        ArrayList<Songs> S = new ArrayList<Songs>();
        S.add(Love_Sick);

        for( Songs Songs : S )
        {
            Songs.print();
        }

}


    


}