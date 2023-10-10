// 2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)


public class RomamNumberToIntegerNumber {
    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue;

            switch (currentChar) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Roman numeral character: " + currentChar);
            }

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "V";
        int intValue = romanToInt(romanNumeral);
        System.out.println("Roman Numeral: " + romanNumeral);
        System.out.println("Integer Value: " + intValue);
    }
}