class task01 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Hello git");
        System.out.println("Hello I'm mikiyur :)");
        System.out.println("Hello I'm " + getCastenNick());
    }

    public static String getNickName() {
        return "makota";
    }

    public static String getCastenNick() {
        return "Casten";
    }
}
