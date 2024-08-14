package cap5;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }

        //n�o � isso nums2 = nums1; t� apontando pro mesmo array
        //nums2 = nums1;

        // Usando length para garantir que nums2 tem o tamanho adequado
        if (nums2.length >= nums1.length) {
            for (int i = 0; i < nums1.length; i++) {
                nums2[i] = nums1[i];
            }
        }
        System.out.print("posicao de memoria:" + nums1 + " - " + nums2);

        // Imprimindo os valores do array nums2 ap�s a c�pia
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }

        // Sa�da: 0 1 2 3 4 5 6 7 8 9
    }
}
