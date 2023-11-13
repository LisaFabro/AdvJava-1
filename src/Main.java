public class Main {
    //Scrivere una funzione che controlli se un numero int è in un determinato range
    //Se lo è ritorna true se non lo è lancia un'eccezione
    public static void main(String[] args){
        int numInput = 100;
        System.out.println("Il numero inserito rientra nel range? " + control(numInput));
    }
    public static boolean control(int num){
        boolean response= true;
        try{
            int test = num;
            //range 0-99
            if (num < 0 || num >= 100){
                throw new ArithmeticException("false");
            }
        } catch (ArithmeticException e){
            response= false;
        }
        return response;
    }
}