import java.util.*;

public class Jobitog {
    public static void main(String[] args) {
       MyContact myContact = new MyContact();
        myContact.addnumber("Ivanov", "854563");
        myContact.addnumber("Ivanov", "754563");
        myContact.addnumber("Sidorov", "789345");
        myContact.addnumber("Ivanov", "349675");
        myContact.addnumber("Sidorov", "149675");
        myContact.addnumber("Samoilov", "856423");
        myContact.addnumber("Samoilov", "756423");
        myContact.addnumber("Samoilov", "456423");
        myContact.addnumber("Samoilov", "356423");
        myContact.addnumber("Samoilov", "256423");
        myContact.addnumber("Samoilov", "156423");
        myContact.addnumber("Samoilov", "956423");
        myContact.addnumber("Sidorov", "339345");
        myContact.addnumber("Sidorov", "119345");
        myContact.addnumber("Sidorov", "559345");
        //HashSet h = new HashSet<>();
        System.out.println(myContact.getAll());

    }
}

class MyContact {
    private HashMap<String, List<String>> contact;

    void addnumber(String key, String value) {
        if (contact.containsKey(key)) {
            List<String> telbook = contact.get(key);
            telbook.add(value);
        } else {
            List<String> telbook = new ArrayList<>();
            telbook.add(value);
            contact.put(key, telbook);
        }
    }


    public MyContact() {
        contact = new HashMap<>();
    }

    String getAll() {
        StringBuilder stringBuilder = new StringBuilder();
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(contact.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (Map.Entry<String, List<String>> entry : entries) {
            List<String> value = entry.getValue();
            stringBuilder.append(entry.getKey());
            stringBuilder.append(" -> ");
            stringBuilder.append(value);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }
}

