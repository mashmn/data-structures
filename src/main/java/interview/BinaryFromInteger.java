package interview;

public class BinaryFromInteger {

    public static void main (String[] args) {
        int num = 2500;
        System.out.println("Convert integer " + num + " to binary: " + binaryConverter(num));
        System.out.println("Convert integer " + num + " to binary: " + customBinaryConverter(num));
    }

    public static String binaryConverter (int num) {
        return Integer.toBinaryString(num);
    }

    public static String customBinaryConverter (int num) {
        int binary[] = new int[40];
        int index = 0;
        String output = "";

        while (num > 0) {
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1; i>=0; i--) {
            output += binary[i];
        }
        return output;
    }
}
