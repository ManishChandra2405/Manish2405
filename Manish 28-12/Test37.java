import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
class Test37
{
  public static void main(String[] args)
   { 
    TreeMap<String,String> map= new TreeMap<>();
    map.put("anish@gmail.com","manish23@gmail.com");
    map.put("bunil@gmail.com","Sunil23@gmail.com");
    map.put("Aowsy@gmail.com","Kowsy123@gmail.com");
    Set<Entry<String,String>> set =  map.entrySet();
    for(Entry<String,String> s : set)
    System.out.println(s.getKey()+"  "+s.getValue());
    }
}