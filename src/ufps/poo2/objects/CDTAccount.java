package ufps.poo2.objects;


/**
 *
 * @author camilo Nuncira
 */
public class CDTAccount extends Account{

    public CDTAccount(int a, String cc, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        super(a,cc, primerNombre, segundoNombre, primerApellido, segundoApellido);
    }
    
    public double calcularRentabilidad(int numDias){
       Double i=((this.getBalance()/100)*numDias)+this.getBalance();
//           System.out.println("Acc " + this.getAccountNumber() + ": " + "Rentabilidad = " + i);
    return i;
    }
    
    @Override
    	public  void withdraw(double sum) {
        System.out.println("Esta cuenta no permite hacer retiros");
	}
    ///requerimiento F1
    @Override
    public void  obtenerSaldo(){
           System.out.println("Cuenta: "+this.getAccountNumber()+" Saldo: "+this.calcularRentabilidad(10));
    }
}
