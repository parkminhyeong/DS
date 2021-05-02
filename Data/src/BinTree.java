public class BinTree {

	public static void main(String[] args) {
		BTNode<Integer> n1 = new BTNode<Integer>(100,null,null);
		BTNode<Integer> n2 = new BTNode<Integer>(200,null,null);
		BTNode<Integer> n3 = new BTNode<Integer>(300,null,null);
		BTNode<Integer> n4 = new BTNode<Integer>(400,null,null);
		BTNode<Integer> n5 = new BTNode<Integer>(500,null,null);
		BTNode<Integer> n6 = new BTNode<Integer>(600,null,null);
		BTNode<Integer> n7 = new BTNode<Integer>(700,null,null);
		BTNode<Integer> n8 = new BTNode<Integer>(800,null,null);
		
		n1.setLeft(n2);
		n1.setRigth(n3);
		n2.setLeft(n4);
		n2.setRigth(n5);
		n3.setLeft(n6);
		n3.setRigth(n7);
		n4.setLeft(n8);
		
		BinaryTree<Integer> t = new BinaryTree<Integer>();
		t.setRoot(n1);

		
		BTNode<Integer> n10 = new BTNode<Integer>(100,null,null);
		BTNode<Integer> n20= new BTNode<Integer>(200,null,null);
		BTNode<Integer> n30 = new BTNode<Integer>(300,null,null);
		BTNode<Integer> n40 = new BTNode<Integer>(400,null,null);
		BTNode<Integer> n50 = new BTNode<Integer>(500,null,null);
		BTNode<Integer> n60 = new BTNode<Integer>(600,null,null);
		BTNode<Integer> n70 = new BTNode<Integer>(700,null,null);
		BTNode<Integer> n80 = new BTNode<Integer>(800,null,null);
		
		n10.setLeft(n20);
		n10.setRigth(n30);
		n20.setLeft(n40);
		n20.setRigth(n50);
		n30.setLeft(n60);
		n30.setRigth(n70);
		n40.setLeft(n80);
		
		BinaryTree<Integer> t2 = new BinaryTree<Integer>();
		t2.setRoot(n10);
		
		

	}

}