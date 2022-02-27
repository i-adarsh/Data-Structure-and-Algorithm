public class AddBinary{
    public String addBinary(String str1, String str2) {

        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = carry;

            sum += (i >= 0) ? str1.charAt(i) - '0' : 0;
            sum += (j >= 0) ? str2.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        if (carry != 0)
            ans.append(carry);
        return ans.reverse().toString();
    }
    
    public static void main(String [] args){
        String a = "1111";
        String b = "111";
        long alen = a.length();
        long blen = b.length();
        int count = 0;
        while((al > 0 && bl > 0)) {
			int d1 = Integer.parseInt(String.valueOf(a.charAt(al - 1)));
			int d2 = Integer.parseInt(String.valueOf(b.charAt(bl - 1)));
			sum = (d1 + d2 + carry)%2;
			String s = "";
			s += sum;
			res = s + res;
			carry = (d1 + d2 + carry)/2;
			al--; bl--;
		}
		while(al > 0) {
			int d1 = Integer.parseInt(String.valueOf(a.charAt(al - 1)));
			sum = (d1 + carry)%2;
			String s = "";
			s += sum;
			res = s + res;
			carry = (d1 + carry)/2;
			al--;
		}
		while(bl > 0) {
			int d2 = Integer.parseInt(String.valueOf(b.charAt(bl - 1)));
			sum = (d2 + carry)%2;
			String s = "";
			s += sum;
			res = s + res;
			carry = (d2 + carry)/2;
			bl--;
		}
		if (carry > 0) {
			res = "1" + res;
		}
		System.out.println(res);
        System.out.println("Hello");
    }
}