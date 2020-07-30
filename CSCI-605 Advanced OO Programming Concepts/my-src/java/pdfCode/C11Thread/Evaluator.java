package C11Thread;

// fuer jedes resultat ein der es ausrechnet
// auf das ende der ausrechner muss gewartet werden
public class Evaluator extends Thread {
	int i, j;
	final static int MAX = 2;
	Evaluator()	{
        }
	Evaluator(int i, int j)	{
		this.i = i;
		this.j = j;
	}
	static int a[][] = new int[MAX][MAX];
	static int b[][] = new int[MAX][MAX];
	static int c[][] = new int[MAX][MAX];
	public void run(){
                for ( int index = 0; index < MAX; index ++ )	{
			try { sleep (100); } catch (Exception e ){} ;
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
		Evaluator et[] = new Evaluator[ MAX * MAX];
		for(int i = 0; i < MAX; i++){
			for(int j =0; j < MAX; j++){
				new Evaluator(i, j).start();
			}
		}
		System.out.println(this);
	}
	public static void main(String[] args) {
		Evaluator eval = new Evaluator();
		eval.init();
		eval.multiply();
	}
}
