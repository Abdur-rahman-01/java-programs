public class linearsearch {
    public static void main(String[] args) {
        int[]arr={4,2,5,67,4,3,8};
        int key=4;
        int i;
        boolean found=false;
         
        for(i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("element found");
                found=true;
                break;
            }
        }
            if(!found){
               System.out.println("element not found");
            }
        }
    }

