package Chapter06;

public class MethodExercise02 {
    public static void main(String[] args) {
        MyTools2 myTools2 = new MyTools2();
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        myTools2.printArray(array);

    }
}

class MyTools2{
    public void printArray(int array[][]){
        for (int i = 0;i < array.length;i++){
            for(int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}
