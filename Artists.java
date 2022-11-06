
public class Artists

{
private String song;
private String Artist;      
private int plays;  
private String ID;   
public Artists(String ID, String song, String Artist, int plays)
{
    this.ID =ID; this.song =song; this.Artist =Artist;  this.plays =plays;
}
    

    public void print()
    {   
        System.out.print("ID Number" +this.ID);
        System.out.println("song: " + this.song);
        System.out.println("Artist: " + this.Artist);
        System.out.println("plays: " + this.plays);
        

    }

}
    






