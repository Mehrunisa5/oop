public class Artwork {

    private String title;
    private int year;
    private Artist artist;

   
    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

   
    public Artwork(Artwork other) {
        this.title = other.title;
        this.year = other.year;
        this.artist = other.artist;  
    }

    // Deep copy constructor
    public Artwork(Artwork other, boolean isDeepCopy) {
        this.title = other.title;
        this.year = other.year;
        if (isDeepCopy) {
            this.artist = new Artist(other.artist.getName()); 
        } else {
            this.artist = other.artist; 
        }
    }

   
    public Artwork(String title, int year) {
        this.title = title;
        this.year = year;
        this.artist = new Artist("unknown");
    }

   
    public Artwork shallowCopy() {
        return new Artwork(this); // Uses the shallow copy constructor
    }

    
    public Artwork deepCopy() {
        return new Artwork(this, true); 

    // Getters
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Artist getArtist() {
        return artist;
    }

   
    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", artist=" + artist.getName() + // Assuming Artist has a getName() method
                '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 

        Artwork artwork = (Artwork) obj; // Cast obj to Artwork
        return year == artwork.year && 
               title.equals(artwork.title) && 
               artist.equals(artwork.artist); 
    }

   
    public void display() {
        artist.display();
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
}
