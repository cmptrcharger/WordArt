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
                //A
                ".xx.",
                "x..x",
                "xxxx",
                "x..x",
                "x..x"
        }));
        letters.put('B', toBooleanArray(new String[]{
                //B
                "xxx.",
                "x..x",
                "xxx.",
                "x..x",
                "xxx."
        }));
        letters.put('C', toBooleanArray(new String[]{
                //C
                ".xxx",
                "x...",
                "x...",
                "x...",
                ".xxx"
        }));
        letters.put('D', toBooleanArray(new String[]{
                //D
                "xxx.",
                "x..x",
                "x..x",
                "x..x",
                "xxx."
        }));
        letters.put('E', toBooleanArray(new String[]{
                //E
                "xxxx",
                "x...",
                "xxxx",
                "x...",
                "xxxx"
        }));
        letters.put('F', toBooleanArray(new String[]{
                //F
                "xxxx",
                "x...",
                "xxxx",
                "x...",
                "x..."
        }));
        letters.put('G', toBooleanArray(new String[]{
                //G
                ".xxx",
                "x...",
                "x.xx",
                "x..x",
                ".xxx"
        }));
        letters.put('H', toBooleanArray(new String[]{
                //H
                "x..x",
                "x..x",
                "xxxx",
                "x..x",
                "x..x"
        }));
        letters.put('I', toBooleanArray(new String[]{
                //I
                "xxx",
                ".x.",
                ".x.",
                ".x.",
                "xxx"
        }));
        letters.put('J', toBooleanArray(new String[]{
                //J
                "xxxx",
                "..x.",
                "x.x.",
                "x.x.",
                "xxx."
        }));
        letters.put('K', toBooleanArray(new String[]{
                //K
                "x..x",
                "x.x.",
                "xx..",
                "x.x.",
                "x..x"
        }));
        letters.put('L', toBooleanArray(new String[]{
                "x...",
                "x...",
                "x...",
                "x...",
                "xxxx"
        }));
        letters.put('M', toBooleanArray(new String[]{
                "x...x",
                "xx.xx",
                "x.x.x",
                "x...x",
                "x...x"
        }));
        letters.put('N', toBooleanArray(new String[]{
                "x...x",
                "xx..x",
                "x.x.x",
                "x..xx",
                "x...x"
        }));
        letters.put('O', toBooleanArray(new String[]{
                ".xx.",
                "x..x",
                "x..x",
                "x..x",
                ".xx."
        }));
        letters.put('P', toBooleanArray(new String[]{
                "xxx.",
                "x..x",
                "xxx.",
                "x...",
                "x...",
        }));
        letters.put('Q', toBooleanArray(new String[]{
                ".xx.",
                "x..x",
                "x..x",
                ".xx.",
                "...x"
        }));
        letters.put('R', toBooleanArray(new String[]{
                "xxx.",
                "x..x",
                "xxx.",
                "x..x",
                "x..x"
        }));
        letters.put('S', toBooleanArray(new String[]{
                ".xxx",
                "x...",
                "xxxx",
                "...x",
                "xxx."
        }));
        letters.put('T', toBooleanArray(new String[]{
                "xxx",
                ".x.",
                ".x.",
                ".x.",
                ".x."
        }));
        letters.put('U', toBooleanArray(new String[]{
                "x..x",
                "x..x",
                "x..x",
                "x..x",
                "xxxx"
        }));
        letters.put('V', toBooleanArray(new String[]{
                "x..x",
                "x..x",
                "x..x",
                "x..x",
                ".xx."
        }));
        letters.put('W', toBooleanArray(new String[]{
                "x...x",
                "x...x",
                "x.x.x",
                "xx.xx",
                "x...x"
        }));
        letters.put('X', toBooleanArray(new String[]{
                "x...x",
                ".x.x.",
                "..x..",
                ".x.x.",
                "x...x"
        }));
        letters.put('Y', toBooleanArray(new String[]{
                "x...x",
                ".x.x.",
                "..x..",
                "..x..",
                "..x.."
        }));
        letters.put('Z', toBooleanArray(new String[]{
                "xxxxx",
                "...x.",
                "..x..",
                ".x...",
                "xxxxx"
        }));
        letters.put(' ', toBooleanArray(new String[]{
                "....",
                "....",
                "....",
                "....",
                "...."
        }));
        letters.put('.', toBooleanArray(new String[]{
                ".",
                ".",
                ".",
                ".",
                ".",
                "x"
        }));
        letters.put(',', toBooleanArray(new String[]{
                "..",
                "..",
                "..",
                ".x",
                "x."
        }));

        letters.put('?', toBooleanArray(new String[]{
                ".xx.",
                "x..x",
                "..x.",
                "....",
                "..x."
        }));
        letters.put('!', toBooleanArray(new String[]{
                "x",
                "x",
                "x",
                ".",
                "x",
        }));
        letters.put('#', toBooleanArray(new String[]{
                ".x.x.",
                "xxxxx",
                ".x.x.",
                "xxxxx",
                ".x.x."
        }));
        letters.put('$', toBooleanArray(new String[]{
                ".xxxx",
                "x.x..",
                "xxxxx",
                "..x.x",
                "xxxx."
        }));

    }
    public static Boolean[][] toBooleanArray (String[] strings) {
        Boolean[][] returnValue = new Boolean[strings.length][strings[0].length()];
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            for (int j = 0; j < str.length(); j++) returnValue[i][j] = str.charAt(j)=='x';
        }
        return returnValue;
    }
}