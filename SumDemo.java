import java.util.Scanner;
class Mythread implements Runnable{
	String name;
	Thread thrd;
	Mythread(String name){
		thrd = new Thread(this,name);
		thrd.start();
		//this.name=name;
	}
	public void run(){
		System.out.println("MyThread Start");
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(n>0){
			for(int i=1;i<=n;i++){
				sum= sum+i;
			}
			System.out.println("SUM = "+sum);
		}
		else
			System.out.println("INVALID INPUT");
		System.out.println("MyThread Terminate");
	}
	
}

class SumDemo{
	public static void main(String[] args){
		System.out.println("Main Thread Start");
		Mythread mt = new Mythread("SUM");
		//Thread nt = new Thread(mt);
		//nt.start();
		System.out.println("Main Thread Terminate");
	}
}