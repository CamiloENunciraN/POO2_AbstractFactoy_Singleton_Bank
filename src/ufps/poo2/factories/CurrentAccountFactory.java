
package ufps.poo2.factories;

import ufps.poo2.objects.Account;
import ufps.poo2.objects.CurrentAccount;

/**
 *
 * @author estudiante
 */
public class CurrentAccountFactory implements AccountFactory{

    @Override
    public Account crearAccount(int a, String cc, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
       CurrentAccount c=new CurrentAccount(a,cc,primerNombre,segundoNombre, primerApellido, segundoApellido);
       return c;
    }
}
