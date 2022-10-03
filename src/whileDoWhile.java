public class whileDoWhile {

    public static void main(String[] args) {
        int count = 0;
        while (count != 6) {
            System.out.println(count);
            count++; // don't forget to increment the count to avoid an endless loop
        }

        do {
            System.out.println(count);
            count++;
        } while (count != 6) ;

    } // main close
} // whileDoWhile class close
