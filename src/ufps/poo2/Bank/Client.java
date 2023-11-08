
package ufps.poo2.Bank;

import ufps.poo2.objects.Bank;

/**
 *
 * @author estudiante
 */
public class Client {

    public static void main(String[] args) {
       
		Bank bank = Bank.createBank();
		//pruebas previo 1
                System.out.println("---------crear cuenta con cliente f3-------");
                //test f3
                bank.openAccount("CDTAccount", 3354678, "11111", "Camilo", "Eduardo", "Nuncira", "Nuncira");
                bank.openAccount("CurrentAccount", 3359302, "222", "Pepito", "Pepe", "pipe", "ccc");
                bank.openAccount("SavingAccount", 3359301, "333", "Juanito", "Juju", "niaju", "bbb");
                bank.openAccount("CDTAccount", 3379844, "44444", "Pablito", "Papa", "blipa", "aaa");
                //deposito en las cuentas
                 System.out.println("---------deposito a cuentas-------");
                 //deposito en las cuentas
		bank.payDividend(3354678, 10);
		bank.payDividend(3359302, 30);
		bank.payDividend(3359301, 20);
		bank.payDividend(3379844, 40);
                //deposito en las cuentas
                 System.out.println("---------obtener saldo F1-------");
                ///test F1
                bank.obtenerSaldo(3354678);
                bank.obtenerSaldo(3359302);
                bank.obtenerSaldo(3359301);
                bank.obtenerSaldo(3379844);
                //test f2
                System.out.println("---------listado de cuentas F2-------");
                //test f2
                bank.listadoCuentas();
                //test f4
                System.out.println("---------Listado de cuentas y clientes F4-------");
                //test f4
                bank.listadoCuentasClientes();
                
                
                
//                //quiz pruebas
//                //agregar cuentas
//                bank.openAccount("CDTAccount", 3354678);
//                bank.openAccount("CurrentAccount", 3359302);
//                bank.openAccount("SavingAccount", 3359301);
//                bank.openAccount("CDTAccount", 3379844);
//                //deposito en las cuentas
//		bank.payDividend(3354678, 10);
//		bank.payDividend(3354678, 30);
//		bank.payDividend(3354678, 20);
//		bank.payDividend(3354678, 40);
//
//                //peticion de retiro
//                bank.withdrawAccount(3354678, 20);
//                //calcular rentabilidad cuenta CDT
//                bank.calcularRentabilidad(3354678, 5);
//                 //calcular rentabilidad cuenta de otro tipo (NO ES VALIDO)
//                bank.calcularRentabilidad(3359302, 5);
//                //listado de cuentas CDT
//                bank.imprimirSaldoCuentasCDT(5);
                
//                bank.openAccount("SavingsAccount", 3354678);
//                bank.openAccount("SavingsAccount", 3359302);
//                bank.openAccount("CurrentAccount", 3379844);
//		
//		bank.payDividend(3354678, 10);
//		bank.payDividend(3354678, 30);
//		
//                bank.getBalance(3354678);
//                
//		bank.payDividend(3359302, 50);
//		bank.payDividend(3359302, 50);
//		
//		bank.payDividend(3379844, 10);
//		bank.payDividend(3379844, 10);
//		
//		bank.getBalance(3379844);
//		
//		bank.withdrawAccount(3379844, 20);
//		bank.withdrawAccount(3379844, 5);
//		
//		bank.getBalance(3379844);
//		
//		bank.withdrawAccount(3379844, 15);
//		
//		bank.getBalance(3379844);
//		
//		bank.sendLetterToOverdraftAccounts();
//		
//	
    }
}
