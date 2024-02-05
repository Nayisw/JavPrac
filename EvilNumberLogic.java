public class EvilNumberLogic {
    public static boolean isEvilNumber(int number) {
        String binaryStr = Integer.toBinaryString(number);
        int countOnes = 0;
        
        for (char c : binaryStr.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }
        
        return countOnes % 2 == 0;
    }
}
