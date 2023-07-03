class PrimeCalculator {

    int nth(int nth) {
        if (nth==0){
            throw new IllegalArgumentException("nth value must be greater than 0");
        }
        int value = 2;
        int count = 0;
        while(count<nth){
            if(checkPrime(value)){
                count++;
            }
            value++;
        }
        return value-1;
        
    }
    boolean checkPrime(int number){
        int i=2;
        while(i<=number/2){
            if (number%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
