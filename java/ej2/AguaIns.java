package ej2;

public class AguaIns implements IInstalacion {

    private double price = 109;
    private IPago metodoPago;

    public AguaIns(IPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    private void work() {
        System.out.println("Instalando agua");
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void receivePayment() {
        work();
        metodoPago.receivePayment(price);
    }
}