public class Duplicatevalue{
    public static void main(String[] args) {

        String[] arr1 = {"shubham", "dkte", "rain", "cricket"};
        String[] arr2 = {"rain", "ichlakaranji", "swift","cricket"};

        System.out.println("these are Duplicate values:");

        for (int i = 0; i < arr1.length; i++) 
            {
                for (int j = 0; j < arr2.length; j++) 
                {
                    if (arr1[i].equals(arr2[j])) 
                    {
                        System.out.println(arr1[i]);
                        break; 
                    }
                }
            }
    }
}
