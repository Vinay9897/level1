package backtracking;
import java.util.*;
public class Combinations {
    static List<List<Integer>> res = new ArrayList<List<Integer>>();
    static List<Integer> ans=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of submatrix length: ");
        int k = sc.nextInt();
        System.out.println("Enter the range of the array :");
        int n= sc.nextInt();
        combine(k,1,n);
        System.out.println(res);
    }

    private static void combine(int k,int start,int n){
        if(k==0)
        {
            res.add(new ArrayList<Integer>(ans));
            return ;
        }
        for(int i = start;i<=n;i++)
        {
            ans.add(i);
            combine(k-1,i+1,n);
            ans.remove(ans.size()-1);
        }
    }
    
}
