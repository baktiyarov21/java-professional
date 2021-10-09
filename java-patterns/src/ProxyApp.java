public class ProxyApp {
    public static void main(String[] args) {
        Project project = new ProxyProject("yuio");
        project.run();
    }
}

abstract class Project {
    abstract void run();
}

class ProxyProject extends Project {
    String url;
    RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
        }

        realProject.run();
    }
}

class RealProject extends Project {

    String url;


    public RealProject(String url) {
        this.url = url;
        load();
    }

    void load() {
        System.out.println("Project is loading...");
    }

    @Override
    void run() {
        System.out.println("Project is running...");
    }
}
