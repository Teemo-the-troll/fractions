/**
 * Fraction
 */
class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * @return the upper part of the fraction
     */
    @Override
    public Integer getNumerator() {
        return numerator;
    }

    /**
     * @return the bottom part of the fraction
     */
    @Override
    public Integer getDenominator() {
        return denominator;
    }

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction add(IFraction other) {
        int num1 = numerator;
        int denom1 = denominator;
        int denom2 = other.getDenominator();
        int num2 = other.getNumerator();
        int numFinal;
        int denomFinal;

        denomFinal = denom1 * denom2;
        numFinal = (num2*denom1) + (num1*denom2);
        Fraction temp = new Fraction(numFinal, denomFinal);

        return normaliseFraction(temp);
    }

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction minus(IFraction other) {
        int num1 = numerator;
        int denom1 = denominator;
        int denom2 = other.getDenominator();
        int num2 = other.getNumerator();
        int numFinal;
        int denomFinal;
        
        denomFinal = denom1 * denom2;
        numFinal =  (num1*denom2) - (num2*denom1);
        Fraction temp = new Fraction(numFinal, denomFinal);
        return normaliseFraction(temp);
    }

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction times(IFraction other) {
        int num1 = numerator;
        int num2 = other.getNumerator();
        int denom1 = denominator;
        int denom2 = other.getDenominator();

        int newNum = num1 * num2;
        int newDenom = denom1 * denom2;
        Fraction temp = new Fraction(newNum, newDenom);
        return normaliseFraction(temp);
    }

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction dividedBy(IFraction other) {
        int denom = other.getNumerator(); // prohozeno pro nasobeni
        int num = other.getDenominator();
        Fraction temp = new Fraction(num, denom);
        return times(temp);
    }
    
    /**
     * @param other fraction
     * @return new instance of Ifraction simplified to the lowest possible numbers
     */
    @Override
    public IFraction normaliseFraction (IFraction other){
        int num = other.getNumerator();
        int denom = other.getDenominator();
        int max = 0;
        for (int i = 1; (i < num) || (i < denom); i++) {
            if ((((num % i) == 0 ) && ((denom % i) == 0)) ) {
                max = i;
            }
        }
        int numNew = num / max;
        int denomNew = denom / max;

        return new Fraction(numNew, denomNew) ;
    }





}