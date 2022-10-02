package chapter04;

public class Dictionary {
    private static final String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static final String[] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (word.equals(kor[i])) {
                return eng[i];
            }
        }
        return "false";
    }
}