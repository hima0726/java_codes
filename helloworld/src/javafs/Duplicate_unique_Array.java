package javafs;

public class  Duplicate_unique_Array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 5, 8, 6};
        int n = arr.length;
        boolean[] visited = new boolean[n];

       // logic to print duplicate and unique
        for (int i = 0; i < n; i++) { 
            if (!visited[i]) 
            {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

           

            if (count > 1) {
                System.out.println("Duplicate: " + arr[i]);
            } else {
                System.out.println("Unique: " + arr[i]);
            }
        }
    }
}
}