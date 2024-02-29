public class ThreeNotTwo {
    public int n;
    public int count;
    public int num;


    public ThreeNotTwo(int n){
        this.n = n;
        this.count = 0;
        this.num = 1;
    }
    public void three(){
        while(count < n){
            if (num % 3 == 0 && num % 2 != 0){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
