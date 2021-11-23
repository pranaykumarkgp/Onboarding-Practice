import java.util.stream.IntStream;

class Practice{
    public static void main(String[] args) {
        //Find sum of integers from 1-50

        //Before
        int total = 0;
        for (int i=0;i<=50;i++){
            total += i;
        }
        System.out.println("Total = "+ total);


        //After
        int newTotal = IntStream.range(0, 51).sum();
        System.out.println("Total in java8 = "+newTotal);
        

    }
}