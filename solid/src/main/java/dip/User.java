package dip;

public class User {
    private int id;
    private String uderName;
    private String pswd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUderName() {
        return uderName;
    }

    public void setUderName(String uderName) {
        this.uderName = uderName;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uderName='" + uderName + '\'' +
                ", pswd='" + pswd + '\'' +
                '}';
    }
}
