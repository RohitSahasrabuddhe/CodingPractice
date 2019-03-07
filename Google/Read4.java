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
        char[] inBuf;
        int size = n;
        int c = 0;
        while(size > 4) {
            inBuf = new char[4];
            int retVal = read4(inBuf);
            if(retVal < 4) {
                // file is finished reading
               for(int i = 0; i < retVal; i++) {
                   buf[c++] = inBuf[i];
                   return c;
               } 
            }
            for(int  i = 0; i < 4; i++) {
                buf[c++] = inBuf[i];
            }
            size -= 4;
        }
        inBuf = new char[4];
        int retVal = read4(inBuf);
        for(int i = 0; i < size && i < retVal; i++) {
            buf[c++] = inBuf[i];
        }
        return c;
    }
}