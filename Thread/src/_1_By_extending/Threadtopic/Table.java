package _1_By_extending.Threadtopic;

public class Table {

	public void printTable(int no)
	{
		for(int i=1; i<=10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(no+"*"+i+"="+no*i);
		}
	}
}
