
class Artist {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

// Artwork class
 class Artwork {
    private String title;
    private int year;
    private Artist artist;

    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references point to the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type

        Artwork artwork = (Artwork) obj; // Cast obj to Artwork
        // Directly compare the attributes for equality
        return title.equals(artwork.title) &&
               year == artwork.year &&
               artist.getName().equals(artwork.artist.getName()); // Assuming artist has a getName() method
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", artist=" + artist.getName() +
                '}';
    }

    public void display() {
        artist.display();
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Mehrunisa");
        Artwork original = new Artwork("Mona Lisa", 2004, artist1);

        System.out.println("Original Artwork:");
        original.display();

        Artwork artworkCopy = new Artwork("Mona Lisa", 2004, artist1);

        System.out.println("\nArtwork Copy:");
        artworkCopy.display();

        // Checking equality
        System.out.println("\nChecking equality:");
        if (original.equals(artworkCopy)) {
            System.out.println("Original and Artwork Copy are Equal");
        } else {
            System.out.println("Original and Artwork Copy are Not Equal");
        }

        // Changing artist name and creating a new Artwork
        Artist artist2 = new Artist("Landscape");
        Artwork modifiedArtwork = new Artwork("Mona Lisa", 2004, artist2);

        System.out.println("\nModified Artwork:");
        modifiedArtwork.display();

        // Checking equality after modification
        System.out.println("\nChecking equality after modification:");
        if (original.equals(modifiedArtwork)) {
            System.out.println("Original and Modified Artwork are Equal");
        } else {
            System.out.println("Original and Modified Artwork are Not Equal");
        }
    }
}
