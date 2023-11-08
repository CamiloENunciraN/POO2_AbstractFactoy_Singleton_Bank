
package ufps.poo2.factories;

import ufps.poo2.objects.Account;
import ufps.poo2.objects.SavingAccount;
/**
 *
 * @author estudiante
 */
public class SavingAccountFactory implements AccountFactory {

    @Override
    public Account crearAccount(int a, String cc, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
       SavingAccount c=new SavingAccount(a,cc,primerNombre,segundoNombre, primerApellido, segundoApellido);
       return c;
    }
    
}
