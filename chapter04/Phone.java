package chapter04;

class Phone {
    private final String name;
    private final String tel;

    Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}