
import java.util.*;

public class SimonMathScratch {

    public static void main(String[] args) {
        int counter = 1;
        int arnNum[] = new int[1000];
        int nAns;
        Scanner sin = new Scanner(System.in);
        System.out.println("Simon Game");
        for (int i = 0; i < counter; i++) {

            arnNum[i] = (int) (Math.random() * 4) + 1;
            System.out.println(arnNum[i]);
            nAns = sin.nextInt();
            
            if (nAns == arnNum[i]) {
                counter++;
            }
        }
    }
}
