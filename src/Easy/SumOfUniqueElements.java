package Easy;

public class SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {

        int list[] =  new int[101];

        for(int i = 0;i < nums.length; i++)
            list[nums[i]]++;

        int sum = 0;
        for(int i = 1; i < 101; i++){
            if(list[i] == 1)
                sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfUniqueElements s = new SumOfUniqueElements();
        System.out.println(s.sumOfUnique(new int[]{1,1,1,1,1}));
    }

}
