
public class AssertNullClass {
	public AssertNullClass assertN(AssertNullClass an) {
		an = null;
		return an;
	}
	
	public AssertNullClass assertNotN(AssertNullClass anc) {
		anc = new AssertNullClass();
		return anc;
	}
}
