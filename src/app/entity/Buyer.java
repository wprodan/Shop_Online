package app.entity;

public class Buyer {

    private final String name;
    private final String phone;
    private final String adress;

    public Buyer (String name, String phone, String adress){
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }
}
