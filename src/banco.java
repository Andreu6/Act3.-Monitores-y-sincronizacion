
class Banco {
    private int clientesBanco = 0;
    public synchronized void ingresarBanco(String nombreCliente) {
    	
        while (clientesBanco >= 2) {
        	
            try {
            	
                System.out.println(nombreCliente + " está esperando.\n");
                wait();
                
            } catch (InterruptedException e) {}
            
        }

        clientesBanco++;
        System.out.println(nombreCliente + " ha ingresado.\n Clientes dentro: " + clientesBanco);
        
    }

    public synchronized void salirBanco(String nombreCliente) {
    	
    	clientesBanco--;
        System.out.println(nombreCliente + " ha salido.\n Clientes dentro: " + clientesBanco);
        notifyAll();
        
    }
    
}