package xml.parsing.with_object;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String title;
    private List<Ingridient> ingridients;

    public Sandwich() {
        ingridients = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Ingridient> getIngridients() {
        return ingridients;
    }

    public void addIngridients(Ingridient ingridient) {
        ingridients.add(ingridient);
    }
}
