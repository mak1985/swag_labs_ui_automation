package day06;

public class SingleArray {
    public static void main(String[] args) {

        //Declare and initialization/instantiation
        int[] emp_sal = new int[6];
        int emp_sal1[] = new int[5];


        //insert value in an array
        emp_sal[0] = 50000; //1st element at 0th position
        emp_sal[1] = 60000; //2nd element at 1th position
        emp_sal[2] = 60000; //3rd element at 2th position
        emp_sal[3] = 99000; //4th element at 3rd position
        emp_sal[4] = 60000; //5th element at 4th position
        emp_sal[5] = 60000; //Trying ti insert 6th record Exception - ArrayIndexOutOfBoundsException

        //print size of an array
        System.out.println("Size of an array: " + emp_sal.length); //6

        //read any specific value from an array
        System.out.println("Value of 4th element :" + emp_sal[3]);

        //Read all the values present in an array
        for (int i = 0; i < emp_sal.length; i++) {
            System.out.println("Using for loop :" + emp_sal[i]);
        }

        //For each loop(Enhanced loop - specially use for an array)
        for (int i : emp_sal) {
            System.out.println("Using each for/Enhanced loop :" + i);
        }

    }
}
