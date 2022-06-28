package ej3;

public class File implements IComponent{

    private int numberOfWords;

    public File(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    @Override
    public int getNumberOfWords() {
        return numberOfWords;
    }

    @Override
    public void addChild(IComponent file) {

    }

    @Override
    public void removeChild(IComponent file) {

    }

    @Override
    public IComponent getChild(int index) {
        return null;
    }
}
