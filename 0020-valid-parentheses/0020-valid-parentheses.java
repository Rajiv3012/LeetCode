class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='(' || c=='['|| c=='{'){
                stack1.push(c);
                continue;
            }
            if(stack1.isEmpty()){
                return false;
            }
            char top = stack1.peek();
            if(s.charAt(i)==')' && stack1.peek()=='('){
                stack1.pop();
            }else if(s.charAt(i)=='}' && stack1.peek()=='{'){
                stack1.pop();
            }else if(s.charAt(i)==']' && stack1.peek()=='['){
                stack1.pop( );
            }else{
                return false;
            }
            
        }
        return stack1.isEmpty();
    }
}