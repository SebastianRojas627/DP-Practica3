package ej2;

public class Client {

    public static void main(String[] args){

        IPago appPago = new EmpresaApp();
        IPago tigoMoney = new TigoMoney();
        IPago banco = new TransferenciaBancaria();

        IInstalacion agua = new AguaIns(tigoMoney);
        IInstalacion alcantarilla = new AlcantarillaIns(banco);
        IInstalacion electricidad = new ElectricaIns(appPago);

        alcantarilla.receivePayment();
        agua.receivePayment();
        electricidad.receivePayment();
    }
}