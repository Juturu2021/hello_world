import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
