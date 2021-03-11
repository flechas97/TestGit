package cuentas;

public class Main {

    public static void main(String[] args) throws Exception {
        //creamos la cuenta
        CCuenta cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        //imprimimos los datos de la cuenta1
        System.out.println("Datos de la cuenta=\n"+"NOMBRE= "+cuenta1.getNombre()+"\n"
        +"Nº CUENTA= "+cuenta1.getCuenta()+"\n"+"SALDO ACTUAL= "+cuenta1.getSaldo()+"\n");
        //Cambiamos el nombre a pedro
        cuenta1.setNombre("Pedro Cuesta\n");
        System.out.println("");
        //Retirada de dinero en cuenta
        try {
        	System.out.println("Retirada en cuenta");
        	cuenta1.retirar(2200);
        	System.out.println("----> Nuevo saldo= "+cuenta1.getSaldo());
        } catch (Exception e) {System.out.print("Fallo al retirar");}
        //Ingreso de dinero en cuenta
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("----> Nuevo saldo= "+cuenta1.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");//hola
        }
    }
}
