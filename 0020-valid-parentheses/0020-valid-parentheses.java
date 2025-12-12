class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{                                 //optimal , bruteforce down
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if((s.charAt(i)==')' && top!='(') ||
                (s.charAt(i)=='}' && top!='{')||
                (s.charAt(i)==']' && top!='[')){
                return false; 
                }               
            }
        }
        return(st.isEmpty());
    }
}
// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack1 = new Stack<>(); // brute force
//         for(int i=0;i<s.length();i++){
//             char c= s.charAt(i);
//             if(c=='(' || c=='['|| c=='{'){
//                 stack1.push(c);
//                 continue;
//             }
//             if(stack1.isEmpty()){
//                 return false;
//             }
//             char top = stack1.peek();
//             if(s.charAt(i)==')' && stack1.peek()=='('){
//                 stack1.pop();
//             }else if(s.charAt(i)=='}' && stack1.peek()=='{'){
//                 stack1.pop();
//             }else if(s.charAt(i)==']' && stack1.peek()=='['){
//                 stack1.pop( );
//             }else{
//                 return false;
//             }
            
//         }
//         return stack1.isEmpty();
//     }
// }