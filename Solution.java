 //1-1 ���ڿ� ����ϱ�
/* 
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        System.out.println(a);
        
    }
}
*/



// 1-2 a�� b ����ϱ�

/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
                System.out.println("b = " + b);
    }
}*/


// 1-3 ���ڿ� �ݺ��ؼ� ����ϱ� 
/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for (int i=0; i<n; i++)
            System.out.print(str);
    }
}*/



//1-4 ��ҹ��� �ٲ㼭 ����ϱ�
/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        
        for (int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            
            if(Character. isLowerCase(c)) {
                result += Character.toUpperCase(c);
            }  else 
            
            {
            result += Character.toLowerCase(c);
            }
        }
             System.out.print(result);
    }
}*/


//1-5 Ư������ ����ϱ�
/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print ("!@#$%^&*(\\'\"<>?:;" );
    }
}*/

////////////////////////////////////////////////////////////////////////////////

//2-1 ������ ����ϱ�
/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a + b);

        System.out.println(a + " + " + b + " = " + c);
    }
}  */



//2-2  ���ڿ� �ٿ��� ����ϱ�
/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.println (a+b);
    }
}*/

//2-3 ���ڿ� ������ 

/*
 
  */


//2-4 Ȧ¦ �����ϱ� 
/*
 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n%2==0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}    */


//���ڿ� ���ľ��� 

/*
 
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<s; i++){
            answer += my_string.charAt(i);
        }
          int a = 0;
        while(a<overwrite_string.length()){
            answer += overwrite_string.charAt(a);
            a++;
        }
          int b = a+s;
        while(b<my_string.length()){
            answer += my_string.charAt(b);
            b++;
        }
        return answer;
    }
}
*/


