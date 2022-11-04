
public class Artists

{
private String song;
private String Artist;      
private int plays;     
public Artists(String song, String Artist, int plays)
{
    this.song =song; this.Artist =Artist;  this.plays =plays;
}
    

    public void print()
    {   
        System.out.println("song: " + this.song);
        System.out.println("Artist: " + this.Artist);
        System.out.println("plays: " + this.plays);
        

    }

}
    






