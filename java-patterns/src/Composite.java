import java.util.ArrayList;
import java.util.List;

// Компановщик
public class Composite implements Figure {
    private List<Figure> components = new ArrayList<>();

    public void addComponent(Figure f) {
        components.add(f);
    }

    public void removeComponent(Figure f) {
        components.remove(f);
    }

    @Override
    public void draw() {
        for (Figure component : components) {
            component.draw();
        }
    }
}

class CompositeApp {
    public static void main(String[] args) {
        SquareComposite squareComposite = new SquareComposite();
        TriangleComposite triangleComposite = new TriangleComposite();
        SquareComposite squareComposite1 = new SquareComposite();
        TriangleComposite triangleComposite1 = new TriangleComposite();
        SquareComposite squareComposite2 = new SquareComposite();
        TriangleComposite triangleComposite2 = new TriangleComposite();
        Composite composite = new Composite();
        composite.addComponent(squareComposite);
        composite.addComponent(triangleComposite);
        composite.addComponent(squareComposite1);
        composite.addComponent(triangleComposite2);
        composite.addComponent(squareComposite2);
        composite.addComponent(triangleComposite1);
        composite.draw();
    }
}

interface Figure {
    void draw();
}

class SquareComposite implements Figure {
    @Override
    public void draw() {
        System.out.println("Квадрат");
    }
}

class TriangleComposite implements Figure {
    @Override
    public void draw() {
        System.out.println("Треугольник");
    }
}
