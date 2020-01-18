package MassTest;

import java.util.ArrayList;

public class MassTest {

    public static String[] enter (String word, String param) {
        int[] i = outer(word, param);
        String[] newword = null;
        if (i != null) {
            newword = new String[i.length + 1];
            newword[0] = word.substring(0, i[0]);
            for (int a = 1; a < i.length; a++) {
                newword[a] = word.substring(i[a-1] + param.length(), i[a]);
            }
            newword[newword.length - 1] = word.substring(i[i.length - 1] + param.length());
        }
        else {
            newword = new String[]{word};
        }
        return newword;
    }

    public static int[] outer (String word, String param) {
        int[] ii = null;
        ArrayList<String> a = new ArrayList<String>();

        for (int i = 0; i < word.length() - (param.length() - 1); i++){
            if (param.equals(word.substring(i, i + param.length()))) {
                a.add("" + i);
            }
        }

        if (a.size() > 0) {
            ii = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                ii[i] = Integer.parseInt(a.get(i));
            }
        }
        return ii;
    }

    public static void main (String[] args) {
        String str1 = "vasya alkash konchenuy yOy buhae mnogo OOOOOO ссссссссвсвсвсвсвсвс";
        String[] string = enter(str1, " ");

        for (int i = 0; i < string.length; i++) {
            int zz = string[i].length();
            char[] cc = string[i].toCharArray();
            if (cc[0] == cc[zz - 1]) {
                System.out.println(cc);
            }
        }

        int k = 0;
        for(int i = 0; i < string.length; i++){
            char[] c = string[i].toCharArray();
            if((int)c[0] == (int) c[c.length - 1]){
                k++;
            }
        }

        System.out.println("Количество слов: " + k);
    }
}
