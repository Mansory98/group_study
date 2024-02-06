 //1-1 문자열 출력하기
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



// 1-2 a와 b 출력하기

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


// 1-3 문자열 반복해서 출력하기 
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



//1-4 대소문자 바꿔서 출력하기
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


//1-5 특수문자 출력하기
/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print ("!@#$%^&*(\\'\"<>?:;" );
    }
}*/

////////////////////////////////////////////////////////////////////////////////

//2-1 덧셈식 출력하기
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



//2-2  문자열 붙여서 출력하기
/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.println (a+b);
    }
}*/

//2-3 문자열 돌리기 

/*
 
  */


//2-4 홀짝 구분하기 
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


//문자열 겹쳐쓰기 

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


