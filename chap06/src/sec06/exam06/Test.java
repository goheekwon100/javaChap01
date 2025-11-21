package sec06.exam06;

public class Test {
	  public static void change(String[] data, String s){
	    data[0] = s;
	    System.out.println("change String s" + s.hashCode());
	    s = "Z";
	    System.out.println(s.hashCode());
	  }

	  public static void main(String[] args) {
	    String data[] = { "문자열" };
	    String s = "문자열";
	    System.out.println("main String s" + s.hashCode());

	    change(data, s);
	    System.out.print(data[0] + s);
	  }
	  
}
