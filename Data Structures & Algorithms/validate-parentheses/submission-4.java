class Solution {
    public boolean isValid(String s) {
       
        Stack<Character> stack=new Stack<>();
        int i=0;
        int n=s.length();
        while(i<n)
        {
            char ch=s.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='[')
            {
                stack.add(ch);
            }
            else
            {
                  char temp=openingBracket(ch);
                  if(stack.isEmpty())
                  {
                    return false;
                  }
                  else if(!stack.isEmpty() && stack.peek()!=temp)
                  {
                    return false;
                  }
                  else
                  {
                    stack.pop();
                  }
            }
            i++;
        }
        if(stack.isEmpty())
        {
        return true;
        }
        else
        {
            return false;
        }
    }
    public char openingBracket(char ch)
    {
        char ans='a';
        switch(ch)
        {
            case ')':
            ans='(';
            break;

            case '}':
            ans='{';
            break;

            case ']':
            ans='[';
            break;
        }
        return ans;
    }
}
