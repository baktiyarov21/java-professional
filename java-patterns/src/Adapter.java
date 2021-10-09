public class Adapter {
    public static void main(String[] args) {
        // 1-й способ через наследование
        VectorGraphics vectorGraphics = new VectorGraphicsFromRaster();
        vectorGraphics.drawLine();
        vectorGraphics.drawSquare();
        System.out.println();
        // 2-й способ через композицию
        VectorGraphics vectorGraphics1 = new VectorGraphicsFromRaster2();
        vectorGraphics1.drawSquare();
        vectorGraphics1.drawLine();
    }
}

interface VectorGraphics {
    void drawLine();
    void drawSquare();
}

class RasterGraphics {
    void drawRasterLine() {
        System.out.println("Рисуем линию");
    }
    void drawRasterSquare() {
        System.out.println("Рисуем квадрат");
    }
}

class VectorGraphicsFromRaster extends RasterGraphics implements VectorGraphics {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

class VectorGraphicsFromRaster2 implements VectorGraphics {
    RasterGraphics rasterGraphics = new RasterGraphics();

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }
}