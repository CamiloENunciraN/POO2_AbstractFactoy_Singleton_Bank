
package ufps.poo2.factories;

import ufps.poo2.objects.Account;
import ufps.poo2.objects.CDTAccount;

/**
 *
 * @author red-iso
 */
public class CDTAccountFactory implements AccountFactory{

    @Override
    public Account crearAccount(int a, String cc, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
       CDTAccount c=new CDTAccount(a,cc,primerNombre,segundoNombre, primerApellido, segundoApellido);
       return c;
    }
    
}
