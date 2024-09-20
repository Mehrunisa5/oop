public class Main {

    // Main method to run the example
    public static void main(String[] args) {
        // Original Artwork
        Artist artist = new Artist("Mehrunisa");
        Artwork original = new Artwork("Mona Lisa", 2004, artist);

        // Display original
        System.out.println("Original Artwork:");
        original.display();

        // Shallow copy
        Artwork shallowCopy = original.shallowCopy();
        System.out.println("\nShallow Copy:");
        shallowCopy.display();

        // Deep copy
        Artwork deepCopy = original.deepCopy();
        System.out.println("\nDeep Copy:");
        deepCopy.display();

        // Modify artist name in original
        artist = new Artist("Michelangelo");
        System.out.println("\nAfter modifying the artist in the original:");
        original.display();
        shallowCopy.display();
        deepCopy.display();

        // Check equality between artworks
        System.out.println("\nChecking equality:");
        if (original.equals(shallowCopy)) {
            System.out.println("Original and Shallow Copy are Equal");
        } else {
            System.out.println("Original and Shallow Copy are Not Equal");
        }

        if (original.equals(deepCopy)) {
            System.out.println("Original and Deep Copy are Equal");
        } else {
            System.out.println("Original and Deep Copy are Not Equal");
        }

        // Example of comparing artist names (if necessary)
        if (original.getArtist().getName().equals(shallowCopy.getArtist().getName())) {
            System.out.println("Artist names are Equal");
        } else {
            System.out.println("Artist names are Not Equal");
        }
    }
}
