import java.util.regex.*;
import java.lang.*;
import java.math.*;
class Solution {
    public boolean isMatch(String s, String p) {
        return Pattern.compile(p).matcher(s).matches();
    }
}