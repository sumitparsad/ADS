import java.util.HashMap;
import javax.print.DocFlavor;
public class StringManipulation {
    public static String minWindow(String s1,String s2){
        if(s1==null||s2==null||s1.length()<s2.length()){
            return "";
        }
        HashMap<Character,Integer>charFreq=new HashMap<>();
        for(char c:s2.toCharArray()){
            charFreq.put(c,charFreq.getOrDefault(c, 0) + 1);
        }
        HashMap<Character,Integer>windowCoun=new HashMap<>();
        int start=0,matched=0,minLength=Integer.MAX_VALUE;
        int minStart=0;
        for(int end=0;end<s1.length();end++){
            char endChar=s1.charAt(end);
            windowCoun.put(endChar,windowCoun.getOrDefault(endChar, 0) + 1);
            if(charFreq.containsKey(endChar)&&windowCoun.get(endChar).equals(charFreq.get(endChar))){
                matched++;
            }
            while(matched==charFreq.size()){
                if(end-start+1<minLength){
                    minLength=end-start+1;
                    minStart=start;
                }
                char startChar=s1.charAt(start);
                if(charFreq.containsKey(startChar)){
                    windowCoun.put(startChar,windowCoun.get(startChar)-1);
                    if(windowCoun.get(startChar)<charFreq.get(startChar)){
                        matched--;
                    }
                }
                start++;
            }
        }
        return minLength==Integer.MAX_VALUE?"":s1.substring(minStart,minStart+minLength);
    }
    public static void main(String[] args) {
        //Find the smallest substring in the first string that contains all the characters of the second string
        //We are going to use two hashmaps
        //charFreq to store the frequency of each character in s2
        //window to store the frequency of each character in the current window of s1
        // use two pointers to start and end of the current window
        //expand the window by moving the end pointer until all characters in s2 covered
        // once a valid window is found shrink it from the left by moving the star to minimize the window size
        String s1="ADOBECODEBANC";
        String s2="ABC";
        System.out.println(*/+)
    }

}
