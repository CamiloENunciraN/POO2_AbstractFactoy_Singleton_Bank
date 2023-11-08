
package ufps.poo2.objects;

/**
 *
 * @author estudiante
 */
public class CurrentAccount extends Account{
     private double overLimit;

    public CurrentAccount(int a, String cc, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        super(a,cc, primerNombre, segundoNombre, primerApellido, segundoApellido);
        this.overLimit=10;
    }
    
     @Override
     public void withdraw(double sum) {
    if((this.getBalance()+this.getOverLimit())>=sum){
        super.withdraw(sum);
    }else{
        System.out.println("The requested amount cannot be withdrawn from the account because it exceeds the overdraft limit.");
    }
}
		
       
    public double getOverLimit() {
        return overLimit;
    }

    public void setOverLimit(double overLimit) {
        this.overLimit = overLimit;
    }
    ///requerimiento F1
     @Override
    public void  obtenerSaldo(){
           System.out.println("Cuenta: "+this.getAccountNumber()+" Saldo: "+(this.getBalance()+this.getOverLimit()));
    }
}
