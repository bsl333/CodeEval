import java.io.*;
import java.util.*;
import  java.util.Collections.*;


import java.io.*;
public class Main {
    public static void main (String[] args){


        try {
            HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
            hashmapReset(hmap);
            File file = new File(args[0]);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim(); // get rid or whitespace at the beginning or end of the line.
                // get rid of whitespace and anything that is not a word character
                line = line.replaceAll("\\W", "");
                line = line.toLowerCase();
                // System.out.println(line);
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    int count = hmap.get(c) + 1;
                    hmap.replace(c, count);
                }
                List<Integer> ints = new ArrayList<>();

                // interate thru the hashmap and put all values in ArrayList.
                for(int i =0; i<26; i++)
                {
                    // get the numberic value of a
                    int a = Integer.valueOf('a');

                    char key = (char) (a+i);
                    ints.add(i, hmap.get(key));

                }
                // sorts it from smallest to largest
                Collections.sort(ints);
                System.out.println(sum(ints));

                hashmapReset(hmap);

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void hashmapReset(HashMap <Character, Integer> hmap)
    {
        hmap.put('a',0);
        hmap.put('b',0);
        hmap.put('c',0);
        hmap.put('d',0);
        hmap.put('e',0);
        hmap.put('f',0);
        hmap.put('g',0);
        hmap.put('h',0);
        hmap.put('i',0);
        hmap.put('j',0);
        hmap.put('k',0);
        hmap.put('l',0);
        hmap.put('m',0);
        hmap.put('n',0);
        hmap.put('o',0);
        hmap.put('p',0);
        hmap.put('q',0);
        hmap.put('r',0);
        hmap.put('s',0);
        hmap.put('t',0);
        hmap.put('u',0);
        hmap.put('v',0);
        hmap.put('w',0);
        hmap.put('x',0);
        hmap.put('y',0);
        hmap.put('z',0);
    }


    // sum the sorted integer List
    static int sum(List <Integer> ints)
    {
        int maxBeauty = 0;
        for(int i = 25; i >=0; i--)
        {
            maxBeauty += (i+1)*ints.get(i);
        }

        return maxBeauty;

    }

}