package ej2;

public class TigoMoney implements IPago {

    @Override
    public void receivePayment(double payment) {
        System.out.println("Hay un descuento del 2% por utilizar Tigo Money");
        System.out.println("Precio original: " + payment);
        System.out.println("Monto a cobrar: " + (payment - payment * 0.02));
    }
}
