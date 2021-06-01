package bheap;

public class Entry <Key extends Comparable<Key>, Value>{
	private Key ky;
	private Value val;
	
	public Entry (Key newKey, Value newValue) {
		ky = newKey;
		val = newValue;
	}

	public Key getKy() {
		return ky;
	}

	public void setKy(Key ky) {
		this.ky = ky;
	}

	public Value getVal() {
		return val;
	}

	public void setVal(Value val) {
		this.val = val;
	}
	
	
	

}