public class Main {

    public static void main(String[] args) {
        
        Fraction fr = new Fraction(3, 8);
        Fraction y = new Fraction(4, 12);
        IFraction added = fr.add(y);
        IFraction subtracted = fr.minus(y);
        IFraction multiplied = fr.times(y);
        IFraction divided = fr.dividedBy(y);


        System.out.println(added.getNumerator() + "/" + added.getDenominator());
        System.out.println(subtracted.getNumerator() + "/" + subtracted.getDenominator());
        System.out.println(multiplied.getNumerator() + "/" + multiplied.getDenominator());
        System.out.println(divided.getNumerator() + "/" + divided.getDenominator());
        
        











    }
}
