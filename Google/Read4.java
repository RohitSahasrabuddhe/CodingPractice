/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf);
 */
public class Read4 extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        char[] inBuf = new char[4];
        int c = 0;
        int retVal = 0;
        while(c < n && (retVal = read4(inBuf)) > 0 ) {
           for(int i = 0; i < retVal && c < n; i++) {
               buf[c++] = inBuf[i];
           } 
        }
        return c;
    }
}