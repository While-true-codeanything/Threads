
public class Writer extends Thread{
	int number;
	static int name=1;
	Value numbertw;
	static int g;
	Writer(Value v2){
		number =name;
		numbertw=v2;
		name++;
	}

	public void run() {   
		while(true) {
                synchronized (numbertw) {
                	 System.out.println("Writer " + this.number + " Says: "+numbertw.GetValue()+"\n");
                	 try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
		}

}
}