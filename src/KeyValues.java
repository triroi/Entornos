import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeyValues {
    public static void main(String[] args) {
        HashMap<Integer,String> tablero=new HashMap<>();
        tablero.put(0,"Griezzman");
        tablero.put(1,"afgh");
        for (int i=0;i<tablero.size();i++){
            System.out.println(tablero.get((i)));
        }
        /*for(Map.Entry<Integer,String>entry:tablero.entrySet()){
            Integer key= entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }

         */
        Iterator<Map.Entry<Integer,String>>iterator=tablero.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            Integer key = entry.getKey();
            String value= entry.getValue();
            System.out.println(key + " = "+value);
        }
    }
}
