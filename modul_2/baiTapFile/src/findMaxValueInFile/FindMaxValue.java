package findMaxValueInFile;

import excercise.ReadFileText;

import java.util.List;

public class FindMaxValue {
    public static int findMaxValue(List<Integer> numbers) {
        int max = numbers.get(0);
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            if(max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("fileText.txt");
        int maxValue = findMaxValue(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
}
