// Last updated: 27/04/2026, 04:06:38

class Solution {

    static String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        return padret("", digits);
    }

    static ArrayList<String> padret(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        String letters = map[digit];

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(padret(p + ch, up.substring(1)));
        }

        return list;
    }
}
