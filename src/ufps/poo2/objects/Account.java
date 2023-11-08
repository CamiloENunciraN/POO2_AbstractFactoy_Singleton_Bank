
package ufps.poo2.objects;

/**
 *
 * @author estudiante
 */
public class Account {
   
	private double bal; // The current balance
	private int accnum; // The account number
        private Cliente myCliente;
        
	public Account(int a, String cc, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
		bal = 0.0;
		accnum = a;
                this.myCliente=new Cliente(cc, primerNombre, segundoNombre, primerApellido, segundoApellido);
	}

	public void deposit(double sum) {
		if (sum > 0)
			bal += sum;
		else
			System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
	}

	public void withdraw(double sum) {
		if (sum > 0)
			bal -= sum;
		else
			System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
	}

	public double getBalance() {
		return bal;
	}

	public int getAccountNumber() {
		return accnum;
	}

	public String toString() {
		return "Acc " + accnum + ": " + "balance = " + bal;
	}

	public final void print() {
		// Don't override this,
		// override the toString method
		System.out.println(toString());
	}
        ///requerimiento F1
	public void  obtenerSaldo(){
            
        }
        public String getNombreCliente(){
            return this.myCliente.nombreCompleto();
        } 
}
