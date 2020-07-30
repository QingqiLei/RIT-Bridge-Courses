package C11Thread;

// es gibt immer nur einen ausrechner, aber das ergebniss is richtig
public class Evaluator_2 extends Thread {
	int i, j;
	final static int MAX = 2;
	Evaluator_2()	{
        }
	Evaluator_2(int i, int j)	{
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
		System.out.println(this);
		for(int i = 0; i < MAX; i++){
			for(int j =0; j < MAX; j++){
				Evaluator_2 et = new Evaluator_2(i, j);
				et.start();
				try { 
					et.join();
				} catch ( Exception e )	{
				}
			}
		}
		System.out.println(this);
	}
	public static void main(String[] args) {
		Evaluator_2 eval = new Evaluator_2();
		eval.init();
		eval.multiply();
	}
}
