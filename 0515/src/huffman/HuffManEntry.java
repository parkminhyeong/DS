package huffman;

public class HuffmanEntry {
	private int frequency;
	private String word;
	private HuffmanEntry left;
	private HuffmanEntry right;
	private String code;
	
	public HuffmanEntry (int newFreq, String newValue, HuffmanEntry l, HuffmanEntry r, String s) {
		frequency = newFreq;
		word = newValue;
		left = l;
		right = r;
		code = s;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public HuffmanEntry getLeft() {
		return left;
	}

	public void setLeft(HuffmanEntry left) {
		this.left = left;
	}

	public HuffmanEntry getRight() {
		return right;
	}

	public void setRight(HuffmanEntry right) {
		this.right = right;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}