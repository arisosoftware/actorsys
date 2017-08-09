package a1;

import java.util.Arrays;
import java.util.Random;

class People implements Comparable<People>
{		
	public int money;
	public int id;
	@Override
	public int compareTo(People o) {		
		return this.money - o.money;
	}
}
public class RandMoneyTransfer {


	 
	public static void main(String[] args) {
		People[] pp = new People[100];
		
		for(int i=0;i<100;i++)
		{
			People p = new People();
			p.money =100;
			p.id = i;
			pp[i] = p;
		}
		
		Random rnd = new Random();
		
		for(int n=0;n<600000;n++)
		{
			for(int i=0;i<100;i++)
			{
				if (pp[i].money>0)
				{
				
						int idx = rnd.nextInt(100);
							pp[i].money =  pp[i].money -1;
							pp[idx].money =	pp[idx].money+1;
				}
			}
		}
		
		Arrays.sort(pp);
		
		for(int i=0;i<100;i++)
		{
			//System.out.print(pp[i].id+"\t"+pp[i].money+"\n");
			System.out.print(pp[i].money+"\n");
		}
		
		
	}

	 

}

 
