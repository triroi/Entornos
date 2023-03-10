import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tarea {
    public static void main(String[] args) {
        HashMap<Integer,String> tarea1=new HashMap<>();
        tarea1.put(0,"Pastor aleman");
        tarea1.put(1,"Labrador");
        for (int i=0;i<tarea1.size();i++){
            System.out.println(tarea1.get((i)));
        }

        //Bucle for
        /* for(Map.Entry<Integer,String>entry:tablero.entrySet()){
            Integer key= entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }
         */

        //Con iterator y bucle while
        Iterator<Map.Entry<Integer,String>>iterator=tarea1.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            Integer key = entry.getKey();
            String value= entry.getValue();
            System.out.println(key + " = "+value);
        }
    }
}
