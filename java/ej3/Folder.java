package ej3;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IComponent {

    private List<IComponent> files = new ArrayList<>();

    @Override
    public int getNumberOfWords() {
        int n = 0;
        for (IComponent i : files) {
            n += i.getNumberOfWords();
        }
        return n;
    }

    @Override
    public void addChild(IComponent file) {
        files.add(file);
    }

    @Override
    public void removeChild(IComponent file) {
        files.remove(file);
    }

    @Override
    public IComponent getChild(int index) {
        return files.get(index);
    }
}
