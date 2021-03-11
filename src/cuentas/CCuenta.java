package cuentas;

public class CCuenta {

    public String nombre;
    public String cuenta;
    public double saldo;
	//CREAR CUENTA
    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    //CONTROL DE SALDO
    public double getSaldo(){return saldo;}
    public void setSaldo(double a) throws Exception{
    	saldo=a;
    	System.out.print("Nuevo saldo de la cuenta es: "+a);
    }
    //CONTROL DE CUENTA
    public String getCuenta(){return cuenta;}
    public void setCuenta(String a){
    	cuenta=a;
    	System.out.print("Nuevo numero de cuenta es: "+a);
    }
    //CONTROL DE NOMBRE
    public String getNombre(){return nombre;}
    public void setNombre(String a) throws Exception{
    	nombre=a;
    	System.out.print("Nuevo nombre del titular es: "+a);
    }
    //INGRESAR Y RETIRAR SALDO DE CUENTA
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        	saldo = saldo + cantidad;
        	System.out.print("Se ha ingresado: "+cantidad);
    	}
    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0) throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo()< cantidad) throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
        System.out.print("Se ha retirado: "+cantidad);
    	}

}
