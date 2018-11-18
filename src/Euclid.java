public class Euclid {

    public static void main (String[] args){
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        System.out.println("Finding GCD of " + p + " and " + q + ".");
        System.out.print(gcd(p,q));
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

}

// Related assignment: read 1.1; ex. 1.1.24,25