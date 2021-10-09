
//Делегат
public class DelegateApp {
    public static void main(String[] args) {
//        Painter painter = new Painter();
//        painter.setGraphics(new Triangle());
//        painter.draw();
        Developer2 developer = new Developer2();
        developer.setLanguage(new Java());
        developer.writeCode();
    }

}

class A {
    public void f() {
        System.out.println("f()");
    }
}

class B {
    A a = new A();
    void f() {
        a.f();
    }
}

interface Graphics {
    void draw();
}

class Triangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Рисуем треугольник");
    }
}

class Square implements Graphics {
    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
    }
}


class Painter {
    Graphics graphics;

    void setGraphics(Graphics g) { // метод мутатор
        graphics = g;
    }

    void draw() {
        graphics.draw();
    }
}

interface Language {
    void writeCode();
}

class Java implements Language {
    @Override
    public void writeCode() {
        System.out.println("Язык программирования Java");
    }
}

class CSharp implements Language {
    @Override
    public void writeCode() {
        System.out.println("Язык программирования C#");
    }
}

class Developer2 {
    Language language;

    void setLanguage(Language l) {
        language = l;
    }

    void writeCode() {
        language.writeCode();
    }

}