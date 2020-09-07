import java.util.ArrayList;
import java.util.List;

class task01 {

    private String group;

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
    /*
    public static String getNickName2() {
        return "error 404";
    }
*/
    public static String getNickName2() {
        return "MIKIYUR!!!";
    }
    public static String getCastenNick() {
        return "Casten";
    }
    
    public static String getNickName3() {
    	return "airetOK";
    }

    // you gonna be fired for writing junk code :)
    // Yes, I am!!
}
