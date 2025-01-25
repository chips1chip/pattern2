public class Pattern2 {
    public static void main(String[] args) {
        int[][] a=new int[5][5];
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                if(j%2==1){
                    System.out.print("# ");
                }
                else if(i%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}