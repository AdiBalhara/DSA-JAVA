import java.util.*;

public class Infix_Expression{
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String exp=br.readLine();
        Stack<Integer> st1= new Stack<>();
        Stack<Integer> st2= new Stack<>();
        for(int i=0; i<exp.length(); i++){
            char ch=exp.charAt(i);
            if(ch>='0' && ch<='9'){
                st1.push(ch-'0');
            }
            else if(ch=='('){
                st1.push();
            }
            else if (ch=='+'|| ch=='-'||ch=='/'||ch=='*'){
                while(st2.size()>0 && precedence(st2.peek())>precedence(ch)){
                    char operator=st2.pop();
                    int op2=st2.pop();
                    int op1=st2.pop();
                    int result=solve(op2, op1, operator);
                    st1.push(result);
                }
                st2.push(ch);
            }
            else if (ch==')') {
                while(ch!='('){
                    char operator=st2.pop();
                    int op2=st2.pop();
                    int op1=st2.pop();
                    int result=solve(op2, op1, operator);
                    st1.push(result);
                }
                st2.pop();
            }
            else {
                //do nothing
            }
            while(st2.size()!=0){
                    char operator=st2.pop();
                    int op2=st2.pop();
                    int op1=st2.pop();
                    int result=solve(op2, op1, operator);
                    st1.push(result);
            }
            System.out.println(st1.peek());
        }

    }
    public static int precedence(char ch){
        if(ch=='/' && ch=='*'){
            return 2;
        }
        else if (ch=='+' && ch=='-') {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int solve(int op2, int op1, char operator){
        if(operator=='+'){
            return op2+op1;
        }
        else if(operator=='*'){
            return op2*op1;
        }
        else if(operator=='-'){
            return op2-op1;
        }
        else{
            return op2/op1;
        }
    }
}