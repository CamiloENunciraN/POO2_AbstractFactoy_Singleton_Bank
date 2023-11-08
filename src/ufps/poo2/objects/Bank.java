package ufps.poo2.objects;
import java.util.ArrayList;
import ufps.poo2.factories.CDTAccountFactory;
import ufps.poo2.factories.CurrentAccountFactory;
import ufps.poo2.factories.SavingAccountFactory;

public class Bank {
private ArrayList <Account> accounts;
private SavingAccountFactory SAF;
private CurrentAccountFactory CAF;
private CDTAccountFactory CDAF;
private static Bank myBank;

public static Bank createBank(){
    if (myBank == null) {
        myBank = new Bank();
    }
return myBank;
}

private Bank() {
    this.accounts=new ArrayList<Account>();
    this.SAF=new SavingAccountFactory();
    this.CAF=new CurrentAccountFactory();
    this.CDAF=new CDTAccountFactory();
}

public void deleteAccount(int accnum){
    Account acc=this.searchAccount(accnum);
    if(acc==null){
       System.err.println("Account not found");
    }else{
        this.accounts.remove(acc);
        System.out.println("Account remove: "+acc.getAccountNumber());
    }
}

private Account searchAccount(int accnum){
    for(int i=0;i<this.accounts.size();i++){
        if(this.accounts.get(i).getAccountNumber()==accnum){
            return this.accounts.get(i);
        }  
    }
    return null;
}

public void payDividend(int accnum, double sum){
    Account acc=this.searchAccount(accnum);
    if(acc==null){
       System.err.println("Account not found");
    }else{
        acc.deposit(sum);
        System.out.println("Acc "+acc.getAccountNumber()+" deposit: "+sum);
    }
}

public void withdrawAccount(int accnum, double sum){
    Account acc=this.searchAccount(accnum);
    if(acc==null){
       System.out.println("Account not found");
    }else{
        System.out.println("Acc "+acc.getAccountNumber()+" withdraw: "+sum);
        acc.withdraw(sum);
    }
}

public void getBalance(int accnum){
    Account acc=this.searchAccount(accnum);
    if(acc==null){
       System.out.println("Account not found");
    }else{
     acc.print();
    }
}

public void sendLetterToOverdraftAccounts(){
    for(int i=0;i<this.accounts.size();i++){
        Account c=this.accounts.get(i);
        if(c instanceof CurrentAccount && c.getBalance()<0){
            System.out.println("---------Account in overdraft----------");
            c.print();
        }  
    } 
}

public void imprimirSaldoCuentasCDT(int numDias){
    System.out.println("------Listado de cuentas CDT------");
    for(int i=0;i<this.accounts.size();i++){
        if(this.accounts.get(i) instanceof CDTAccount){
          CDTAccount c=  (CDTAccount) this.accounts.get(i);
          c.calcularRentabilidad(numDias);
        }
    }
}

    public void calcularRentabilidad(int accnum, int numDias) {
        Account c=this.searchAccount(accnum);
        
         if(c instanceof CDTAccount){
             ((CDTAccount) c).calcularRentabilidad(numDias);
         }else{
             System.out.println("La cuenta: "+accnum+" no es de tipo CDT");
         }
    }
    ///requerimiento F1
    public void obtenerSaldo(int accnum){
       Account c= this.searchAccount(accnum);
       c.obtenerSaldo();
    }
    ///requerimiento F2
    public void listadoCuentas(){
        System.out.println("---------Listado de cuentas-------");
        for(int i=0;i<this.accounts.size();i++){
            Account c=this.accounts.get(i);
            c.obtenerSaldo();
        }
    }
    
    //requerimiento F3
public void openAccount(String AccountType, int accnum, String cc, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido){
    Account c;
    if(AccountType=="SavingAccount"){
        c=this.SAF.crearAccount(accnum, cc, primerNombre, segundoNombre, primerApellido, segundoApellido);
        this.accounts.add(c);
        System.out.println("Account open: "+c.getAccountNumber());
    }else if(AccountType=="CurrentAccount"){
        c=this.CAF.crearAccount(accnum, cc, primerNombre, segundoNombre, primerApellido, segundoApellido);
         this.accounts.add(c);
         System.out.println("Account open: "+c.getAccountNumber());
    }else if(AccountType=="CDTAccount"){
        c=this.CDAF.crearAccount(accnum, cc, primerNombre, segundoNombre, primerApellido, segundoApellido);
         this.accounts.add(c);
        System.out.println("Account open: "+c.getAccountNumber());
    }else{
        System.out.println("Tipo de cuenta no valido");
    }

}

    ///requerimiento F4
    public void listadoCuentasClientes(){
        System.out.println("---------Listado de cuentas y clientes-------");
        for(int i=0;i<this.accounts.size();i++){
            Account c=this.accounts.get(i);
            System.out.println("Cuenta: "+c.getAccountNumber()+" Cliente: "+c.getNombreCliente());
        }
    }
}
