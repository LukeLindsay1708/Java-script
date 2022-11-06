
import java.util.ArrayList;


public class Music 
{ 
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)

    {
        System.out.println(CONSOLE_CLEAR);

        Artists Ed_Sheeran = new Artists("1", "Bad Habbits", "Ed Sheeran", 863015);
        Artists Anne_Marrie = new Artists("2", "Beautiful", "Anne Marie", 197191452);
        Artists Beyonce = new Artists("3", "Halo", "Beyonce", 991888598);
        Artists Dave = new Artists("4", "Clash", "Dave", 7070513);
        Artists Sweedish_House_Mafia = new Artists("5", "It Gets Better", "Sweedish House Mafia", 7563930);
        Artists Glass_Animals = new Artists("6", "Heatwaves", "Glass Animals", 2066913268);
        Artists The_Kid_Laroi = new Artists("7", "Wihtout You", "The Kid Laroi", 764963054);
        Artists Jack_Harlow = new Artists("8", "First Class", "Jack Harlow",524921921);
        Artists One_Republic = new Artists("9", "I Ain't Worries", "One Republic", 422792883 );
        Artists Polo_G = new Artists("10", "Rapstar", "Polo G", 682281114);
        Artists Juice_WRLD = new Artists("11", "Robbery", "Juice WRLD",1054434510 );
        

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
        artists.remove(Beyonce);
        
        for(Artists Artists: artists)
        {
            Artists.print();
        }

        Songs Bad_Habbits = new Songs("Bad Habbits");
        Songs Beautiful = new Songs("Beautiful");
        Songs Halo= new Songs("Halo");
        Songs Clash= new Songs("Clash");
        Songs It_Gets_Better = new Songs("It Gets Better");
        Songs Heatwaves = new Songs("Heatwaves");
        Songs Without_You = new Songs("Without You");
        Songs First_Class = new Songs("First Class");
        Songs I_Aint_Worried = new Songs("i Ain't Worried");
        Songs Rapstar = new Songs("Rapstar");
        Songs Robbery = new Songs("Robbery");

        ArrayList<Songs> S = new ArrayList<Songs>();
        S.add(Bad_Habbits);
        S.add(Beautiful);
        S.add(Halo);
        S.add(Clash);
        S.add(It_Gets_Better);
        S.add(Heatwaves);
        S.add(Without_You);
        S.add(First_Class);
        S.add(I_Aint_Worried);
        S.add(Rapstar);
        S.add(Robbery);

        for( Songs Songs : S )
        {
            Songs.print();
        }
        System.out.println("there are: " + S.size()); 
        System.out.println(" listed songs" + S.get(1));

        
        /* 
        // how i think it works
         if(int Artists(element.plays) > 0; int Artists(element.plays) < 100000; in Arraylist<Artists>)
         {
            Void print()
         }
            else(int Artists(element.plays) > 0; int Artists(element.plays) >= 100000; in Arraylist<Artists> )
            {
                print()
            }
             
    
        */
}


    


}