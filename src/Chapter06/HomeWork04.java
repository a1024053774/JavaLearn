package Chapter06;

public class HomeWork04 {
    //编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样

    public static void main(String[] args) {
        A03 a03 = new A03();
        int array_insert[] = {1,2,3,4,5};
        int[] arrayNew = a03.copyArr(array_insert);
        System.out.println("↓↓↓↓↓↓旧数组是↓↓↓↓↓↓");
        for (int i = 0;i < array_insert.length;i++){
            System.out.print(array_insert[i] + " ");
        }
        System.out.println();
        System.out.println("↓↓↓↓↓↓新数组是↓↓↓↓↓↓");
        for (int i = 0;i < arrayNew.length;i++){
            System.out.print(arrayNew[i] + " ");
        }


    }
}

class A03{
    public int[] copyArr(int array[]){
        int array_new[] = new int[array.length];
        for (int i = 0; i < array.length; i++){
            array_new[i] = array[i];
        }
        return array_new;
    }

}
