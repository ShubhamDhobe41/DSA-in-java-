package Collection;
import java.util.TreeMap;
public class TreeMaps {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(101,"Deepak");
        treeMap.put(102,"Ajay");
//        Heterogeneous
        treeMap.put(103,32);
        treeMap.put(105,"Manish");
        treeMap.put(104,"Atuls");

        System.out.println(treeMap);

        System.out.println(treeMap.ceilingEntry(102));
        System.out.println(treeMap.ceilingEntry(108));
//        ceiling entry work like if provided input not available then input's greater number will print and return key value pair
        System.out.println(treeMap.ceilingEntry(100));
//        only key provide
        System.out.println(treeMap.ceilingKey(102));

//        treeMap.clear();
//        System.out.println(treeMap);

        System.out.println(treeMap.containsKey(104));

//       return true if provided value present in map otherwise false
        System.out.println(treeMap.containsValue("Deepak"));

//      convert map to set
        System.out.println(treeMap.entrySet());

//      return first element key and value
        System.out.println(treeMap.firstEntry());
//       return last element key and value
        System.out.println(treeMap.lastEntry());

//       return first element key
        System.out.println(treeMap.firstKey());
//        return Last element key
        System.out.println(treeMap.lastKey());

//        floor entry work like if provided input not available then input's lesser number will print and return key value pair
        System.out.println(treeMap.floorEntry(108));
        System.out.println(treeMap.floorEntry(102));

//       get() work like if provided input not available then null will return . otherwise perticular input's value return
        System.out.println(treeMap.get(101));
        System.out.println(treeMap.get(109));
//      headMap() used to get perticular key value as a set
        System.out.println(treeMap.headMap(102));

//      greater value return but not equal value will return
        System.out.println(treeMap.higherEntry(102));
        System.out.println(treeMap.higherEntry(104));
        System.out.println(treeMap.higherEntry(110));

//      check map is empty or not
        System.out.println(treeMap.isEmpty());

//      return  only key
        System.out.println(treeMap.keySet());

//       remove first entry
        System.out.println(treeMap.pollFirstEntry());
//       remove last entry
        System.out.println(treeMap.pollLastEntry());

//      remove perticular value using key
        System.out.println(treeMap.remove(104));

//      replace perticular entry
        System.out.println(treeMap.replace(102,"Ashish"));
        System.out.println(treeMap);
//      check size of map
        System.out.println(treeMap.size());

        System.out.println(treeMap.subMap(101,105));
    }

}
