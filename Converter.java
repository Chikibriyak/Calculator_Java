package calc;
import java.util.TreeMap;
public class Converter {
    TreeMap<Character, Integer> romanKeyMap = new TreeMap<>();
    TreeMap<Integer ,String> arabianKeyMap = new TreeMap<>();

    public Converter(){
        romanKeyMap.put('I', 1);
        romanKeyMap.put('V', 5);
        romanKeyMap.put('X', 10);
        romanKeyMap.put('L', 50);
        romanKeyMap.put('C', 100);
        romanKeyMap.put('D', 500);
        romanKeyMap.put('M', 1000);

        arabianKeyMap.put(1000, "M");
        arabianKeyMap.put(500, "D");
        arabianKeyMap.put(100, "C");
        arabianKeyMap.put(50, "L");
        arabianKeyMap.put(10, "X");
        arabianKeyMap.put(5,"V");
        arabianKeyMap.put(1, "I");
    }
    public boolean isRoman(String number){
        return romanKeyMap.containsKey(number.charAt(0));
    }
    public String inToRoman(int num){
        String rom = "";
        int arabNum;
        do {
            arabNum = arabianKeyMap.floorKey(num);
            rom += arabianKeyMap.get(arabNum);
            num -= arabNum;
        }while (num != 0);
        return rom;
    }
}
