package com.hva.learning;

public class Fib_recursion{
    
        public int fibonacci1(int n)
        {
            if(n==0)
            {
                return 0;
            }
            else if(n==1)
            {
                return 1;
            }
            else
            {
                return fibonacci1(n-1)+fibonacci1(n-1);
            }
        }
    
    public int[] fibonacci(int n)
    {
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=fibonacci1(i);
        }
        return arr;
    }
}