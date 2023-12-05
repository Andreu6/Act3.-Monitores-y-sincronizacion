
public class main {
	 public static void main(String[] args) {
	        Banco banco = new Banco();

	        Cliente cliente1 = new Cliente(banco, "Cliente1");
	        Cliente cliente2 = new Cliente(banco, "Cliente2");

	        cliente1.start();
	        
	        try {Thread.sleep(1000);} 
		    catch (InterruptedException e) { }
	        
	        cliente2.start();
	      
	    }

}
