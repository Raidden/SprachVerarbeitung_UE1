import java.applet.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class HelloWorld {

	private int  a, b , c ;
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {

	String result = ""; 
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	 map.put("a", 4);
	 map.put("c", 6);
	 map.put("b", 2);
	 Object[] a = map.entrySet().toArray();
	 Arrays.sort(a, new Comparator() {
	     public int compare(Object o1, Object o2) {
	         return ((Map.Entry<String, Integer>) o2).getValue()
	                    .compareTo(((Map.Entry<String, Integer>) o1).getValue());
	     }
	 });
	 
	 for (Object e : a) {
		 result+= ((Map.Entry<String, Integer>) e).getKey() + " : "
             + ((Map.Entry<String, Integer>) e).getValue()+"\r";
		 
	 }
	 	 System.out.println(result);
	 
}
}
