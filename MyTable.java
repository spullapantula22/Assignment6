
public class MyTable {
	private Entry[] entries = new Entry[26];
	private int size = 0;
	
	public void add(char c, String s) {
		
		if(size >= entries.length) return;
		
		entries[size++] = new Entry(s,c);
		
	}
	
	public String get(char c){
		
		if(entries == null) return "";
		
		for(Entry a: entries) {
			
			if(a != null && a.ch == c) {
				
				return a.toString();
			}
		}
		
		return "";
	}

	public String toString() {
		
		StringBuilder total = new StringBuilder();
		
		for(Entry t: entries) {
			
			if(t != null) {
				
				total.append(t);
			}
		}
		return total.toString();
	}
	
	private class Entry {
		
		private String str;
		private char ch;
		
		Entry(String str, char ch){
			
			this.str = str;
			this.ch = ch;
			
		}
		
		public String toString() {

			return ch + "->" + str + "\n";
		}
	}
	
}