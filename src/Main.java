public class Main {
    public static void main(String[] args) {
        //1 Задача
        //Задание 1
        int[] task11 = new int[] {1,2,3};
        //Задание 2
        double[] task12 = {1.57, 7.654, 9.986};
        //Задание 3
        double[] task13 = new double[]{1,2,3,4.6666,9,10.312312,11.666};
        //2 Задача
        System.out.println("2 Задача");
        for(int i = 0;i < task11.length;i++){
            if(i != (task11.length - 1)){
                System.out.print(task11[i]+", ");
            }
            else{
                System.out.print(task11[i]+" ");
            }
        }
        System.out.println();
        for(int i = 0;i < task12.length;i++){
            if(i != (task12.length - 1)){
                System.out.print(task12[i]+", ");
            }
            else{
                System.out.print(task12[i]+" ");
            }
        }
        System.out.println();
        for(int i = 0;i < task13.length;i++){
            if(i != (task13.length - 1)){
                System.out.print(task13[i]+", ");
            }
            else{
                System.out.print(task13[i]+" ");
            }
        }
        //3 задача
        System.out.println("\n3 Задача");
        for(int i = (task11.length - 1);i >= 0;i--){
            if(i != 0){
                System.out.print(task11[i]+", ");
            }
            else{
                System.out.print(task11[i]+" ");
            }
        }
        System.out.println();
        for(int i = (task12.length - 1);i >= 0;i--){
            if(i != 0){
                System.out.print(task12[i]+", ");
            }
            else{
                System.out.print(task12[i]+" ");
            }
        }
        System.out.println();
        for(int i = (task13.length - 1);i >= 0;i--){
            if(i != 0){
                System.out.print(task13[i]+", ");
            }
            else{
                System.out.print(task13[i]+" ");
            }
        }
        //4 задача
        System.out.println("\n4 Задача");
        for (int i = 0; i < task11.length; i++){
            if(task11[i]%2 != 0){
                task11[i]+=1;
            }
            if(i != (task11.length - 1)){
                System.out.print(task11[i]+", ");
            }
            else{
                System.out.print(task11[i]+" ");
            }
        }
    }
}