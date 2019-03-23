public class Myclass{
	int m=2;
	int n=3;
	String s="b";

	Myclass(int m, int n, String s){
		this.n=n;
		this.s=s;
		System.out.print("-"+m+"-"+n+"-"+s);
	}
	void method (int m,int n, String s){
		this.m=m;
		this.n=n;
		this.s=s;
	}
	public static void main(String[] args){
		Myclass mc=new Myclass(4,6,"h");
		mc.method(7,9,"w");
	}
}
