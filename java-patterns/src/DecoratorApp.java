public class DecoratorApp {
    public static void main(String[] args) {
        Developer developer = new SeniorDeveloper(new JavaDeveloper());
        System.out.println(developer.makeJob());
    }


}


interface Developer {
    String makeJob();
}

class JavaDeveloper implements Developer {

    @Override
    public String makeJob() {
        return "Writing java code";
    }
}

class DeveloperDecorator implements Developer {

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}

class SeniorDeveloper extends DeveloperDecorator {

    public SeniorDeveloper(Developer developer) {
        super(developer);
    }


    public String doCodeReview() {
        return " and do code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + doCodeReview();
    }
}