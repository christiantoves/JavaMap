import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
    public static void trackList(){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Ed Sheeran", "bad habits lead to you");
        trackList.put("John Legend", "save room for love");
        trackList.put("blackbear",  "cheers heres to nothing");
        trackList.put("Grover Washington Jr.", "I see the crystal rain drops fall");
        System.out.println(trackList.get("Grover Washington Jr."));
        Set<String> keys = trackList.keySet();
        for(String key: keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}