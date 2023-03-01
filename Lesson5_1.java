import java.util.HashMap;
import java.util.Map;

public class Lesson5_1 {
    public static void main (String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(4585689, "Иванов");
        db.put(6532574, "Васильев");
        db.put(9562585, "Петрова");
        db.put(9032574, "Иванов");
        db.put(3641256, "Петрова");
        db.put(6523691, "Иванов");

        for (var item : db.entrySet()){

            if (item.getValue().equals("Иванов")){
                System.out.println(item.getKey() + " " + item.getValue());
            }

        }

    }
}