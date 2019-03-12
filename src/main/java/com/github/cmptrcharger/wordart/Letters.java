package com.github.cmptrcharger.wordart;

import java.util.HashMap;

public class Letters {
    public static HashMap<Character, Boolean[][]> letters = new HashMap<>();
    public static Boolean[][] toArray(char c){
        init();
        return (letters.get(Character.toUpperCase(c)));
    }
    public static void init() {
        letters.put('A', toBooleanArray(new String[]{
                ".xx.",
                "x..x",
                "xxxx",
                "x..x",
                "x..x"
        }));
        letters.put('B', toBooleanArray(new String[]{
                "xxx.",
                "x..x",
                "xxx.",
                "x..x",
                "xxx."
        }));
        letters.put('C', toBooleanArray(new String[]{
                ".xxx",
                "x...",
                "x...",
                "x...",
                ".xxx"
        }));
        letters.put('D', toBooleanArray(new String[]{
                "xxx.",
                "x..x",
                "x..x",
                "x..x",
                "xxx."
        }));
        letters.put('E', toBooleanArray(new String[]{
                "xxxx",
                "x...",
                "xxxx",
                "x...",
                "xxxx"
        }));
        letters.put('F', toBooleanArray(new String[]{
                "xxxx",
                "x...",
                "xxxx",
                "x...",
                "x..."
        }));
    }
    public static Boolean[][] toBooleanArray (String[] strings) {
        Boolean[][] endvalue = new Boolean[strings.length][strings[0].length()];
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='x') {endvalue[i][j] = true;}
                else{endvalue[i][j] = false;}
            }
        }
        return endvalue;
    }
}
