import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
class Test35
{
  public static void main(String[] args)
   { 
    HashMap<String,String> map= new HashMap<>();
    map.put("manish@gmail.com","manish23@gmail.com");
    map.put("Sunil@gmail.com","Sunil23@gmail.com");
    map.put("kowsy@gmail.com","Kowsy123@gmail.com");
    Set<Entry<String,String>> set =  map.entrySet();
    for(Entry<String,String> s : set)
    System.out.println(s.getKey()+"  "+s.getValue());
    }
}