
import java.util.ArrayList;
import java.util.List;
public class Main {
    /**
     * Test that DataTypes.sum returns the correct value for
     * the sum from 1 to 1 million.
     */
    public static void main(String[] args) {

        // You put an L at the end to indicate it is a long.
        // try removing the L and you'll see that you get an error
        // saying "Integer number too large".
        // Note: You can use _ to help make it easier to
        //       read large numbers, as is done below.
        long x = 500_000_500_000L;
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= 1_000_000; i++) {
            lst.add(i);
        }
        if (x == DataTypes.sum(lst)){
            System.out.println("Test success.");
        }
        else{
            System.out.println("Test failed.");
        }
    }
}


