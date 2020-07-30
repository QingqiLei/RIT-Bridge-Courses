package C11Thread;

public class Evaluator_3 extends Thread {
	int i, j;
	final static int MAX = 2;
	Evaluator_3()	{
        }
	Evaluator_3(int i, int j)	{
		this.i = i;
		this.j = j;
	}
	static int a[][] = new int[MAX][MAX];
	static int b[][] = new int[MAX][MAX];
	static int c[][] = new int[MAX][MAX];
	public void run(){
                for ( int index = 0; index < MAX; index ++ )	{
			c[i][j] += a[i][index] * b[index][j];
		}
        }
	public String print(int a[][], String whichOne){
		String rValue = whichOne + ": \n";
		for(int i = 0; i < MAX; i++){
			for(int j =0; j < MAX; j++){
				rValue += a[i][j] + "  ";
			}
			rValue = rValue + "\n";
		}
		
		return rValue;
	}
	public void init()	{
		for(int i = 0; i < MAX; i++){			// i-->
			for(int j =0; j < MAX; j++){		// j
				a[i][j] = b[i][j] = 2 + i + j ;		// |
			}					// v
		}
		
	}
	public String toString(){
		String rValue = print(a, "A") + print(b, "B" ) + print(c, "C");
		return rValue;
	}
	public void multiply(){
		Evaluator_3 et[] = new Evaluator_3[ MAX * MAX];
		System.out.println(this);
		for(int i = 0; i < MAX; i++){
			for(int j =0; j < MAX; j++){
//				et[counter] = new Evaluator_3(i, j);
//				et[counter].start();
			}
		}
		for(int i = 0; i < MAX * MAX; i++){
//			try{
////				et[counter].join();
//			}
//			catch(InterruptedException e){
//				System.out.println("Interrupted!");
//			}
		}
		System.out.println(this);
	}
	public static void main(String[] args) {
		Evaluator_3 eval = new Evaluator_3();
		eval.init();
		eval.multiply();
	}
}
