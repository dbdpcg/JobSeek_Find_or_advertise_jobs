package classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static classes.Config.SEPARATOR_2;

public class CategoryManager extends HashSet<Category> {

    public Set<String> names(){
        return this.stream().map(c -> c.name).collect(Collectors.toSet());
    }


    public Category getByName(String targetName){
        System.out.println(this.stream().map(category -> category.name).collect(Collectors.joining(",")));
        return this.stream().filter(c -> c.name.equalsIgnoreCase(targetName) ).findFirst().orElse(null);
    }

    public String toCapitalString(){
        return this.stream().map(c -> Character.toUpperCase(c.name.charAt(0)) + c.name.substring(1)).
                collect(Collectors.joining(", "));
    }
    // Get representation by category names
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        String separator = "";
        for (Category category:this) {
            s.append(separator).append(category.getName());
            separator = SEPARATOR_2;
        }
        return s.toString();
    }
    public String toWriteFormat(){
        StringBuilder s = new StringBuilder();
        for (Category category:this) {
            s.append(category).append("\n");
        }
        return s.toString();
    }


}