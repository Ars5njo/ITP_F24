public class Main {
    public static void main(String[] args) {
        GenericMediaLibrary<String> mediaBooks = new GenericMediaLibrary<>();
        GenericMediaLibrary<String> mediaVideos = new GenericMediaLibrary<>();
        GenericMediaLibrary<String> mediaNewspapers = new GenericMediaLibrary<>();

        mediaBooks.addMedia("The gifts of Maggi");
        mediaVideos.addMedia("10 hours of cutting water");
        mediaNewspapers.addMedia("New York Times");

        System.out.println("Books: " + mediaBooks.getMediaItems());
        System.out.println("Videos: " + mediaVideos.getMediaItems());
        System.out.println("Newspapers: " + mediaNewspapers.getMediaItems());
    }
}