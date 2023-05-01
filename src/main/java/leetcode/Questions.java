package leetcode;

public class Questions {
    public static void main(String[] args) {
        Questions questions =new Questions();
        int []arr ={22,19,18,15,3,14,4,24};

    for(int i=1 ;i < arr.length;i++){
        int j =i;
     while(j>0) {
         int parentLoc= (j-1)/2;
         int parent = arr[parentLoc];
         if (arr[j] > parent) {
             int temp = arr[parentLoc];
             arr[parentLoc] = arr[j];
             arr[j] = temp;
         }
         j=parentLoc;
     }
    }

for(int i: arr){
    System.out.println(i);
}


     }

}
