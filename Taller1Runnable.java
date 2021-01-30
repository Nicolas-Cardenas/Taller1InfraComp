import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Taller1Runnable implements Runnable{



	private static int limiteSuperior;

	public Taller1Runnable() throws InterruptedException
	{
		numeroPar(limiteSuperior);
	}

	public Taller1Runnable(int limiteSuperior) throws InterruptedException
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






	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numero = br.readLine();
		limiteSuperior = Integer.valueOf(numero);

		Thread t1 = new Thread(new Taller1Runnable());

		Thread t2 = new Thread(new Taller1Runnable(limiteSuperior));
		t1.start();
		t2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
