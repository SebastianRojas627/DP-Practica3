package ej3;

public interface IComponent {

    int getNumberOfWords();

    void addChild(IComponent file);

    void removeChild(IComponent file);

    IComponent getChild(int index);
}
