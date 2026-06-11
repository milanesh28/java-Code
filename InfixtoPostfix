package placement;
 
class Stacki{
    int top=-1;
    char arr[]=new char[20];
    public void push(char data){
        arr[++top]=data;
    }
    public char pop(){
        char temp=arr[top--];
        return temp;
    }
    public char peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    } 
}

public class InfixtoPostfix
{
    public static int precedence(char c){
        if(c=='+'||c=='-')
             return 1;
        else if(c=='*'||c=='/')
             return 2;
        else if(c=='^')
             return 3;
        return -1;
    }
	public static void main(String[] args) {
		String infix="a-b/c+(d-a*c+f)";
		String postfix="";
		Stacki st=new Stacki();
		for(int i=0;i<infix.length();i++){
		    char ch=infix.charAt(i);
		    
		    if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }

		    else if(ch=='(')
		        st.push(ch);
		    else if(ch==')'){
		        while(st.peek()!='(' && !st.isEmpty() )
		            postfix+=st.pop();
		        st.pop();
		    }
		    else{
		        while(!st.isEmpty() && precedence(ch)<=precedence(st.peek())){
		            postfix+=st.pop();
		        }
		        st.push(ch);
		    }
		}
		while(!st.isEmpty())
		    postfix+=st.pop();
		System.out.println(postfix);
	}
}
