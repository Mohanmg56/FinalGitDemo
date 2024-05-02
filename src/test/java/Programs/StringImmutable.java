package Programs;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello";
		String b="Hello";
		String c=a.concat("World");
		System.out.println(c);
		
		String s= new String("Hello");
		String s1= new String("Hello");
		s.concat("World");
		System.out.println(s);
		
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		System.out.println(a.equals(s));
		System.out.println(a==s);
		
		//StringBuffer and String Builders
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("World");
		//System.out.println(sb);
		////sb.insert(2, "She");
		//System.out.println(sb);
		//sb.delete(3, 7);
		//System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		}

}
