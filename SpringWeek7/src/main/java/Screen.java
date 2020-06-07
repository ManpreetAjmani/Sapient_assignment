
public class Screen {
	
	private int l;
	private int b;
	
	public int getLength() {
		return l;
	}
	
	public void setLength(int length) {
		this.l = length;
	}
	
	public int getBreadth() {
		return b;
	}
	
	public void setBreadth(int breadth) {
		this.b = breadth;
	}
	
	public Screen(int length, int breadth) {
		this.l = length;
		this.b = breadth;
	}
	
	@Override
	public String toString() {
		return "Screen [length=" + l + ", breadth=" + b + "]\n";
	}
}
