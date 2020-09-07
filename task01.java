class task01 {
    private ArayList<String> groupNick;
    private String nick;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public static void main(String[] args) {
        System.out.println("Hello git");
        System.out.println("Hello I'm mikiyur :)");
        System.out.println("Hello I'm " + getCastenNick());
    }

    public String getNick15(){
        return "olexandr256";
    }
    public static String getNickName2() {
        return "user unknown";
    }

    public static String getCastenNick() {
        return "Casten";
    }
}
