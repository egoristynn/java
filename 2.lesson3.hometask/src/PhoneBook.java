import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> pb = new HashMap<>();
        pb.put("Титов", "111");
        pb.put("Веткин", "123");
        pb.put("Волков", "144");
        pb.put("Козлов", "112");
        pb.put("Романов", "117");
        pb.put("Марохонов", "189");
        pb.put("Махалин", "154");
        pb.put("Скрылев", "167");
        pb.put("Панов", "132");
        pb.put("Чернов", "192");

        get(pb,"Волков");
        add(pb, "Захаркин", "109");
        get(pb,"Захаркин");
    }

    static void get(HashMap<String, String> hm, String key)
    {
        System.out.println(hm.get(key));
    }

    static void add(HashMap<String, String> hm, String key, String value)
    {
        hm.put(key, value);
    }
}
