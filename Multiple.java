


interface Pioneer{  
	void print();  
	}  
	interface Discoverer{  
	void show();  
	}  
	class Multiple implements Pioneer,Discoverer
	{  
	public void print(){System.out.println("Graphite India");}  
	public void show(){System.out.println("Big Bazaar");}  
	  
	public static void main(String args[]){  
		Multiple obj = new Multiple();  
	obj.print();  
	obj.show();  
	 }  
	}
