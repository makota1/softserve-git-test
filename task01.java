class task01 {
    private group;
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

    public String getNickName(){
        return "makota";
    }
    public static String getNickName2() {
        return "mikiyur";
    }
    public String getNickName3 (){
        return "olexandr256";
    }

    public static String getCastenNick() {
        return "Casten";
    }
}
