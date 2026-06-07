// Problem Description
// Given two binary strings A and B. Return their sum (also a binary string).

// Problem Constraints
// 1 <= length of A <= 105
// 1 <= length of B <= 105
// A and B are binary strings

// Input Format
// The two argument A and B are binary strings.

// Output Format
// Return a binary string denoting the sum of A and B

// Example Input
// Input 1:
// A = "100"
// B = "11"

// Input 2:
// A = "110"
// B = "10"

// Example Output
// Output 1:
// "111"

// Output 2:
// "1000"

// Example Explanation
// For Input 1:
// The sum of 100 and 11 is 111.

// For Input 2:
// The sum of 110 and 10 is 1000.

package Intermediate_DSA2.Strings.Java;

public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        StringBuilder res = new StringBuilder();

        int i=A.length()-1;
        int j=B.length()-1;
        int sum=0;
        int carry=0;

        while(i>=0 || j>=0){
            sum = carry;                                //initialize with carry to add carry in next iteration
            if(i>=0){
                sum = sum + A.charAt(i) - '0';          //add i'th place's digit to sum until length is over
            }
            if(j>=0){
                sum = sum + B.charAt(j) - '0';          //add j'th place's sum until its length =0
            }

            res.append(sum % 2);                        // append sum%2 E.g. 1%2=1 || 0%2==0 || *imp* 2%2=0
            carry = sum/2;                              // and carry if sum = 1+1 =2 i.e carry = 2/2=1
            i--;
            j--;
        }

        if(carry!=0){                                   //after last digit if carry is there then append it.
            res.append(1);
        }

        StringBuilder res2 = new StringBuilder();

        for(int k=res.length()-1;k>=0;k--){             //reverse because we appended in reverse order;
            res2.append(res.charAt(k));
        }

        return res2.toString();
    }

    public static void main(String[] args) {
        String A = "100";
        String B = "11";

        AddBinaryStrings obj = new AddBinaryStrings();
        String result = obj.addBinary(A, B);
        System.out.println(result);
    }
}
