import java.util.ArrayList;
import java.util.List;

public class GenericMediaLibrary<T> {
    private List<T> mediaItems = new ArrayList<>();

    public void addMedia(T media) {
        mediaItems.add(media);
    }

    public List<T> getMediaItems() {
        return mediaItems;
    }
}
