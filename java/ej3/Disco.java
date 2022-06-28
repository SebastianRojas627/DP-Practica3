package ej3;

import java.util.ArrayList;
import java.util.List;

public class Disco implements IComponent{

    private List<IComponent> folders = new ArrayList<>();

    @Override
    public int getNumberOfWords() {
        int f = 0;
        for (IComponent folder: folders){
            f += folder.getNumberOfWords();
        }
        return f;
    }

    @Override
    public void addChild(IComponent file) {
        folders.add(file);
    }

    @Override
    public void removeChild(IComponent file) {
        folders.remove(file);
    }

    @Override
    public IComponent getChild(int index) {
        return folders.get(index);
    }
}