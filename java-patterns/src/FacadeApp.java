// Фасад
public class FacadeApp {
    public static void main(String[] args) {
//        Power power = new Power();
//        power.on();
//
//        DVDRom dvdRom = new DVDRom();
//        dvdRom.load();
//
//        HDD hdd = new HDD();
//        hdd.copyFromDVD(dvdRom);

        Computer computer = new Computer();
        computer.copy();

    }
}

class Computer {
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
    }
}

class Power {
    void on() {
        System.out.println("Включение питания");
    }

    void off() {
        System.out.println("Выключение питания");
    }
}

class DVDRom {
    private boolean data = false;

    public boolean isData() {
        return data;
    }

    void load() {
        data = true;
    }

    void upload() {
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDRom dvdRom) {
        if (dvdRom.isData()) {
            System.out.println("Происходит копирование данных с диска");
        } else {
            System.out.println("Вставьте диск с данными");
        }
    }
}