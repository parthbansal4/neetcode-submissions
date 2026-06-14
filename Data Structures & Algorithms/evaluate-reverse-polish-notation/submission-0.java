class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String s:tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                stack.push(Integer.valueOf(s));
            }else{
                int v1= stack.pop();
                int v2 = stack.pop();                
                if(s.equals("+")){
                    stack.push(v1+v2);
                }else if(s.equals("-")){
                    stack.push(v2-v1);
                }else if(s.equals("*")){
                    stack.push(v1*v2);
                }else{
                    stack.push(v2/v1);
                }
            }
        }
        return stack.peek();
    }
}
