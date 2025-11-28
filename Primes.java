
public class Primes{
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args [0]);

        boolean [] Prime = new boolean[n+1];
        int p = 2;
        while (p<=n) {
            Prime[p]= true;
            p++;
        }

       p=2;
        while (p * p <= n) {
            if (Prime[p]){
                int k = p*p;
                while (k <= n) {
                    Prime [k]= false;
                    k+=p;
                }
        }
        p++;
    }

    System.out.println("Prime numbers up to " + n + ":");

      
        int count = 0;
        int i = 2;
        while (i <= n) {
            if (Prime[i]) {
                System.out.println(i);
                count++;
            }
            i++;
        }

       
        int percent = (int) (100.0 * count / n);

        System.out.println("There are " + count + " primes between 2 and " + n +
                           " (" + percent + "% are primes)");
    }
}