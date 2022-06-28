package ej2;

public class TransferenciaBancaria implements IPago {

    @Override
    public void receivePayment(double payment) {
        System.out.println("Hay desceunto del 5% por realizar transferencia bancaria");
        System.out.println("Precio original: " + payment);
        System.out.println("Monto a cobrar: " + (payment - payment * 0.05));
    }
}
