import java.util.Scanner;

public class ThreadCircle {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("������� �����: ");
		 int v= sc.nextInt();
		 Value vcur=new Value(v);
		 System.out.print("������� ���-�� �������: ");
	     int n = sc.nextInt();
	     Writer[] Writers = new Writer[n];
	     for(int i = 0; i < Writers.length; i++){
	            Writers[i] = new Writer(vcur);
	        }
	     for(int i = 0; i < Writers.length ; i++){
	            Writers[i].start();
	        }
	}

}
