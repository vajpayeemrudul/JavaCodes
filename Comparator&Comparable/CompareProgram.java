import java.util.*;

/*
 * Comparable interface
 *    public int compareTo(Object o);
 * Comparator interface
 *    public int compare(Object o1, Object o2);
 */

public class CompareProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
         
      List<P> list= new ArrayList<>();
   	  list.add(new P(5,4));
   	  list.add(new P(6,6));
   	  list.add(new P(1,9));
   	  list.add(new P(76,6));
   	  list.add(new P(15,13));
   	  list.add(new P(26,36));
   	  list.add(new P(5,3));
   	  list.add(new P(7,6));	
   	  Collections.sort(list);
   	  list.forEach(System.out::println);
   	  
   	  List<Q> list2= new ArrayList<>();
   	  list2.add(new Q("aman",91));
   	  list2.add(new Q("aman",67));
   	  list2.add(new Q("chaman",67));
   	  list2.add(new Q("amnkur",89));
   	  list2.add(new Q("sanay",45));
   	  list2.add(new Q("rohan",67));
   	  list2.add(new Q("khanna",49));
   	  Collections.sort(list2, new Comparator<Q>(){
   		  public int compare(Q q1, Q q2)
   		  {
   			  if(q1.b==q2.b)
   			  {
   				  return q1.a.compareTo(q2.a);
   			  }
   			  return q1.b-q2.b;
   		  }
   	  });
   	  /*  We can use following lambda expressions to sort the given collections
   	    Collections.sort(list2,(Q q1, Q q2)->{
   		  if(q1.b==q2.b)
   		  {
   			  return q1.a.compareTo(q2.a);
   		  }
   		  return q1.b-q2.b;
   	  });
   	  
   	  Collections.sort(list2, Comparator.comparing(Q::getb).thenComparing(Q::geta).reversed());
   	   */
   	  
   	  list2.forEach(System.out::println);
        		 
         sc.close();
	}

}
class P implements Comparable<P>{
	int a;
	int b;
	public P(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public String toString()
	{
		return a+" "+b;
	}
	
	public int compareTo(P p)
	{
		if(this.a==p.a)
			return this.b-p.b;
		return this.a-p.a;
	}
	
}

class Q{
	String a;
	int b;
	public Q(String a, int b)
	{
		super();
		this.a=a;
		this.b=b;
	}
	
	public String toString()
	{
		return a+" "+b;
	}
	public String geta()
	{
		return a;
	}
	public int getb()
	{
		return b;
	}
}
