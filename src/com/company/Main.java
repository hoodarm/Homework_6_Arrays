package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] given = {4, -3, -5, 9, 1, 11};
        String smaller = "";
        String larger = "";
        int m = 1;
        for (int element : given)
        {
            if (element < m)
            {
                String number = Integer.toString(element);
                smaller = smaller + number + " ";
            }
            else if (element > m)
            {
                String number = Integer.toString(element);
                larger = larger + number + " ";
            }
        }
        System.out.println("smaller: " + smaller);
        System.out.println("larger: " + larger);
    }
}
