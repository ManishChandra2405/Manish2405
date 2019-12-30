import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
class Test34
{
  public static void main(String[] args)
   { 
    HashMap<String,String> map= new HashMap<>();
    map.put("manish@gmail.com","manish23@gmail.com");
    map.put("Sunil@gmail.com","Sunil23@gmail.com");
    map.put("kowsy@gmail.com","Kowsy123@gmail.com");
    Set<String> keys = map.keySet();
    for(String k : keys)
     System.out.println(k+" "+map.get(k));
    System.out.println(map.size());
    Collection<String> values = map.values();
    for(String v : values)
     System.out.println(v);
   }
}
 