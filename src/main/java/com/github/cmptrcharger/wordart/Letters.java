package com.github.cmptrcharger.wordart;

import java.util.HashMap;

public class Letters {
    public static HashMap<Character, Boolean[][]> letters = new HashMap<>();
    public static Boolean[][] toArray(char c){
        init();
        return new Boolean[2][5];
    }
    public static void init(){
        letters.put('A', new Boolean[][]{{false, true, false}, {true, false, true,},{true, true,true},{true, false, true},{true, false, true}});
        letters.put('B', new Boolean[][]{{true, true, false}, {true, false, true,},{true, true,false},{true, false, true},{true, true, false}});
        letters.put('C', new Boolean[][]{{false, true, true}, {true, false, false,},{true, false,false},{true, false, false},{false, true, true}});
        letters.put('D', new Boolean[][]{{true, true, false}, {true, false, true,},{true, false,true},{true, false, true},{true, true, false}});
        letters.put('E', new Boolean[][]{{true, true, true}, {true, false, false,},{true, true,true},{true, false, false},{true, true, true}});
        letters.put('F', new Boolean[][]{{true, true, true}, {true, false, false,},{true, true,true},{true, false, false},{true, false, false}});
        letters.put('G', new Boolean[][]{{false, true, true, false}, {true, false, false,false},{true,false,true,true},{true, false,false, true},{false, true, true, false}});
        letters.put('H', new Boolean[][]{{true, false, true}, {true, false, true,},{true, true,true},{true, false, true},{true, false, true}});
        letters.put('I', new Boolean[][]{{true, true, true}, {false, true, false,},{false, true,false},{false, true, false},{true, true, true}});
        letters.put('J', new Boolean[][]{{false, false, true}, {false, false, true,},{false, true,true},{true, false, true},{false, true, false}});
        letters.put('K', new Boolean[][]{{true, false, true}, {true, false, true,},{true, true,false},{true, false, true},{true, false, true}});
        letters.put('L', new Boolean[][]{{true, false, false}, {true, false, false,},{true, false,false},{true, false, false},{true, true, true}});
        letters.put('M', new Boolean[][]{{true, false,false,false, true}, {true, true, false,true,true,},{true,false, true,false,true},{true, false,false,false, true},{true, false,false,false, true}});
        letters.put('N', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('O', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('P', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('Q', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('R', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('S', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('T', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('U', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('V', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('W', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('X', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('Y', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        letters.put('Z', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});
        //for future characters
        //letters.put('A', new Boolean[][]{{true, true, true}, {true, true, true,},{true, true,true},{true, true, true},{true, true, true}});

    }
}
