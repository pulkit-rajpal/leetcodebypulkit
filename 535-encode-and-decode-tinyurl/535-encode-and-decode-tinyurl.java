import java.util.UUID;

public class Codec {
    public HashMap<String,String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        // here we are using the java.util.UUID class to get uuid for the alphanumeric key 
    String shorturl="http://tinyurl.com/"+UUID.randomUUID().toString().split("-")[0];
       map.put(shorturl ,longUrl);
       return shorturl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));