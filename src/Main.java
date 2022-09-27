import java.util.Arrays;

public class Main {
    public static void printSeparator() {
        System.out.println("************");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        int[] issuesByMonth = {4,6,7,9,2,5,12,3,7,10,6,7,1,8};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i+1)%3==0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        printIssues(total);

        int a = 1;
        int[] arr = {1, 2, 3};
        changeValues(a,arr);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }
    public static void changeValues(int a, int[]arr2){
        a = 5;
        arr2[0] = 5;
    }

}