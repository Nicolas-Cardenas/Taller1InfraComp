import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Taller1Thread extends Thread{


	private static int limiteSuperior;
	
	public Taller1Thread() throws InterruptedException
	{
		numeroPar(limiteSuperior);
	}
	
	public Taller1Thread(int limiteSuperior) throws InterruptedException
	{
		numeroImpar(limiteSuperior);
	}




	public static void numeroPar(int limiteSuperior) throws InterruptedException
	{
		ArrayList<Integer> lista = new ArrayList<Integer>();

		for(int i=1;i<=limiteSuperior;i++)
		{
			lista.add(i);
		}


		for(int i=0;i<lista.size();i++)
		{
			double moduloPar=lista.get(i)%2;
			if(moduloPar==0)
			{
				System.out.println(lista.get(i));
				Thread.sleep(1000);
			}
		}
	}

	public static void numeroImpar(int limiteSuperior) throws InterruptedException
	{
		ArrayList<Integer> lista = new ArrayList<Integer>();

		for(int i=1;i<=limiteSuperior;i++)
		{
			lista.add(i);
		}


		for(int i=0;i<lista.size();i++)
		{
			double moduloPar=lista.get(i)%2;
			if(moduloPar==1)
			{
				System.out.println(lista.get(i));
				Thread.sleep(1000);
				
			}
		}
	}




	public void run()
	{
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numero = br.readLine();
		limiteSuperior = Integer.valueOf(numero);

		Taller1Thread t1 = new Taller1Thread();
		t1.start();
		
		Taller1Thread t2 = new Taller1Thread(limiteSuperior);
		t2.start();
		


	}

}
