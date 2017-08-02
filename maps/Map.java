import java.util.HashMap;

public class Map {
    public void method(){
        HashMap<String, String> userMap = new HashMap<>();

        userMap.put("title1", "lyrics1");
        userMap.put("title2", "lyrics2");
        userMap.put("title3", "lyrics3");
        userMap.put("title4", "lyrics4");
        
        String title = userMap.get("title1");

        System.out.println(title);

        for(String key: userMap.keySet()) {
            System.out.println(key + ": " + userMap.get(key));
        }


    }

}