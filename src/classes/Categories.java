package classes;

import java.io.*;
import java.util.*;

// comment for test branch
// Holds data for all categories provided by recruiters
public class Categories extends AdvancedSetMap {
    public void readFromFile(String path){
        map.clear();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((line = reader.readLine()) != null && !line.equals("")) {
                String[] userData = line.split("=");
                HashSet<Object> cat = new HashSet<>(Arrays.asList(userData[1]
                        .substring(1, userData[1].length() - 1).split(", ")));
                map.put(userData[0], cat);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<String> getUserCategories(User user) {
        HashMap<String, Set<Object>> categories = Runtime.categories.getMap();
        ArrayList<String> userCats = new ArrayList<>();
        for (String category : categories.keySet()) {
            if (categories.get(category).contains(user.getEmail())) {
                userCats.add(category);
            }
        }
        return userCats;
    }

}
