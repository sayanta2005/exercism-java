import java.util.*;

public class PythagoreanTriplet{
    private int a;
    private int b;
    private int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static PythagoreanTripletList makeTripletsList(){
        return new PythagoreanTripletList();
    }
    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        else if(o instanceof PythagoreanTriplet){
            PythagoreanTriplet pt = (PythagoreanTriplet) o;
            return pt.a==a && pt.b==b && pt.c == c;
        }
        else{
            return false;
        }
    }
    public static class PythagoreanTripletList{
        private int sum;
        private final List <PythagoreanTriplet> triplets = new ArrayList<>();
        private int factorLimit = 0;

        public PythagoreanTripletList() {
        }
        public PythagoreanTripletList thatSumTo(int sum){
            this.sum = sum;
            return this;
        }
        public PythagoreanTripletList withFactorsLessThanOrEqualTo(int factorLimit){
            this.factorLimit=factorLimit;
            return this;
        }


        public List<PythagoreanTriplet> build(){
            int factorLimitA, factorLimitB, factorLimitC;
            if(factorLimit==0){
                factorLimitA=sum/3;
                factorLimitB = sum/2;
                factorLimitC = sum/2;
            }
            else{
                factorLimitA = factorLimit;
                factorLimitB = factorLimit;
                factorLimitC = factorLimit;
            }
            for(int a =1; a<=factorLimitA;a++){
                for(int b=a+1;b<=factorLimitB;b++){
                    int c = sum-a-b;
                    if(c*c==(a*a+b*b) && c<=factorLimitC && c>=1){
                        triplets.add(new PythagoreanTriplet(a,b,c));
                    }
                }
            }
            return triplets;
        }
    }
}