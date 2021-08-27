**BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  

System.out is a stream for sending data to the console, while System.in is for getting data from the keyboard.
**System.in is InputStream object**  --> has read() method

public class Main {

   public static void main(String[] args) throws IOException {

       while (true) {
           int x = System.in.read();
           System.out.println(x);
       }
   }
}


**There's one problem: it reads bytes, not characters**

InputStreamreader needed to convert bytes to characters



**BufferedReader needed for greater performance and convenience (readLine() funcionality).**




















