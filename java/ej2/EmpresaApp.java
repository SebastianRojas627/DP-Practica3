package ej2;

public class EmpresaApp implements IPago{

    @Override
    public void receivePayment(double payment) {
        System.out.println("Hay descuento del 10% utilizando la aplicacion de la empresa");
        System.out.println("Precio original: "+payment);
        System.out.println("Monto a cobrar "+(payment - payment * 0.1));
    }
}