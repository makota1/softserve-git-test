import java.util.ArrayList;
import java.util.List;

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
        List<String> list = new ArrayList<>();
        list.add("string one");
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
