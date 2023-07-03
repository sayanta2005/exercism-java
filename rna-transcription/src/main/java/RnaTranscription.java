import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        String ans = new String("");
        for (int charIndex=0; charIndex<dnaStrand.length(); charIndex++){
            char c = dnaStrand.charAt(charIndex);
            if (c=='G')
                ans = ans+"C";
            else if(c=='C')
                ans = ans+"G";
            else if(c=='T')
                ans = ans+"A";
            else
                ans = ans+"U";
        }
        return ans;
    }

}
