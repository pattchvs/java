package dadossistema;
import java.util.*;
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale lang = Locale.getDefault();
        System.out.println("A linguagem atual do sistema é: ");
        System.out.println(lang.getDisplayLanguage().toString());
    }
}
