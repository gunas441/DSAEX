import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] arr = {1,2,3,4,5,1,2};

//        apearing(number,arr);
//        hashmat();
        charHas();
    }

    public static void charHas(){
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;
        }

        int q;
        q=sc.nextInt();
        while (q-- > 0){
            char c;
            c = sc.next().charAt(0);
            //fetching
            System.out.println(hash[c-'a']);
        }
    }

    public static void hashmat(){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Pre compute
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        int q;
        q=sc.nextInt();
        while (q--!=0){
            int number;
            number = sc.nextInt();
            // fetching
            System.out.println(hash[number]);
        }
    }

    public static int apearing(int num,int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
