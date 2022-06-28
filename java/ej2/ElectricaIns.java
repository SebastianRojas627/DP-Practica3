package ej2;

public class ElectricaIns implements IInstalacion{

    private double price = 59;
    private IPago metodoPago;

    public ElectricaIns(IPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    private void work() {
        System.out.println("Instalando electricidad");
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
