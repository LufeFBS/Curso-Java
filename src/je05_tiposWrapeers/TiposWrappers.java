package je05_tiposWrapeers;

import static jdk.internal.org.jline.utils.Colors.s;

public class TiposWrappers {
    public static void main(String[] args) {
       // Double d = 100.0;
       // Integer i = d.intValue();
       // System.out.println(i); // 100

        //String num = "100";
        //int i = Integer.parseInt(num);
        //System.out.println(i); //100

        //Integer obj = new Integer(s:"100");
        //int i = obj.intValue();
       // System.out.println(i);//100

        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("101");

        System.out.println(obj1.equals(obj2)); //true
        System.out.println(obj1 < obj2); // 0

    }
}
