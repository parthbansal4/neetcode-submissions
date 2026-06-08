class Solution {
    public int[] plusOne(int[] digits) {
            int n=digits.length-1;
            if(digits[n]<9){
                digits[n]+=1;
                return digits;
            }else{

                int carry=1;
                digits[n]=0;
                for(int i=n-1;i>=0;i--){
                    if(digits[i]<9){
                        carry=0;
                        digits[i]+=1;
                        return digits;
                    }else{
                        digits[i]=0;
                        carry=1;
                    }
                }
                if(carry==1){
                    int[] ans = new int[n+2];
                    ans[0] = carry;
                    for(int i=1;i<n+1;i++){
                        ans[i]=digits[i-1];
                    }
                    return ans;
                }

            }

            return digits;
    }
}
