package abstractioninterface;

interface make {
	void result();
}

class first implements make{
	public void  result()
	{
		System.out.println("hii am dharmik");
	}
 
	public static void main(String[] args) {
		first m = new first();
		m.result();
	}
}

