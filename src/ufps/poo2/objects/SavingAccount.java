
package ufps.poo2.objects;

/**
 *
 * @author estudiante
 */
public class SavingAccount extends Account {
    private double interest;

    public SavingAccount(int a, String cc, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        super(a,cc, primerNombre, segundoNombre, primerApellido, segundoApellido);
        this.interest=10;///%
    }
    
    @Override
    	public void deposit(double sum) {
            double porcentaje=(this.getBalance()*this.getInterest())/100;
            super.deposit(sum+porcentaje);
	}

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    ///requerimiento F1
    @Override
    public void  obtenerSaldo(){
            System.out.println("Cuenta: "+this.getAccountNumber()+" Saldo: "+this.getBalance());
    }
}
