
public class Primes{
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args [0]);

        boolean [] Prime= new boolean[n+1];
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

        int i =2;
        int count = 0;
        while (i<Prime.length) {
            if(Prime[i]){
                System.out.println(i);
                count++;
            }
            i++;
        }
        double pre = (count/(double)n)*100;
        System.out.println("There are "+ count+ " primes between 2 and "+ n +" ("+ pre + "% are primes)");
            
        }
    }

