package ej2;

public class AlcantarillaIns implements IInstalacion{

    private double price = 159;
    private IPago metodoPago;

    public AlcantarillaIns(IPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    private void work() {
        System.out.println("Instalando alcantarilla");
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
