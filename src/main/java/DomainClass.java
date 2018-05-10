public class DomainClass {
    public static void main(String[] args) {
        DomainClass domainClass = new DomainClass();
        System.out.println( "Special number is = " + domainClass.convert( 234));
    }
    public int convert( int inputNumber) {
        return inputNumber * inputNumber - 2 + 4;
    }
    public int convert2( int inputNumber) {
        return inputNumber * inputNumber - 2 + 4;
    }
}
