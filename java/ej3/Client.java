package ej3;

public class Client {

    public static void main(String[] args) {

        IComponent f1 = new File(48);
        IComponent f2 = new File(154);
        IComponent f3 = new File(634);
        IComponent f4 = new File(197);
        IComponent f5 = new File(2);

        IComponent folder1 = new Folder();
        IComponent folder2 = new Folder();

        folder1.addChild(f1);
        folder1.addChild(f2);

        folder2.addChild(f3);
        folder2.addChild(f4);
        folder2.addChild(f5);

        Disco discoC = new Disco();

        discoC.addChild(folder1);
        discoC.addChild(folder2);

        System.out.println("El disco tiene " + discoC.getNumberOfWords() + " palabras");
        System.out.println("El folder 1 tiene " + folder1.getNumberOfWords() + " palabras");
        System.out.println("El folder 2 tiene " + folder2.getNumberOfWords() + " palabras");

    }
}
