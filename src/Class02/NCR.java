package Class02;

public class NCR {
    public static void main(String[] args) {

        int n = 5;
        int r = 2;
        // n fact
        int nfact = 1;
        for (int i = 1;i<=n;i++){
            nfact = nfact * i;
        }

        // r fact
        int rfact = 1;
        for (int i = 1;i<=r;i++) {
            rfact = rfact * i;
        }
        // n-r fact
        int nminusrFact  = 1;
        for (int i = 0;i<=(n-r);i++){
            nminusrFact *= nminusrFact;
        }
        // result
        System.out.println(nfact/(rfact*nminusrFact));
    }
}
