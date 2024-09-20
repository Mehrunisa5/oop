public class Artwork {

    private String title;
    private int year;
    private Artist artist;

    // Constructor with title, year, and artist
    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    // Shallow copy constructor
    public Artwork(Artwork other) {
        this.title = other.title;
        this.year = other.year;
        this.artist = other.artist;  // Shallow copy (copies the reference to the same artist object)
    }

    // Deep copy constructor
    public Artwork(Artwork other, boolean isDeepCopy) {
        this.title = other.title;
        this.year = other.year;
        if (isDeepCopy) {
            this.artist = new Artist(other.artist.getName()); // Deep copy (creates a new artist object)
        } else {
            this.artist = other.artist; // Shallow copy
        }
    }

    // Constructor with title and year only, default artist "unknown"
    public Artwork(String title, int year) {
        this.title = title;
        this.year = year;
        this.artist = new Artist("unknown");
    }

    // Shallow copy method
    public Artwork shallowCopy() {
        return new Artwork(this); // Uses the shallow copy constructor
    }

    // Deep copy method
    public Artwork deepCopy() {
        return new Artwork(this, true); // Uses the deep copy constructor
    }

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

    // toString method
    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", artist=" + artist.getName() + // Assuming Artist has a getName() method
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for reference equality
        if (obj == null || getClass() != obj.getClass()) return false; // Type check

        Artwork artwork = (Artwork) obj; // Cast obj to Artwork
        return year == artwork.year && 
               title.equals(artwork.title) && 
               artist.equals(artwork.artist); // Assuming Artist class also has an equals method
    }

    // Display method
    public void display() {
        artist.display();
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
}
