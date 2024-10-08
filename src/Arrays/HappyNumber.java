    package Arrays;

    import java.util.HashSet;
    import java.util.Set;

    public class HappyNumber {
        public static void main(String[] args)
        {
            int n=2;
            System.out.println(isHappy(n));
        }

        static public boolean isHappy(int n) {
            Set<Integer> ans=new HashSet<>();
            while (true)
            {
                int sum=0;
                while (n!=0)
                {
                    int rem=n%10;
                    n=n/10;
                    sum+=(rem*rem);
                }
                if(sum==1) return true;

                n=sum;
                if(ans.contains(n))

                    return false;

                ans.add(n);



            }
        }
    }
