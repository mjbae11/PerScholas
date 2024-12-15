import java.util.HashMap;

public class ExampleTwoHashMap
{
    public static void main(String[] args)
    {
        HashMap<String, String> newHashMap = new HashMap<String, String>();
        // Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains:" + newHashMap);

        System.out.println("size of Original map: " + newHashMap.size());
        HashMap<String, String> copyHashMap = new HashMap<>(newHashMap);
        System.out.println("Copy map contains:" + copyHashMap);
        String nullValue = copyHashMap.remove(null);
        System.out.println("Null value: " + nullValue);
        System.out.println("after Null value removal in copy: " + copyHashMap);
        System.out.println("Size of copy: " + copyHashMap.size());
    }

}
