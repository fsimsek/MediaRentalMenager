package mediaRentalManager;

/*
 * create getters/setters
 * constructors
 */
public class Album extends Media {
	
	private String artist;
	private String songs;
	
	public String getArtist() {
		return artist;
	}

	public String getSongs() {
		return songs;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setSongs(String songs) {
		this.songs = songs;
	}
	
	public Album(String title, int copiesAvailable, String artist, String songs) {
		super(title, copiesAvailable);
		this.artist = artist;
		this.songs = songs;
	}
	/*
	 *return format: Title: Bad, Copies Available: 2, Artist: Mike J, Songs: Mirror, Far Away
	 */
	@Override
	public String toString() {
		return "Title: "+getTitle()+", Copies Available: "+getCopiesAvailable()+", Artist: "+artist+", Songs: "+songs;
	}

	
}
