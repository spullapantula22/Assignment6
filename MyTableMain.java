
public class MyTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTable t = new MyTable();
		
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('c',"Charlie");
		
		String s = t.get('b');
		
		System.out.println(t);
	}

}
