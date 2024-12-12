import java.util.HashMap;

public class HashMapClass
{
    HashMap<Integer, String> mapObj = new HashMap<Integer, String>();

    public void useHashMap()
    {
        mapObj.put(1, "Atlanta");
        mapObj.put(2, "Boise");
        mapObj.put(3, "Tukwila");
        mapObj.put(4, "Chicago");
        mapObj.put(5, "San Francisco");
        mapObj.put(6, "Seattle");
        System.out.println(mapObj);
    }
}
