package lab4;

public class CFGtest {
	public int foo (int A, int B, int X) {
		if(A > 1 && B == 0) { //1
			X = X/A; //2
			System.out.println("1 worked");
		}
		
		if(A == 2 || X > 1) { //3
			X=X+1; //4
			System.out.println("2 worked");
		}
		System.out.println("END");
		return X;
	} //5
}
