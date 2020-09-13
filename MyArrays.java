
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyArrays;

import java.util.Arrays;
/**
 *
 * @author Valentina
 */
public class MyArrays {

    /**
     * @param args the command line arguments
     */
    static public void f1(int[] array)
    {
        for(int i = 0; i< array.length; i++)
            array[i] = (array[i] + 1) % 2;
    }
    
    static public void f2(int[] array)
    {
        for(int i = 0; i< array.length; i++)
            array[i] = i*3 + 1;
    }
    
    static public void f3(int[] array)
    {
        for(int i = 0; i< array.length; i++)
            if(array[i] < 6)
                array[i] *= 2;
    }
    
    static public int f4Min(int[] array)
    {
        if(array.length == 0)
            return 0;
        int min = array[0];
        for(int i = 1; i< array.length; i++)
            if(array[i] < min)
                min = array[i];
        return min;
    }
    
    static public int f4Max(int[] array)
    {
        if(array.length == 0)
            return 0;
        int max = array[0];
        for(int i = 1; i< array.length; i++)
            if(array[i] > max)
                max = array[i];
        return max;
    }
    
    static public void f5(int[][] array)
    {
        for(int i = 0; i < array.length; i++)
            array[i][i] = 1;
    }
    
    static public boolean f6(int[] array)
    {
        int sum = 0;
        
        for(int i = 0; i < array.length; i++)
            sum += array[i];
        int sum1 = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum1 += array[i];
            sum -= array[i];
            if(sum1 == sum)
            {
                //System.out.println("Индекс: " + i); // для проверки
                return true;
            }
        }
        return false;
    }
    
    static public void f8(int[] array, int N)
    {
        int temp;
        for(int j = 0; j < Math.abs(N); j++)
            for(int i = 0; i < array.length - 1; i++)
            {
                int index;
                if(N > 0)
                    index = array.length - i - 1;
                else
                    index = i;
                
                temp = array[index];
                array[index] = array[(index + 1) % array.length];
                array[(index + 1) % array.length] = temp;
                
            }
            
    }
    
    static public int[] f7(int[] array, int N)
    {
        int[] result = new int[array.length];
        for(int i = 0; i < array.length; i++)
            result[(i + N + array.length) % array.length] = array[i];
        return result;
            
        
            
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a1[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        f1(a1);
        System.out.println("Выходной массив 1: " + Arrays.toString(a1));
        int a2[] = new int[8];
        f2(a2);
        System.out.println("Выходной массив 2: " + Arrays.toString(a2));
        int a3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        f3(a3);
        System.out.println("Выходной массив 3: " + Arrays.toString(a3));
        System.out.println("Минимум: " + f4Min(a3));
        System.out.println("максимум: " + f4Max(a3));
        
        int a5[][] = new int[10][10];
        f5(a5);
        System.out.println("Выходной массив 5: " + Arrays.deepToString(a5));
        
        System.out.println("Результат 6: " + f6(a3));
        
        System.out.println("Результат 7: " + Arrays.toString(f7(a3, -3)));
        f8(a3, -3);
        System.out.println("Результат 8: " + Arrays.toString(a3));
    }
    
}
