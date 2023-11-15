public class Main {
    //Scrivere una funzione che controlli se un numero int è in un determinato range
    //Se lo è ritorna true se non lo è lancia un'eccezione
    public static void main(String[] args){
        //try{
            boolean isInRange = checkRange(3,2,4);
            System.out.println("Il numero inserito rientra nel range? " + isInRange);
        //}catch (Exception e){
            System.out.println("Errore in checkRange");
        //}

        System.out.println("Fine codice");
    }
    //try-catch non serve nell'es, va usato sulla parte di codice su cui penso
    //possa crearsi un errore ed evito che crashi runnandolo
    public static boolean checkRange(int num, int lower, int upper) throws Exception {
        if (num < lower || num >= upper){
            throw new Exception("true");
        }else {
            return true;}
    }
}