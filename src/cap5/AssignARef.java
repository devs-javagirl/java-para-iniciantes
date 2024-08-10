package cap5;

public class AssignARef {
    public static void main(String[] args) {
        int[] nums1 = new int[10];
        int nums2[] = new int[10];

        for (int i = 0; i < 10; i++) {
            nums1[i] = i;
            nums2[i] = -i;
        }

        // Atribuindo nums1 a nums2
        nums2 = nums1;

        // Agora nums2 referencia o mesmo array que nums1
        int index = 3;
        nums2[index] = 99;

        // Imprimindo valores para ver a mudança em ambos os arrays
        System.out.println("nums1[position]: " + nums1[index]); // Saída: 99
        System.out.println("nums2[position]: " + nums2[index]); // Saída: 99
    }
}

