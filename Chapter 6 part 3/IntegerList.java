// ****************************************************************

// IntegerList.java

//

// Define an IntegerList class with methods to create, fill,

// sort, and search in a list of integers.

//          

// ****************************************************************


import java.util.Scanner;


public class IntegerList{


    int[] list; //values in the list
    int[] list1;
    Scanner scan = new Scanner(System.in);


    
    //-------------------------------------------------------

    //create a list of the given size

    //-------------------------------------------------------

    public IntegerList(int size)

    {

        list = new int[size];

    }  



    //-------------------------------------------------------

    //fill array with integers between 1 and 100, inclusive

    //----------------------------------------------------
    
    public void increase(int increase) {
        list1 = new int[list.length + increase];
        for(int i = 0; i < list.length; i++) {
            list1[i] = list[i];
        }
        list = list1;
    }
    
    public void addElement(int newVal) {
        if(search(0) == -1) {
            increase(1);
        }
        
        int loc = search(0);
        list[loc] = newVal;
    }
    
    public void removeElement(int value) {
        if(search(value) == 1) {
            list1 = new int[list.length - 1];
            for(int i = 0; i < list.length; i++) {
                if(list[i] == value) {
                    break;
                } else {
                    list[i] = list1[i];
                }
            }
        }
        list = list1;
    }
    
    public void randomize()

    {

        for (int i=0; i<list.length; i++)

            list[i] = (int)(Math.random() * 100) + 1;

    }


    //-------------------------------------------------------

    //print array elements with indices

    //-------------------------------------------------------

    public void print()

    {

        for (int i=0; i<list.length; i++)

            System.out.println(i + ":\t" + list[i]);

    }


    //-------------------------------------------------------

    //return the index of the first occurrence of target in the list.

    //return -1 if target does not appear in the list

    //-------------------------------------------------------

    public int search(int target)

    {

        int location = -1;

        for (int i=0; i<list.length && location == -1; i++)

            if (list[i] == target)

                location = i;

        return location;

    }


    //-------------------------------------------------------

    //sort the list into ascending order using the selection sort algorithm

    //-------------------------------------------------------

    public void selectionSort()

    {

        int minIndex;

        for (int i=0; i < list.length-1; i++)

            {

                //find smallest element in list starting at location i

                minIndex = i;

                for (int j = i+1; j < list.length; j++)

                    if (list[j] < list[minIndex])

                            minIndex = j;


                //swap list[i] with smallest element

                int temp = list[i];

                list[i] = list[minIndex];

                list[minIndex] = temp;

            }

    }

}