import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("leathe","brok","mariene","brok");

        //Find unique values

        //Before
        List<String> unique = new ArrayList<>();
        for (String string : names) {
            if(!unique.contains(string)){
                unique.add(string);
            }
        }
        System.out.println("Unique List : " + unique);

        //After
        List<String> newUnique =names.stream().
            distinct().
            collect(Collectors.toList());
        System.out.println("Unique List in java8 : " + newUnique);
        
    }
}
