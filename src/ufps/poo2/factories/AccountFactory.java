
package ufps.poo2.factories;

import ufps.poo2.objects.Account;

/**
 *
 * @author camilo
 */
public interface AccountFactory {
    
    
    public Account crearAccount(int a, String cc, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido);
}
