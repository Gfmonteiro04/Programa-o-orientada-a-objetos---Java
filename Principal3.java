public class Principal3{
    public static void main (String argv[]){
        int intScript = 6, intActing = 9, intDirecting = 8;
        double doubleScript = 6.0, doubleActing = 9.0, doubleDirecting = 8.0;
        mostraPontuacaoFilme (intScript, intActing, intDirecting);
        mostraPontuacaoFilme (doubleScript, doubleDirecting, doubleDirecting);
    }
    public static void mostraPontuacaoFilme (int s, int a, int d){
        System.out.print("A pontuação inteira do filme é ");
        System.out.println(s + a + d);
    }
    
    public static void mostraPontuacaoFilme (double s, double a, double d){
        System.out.print("A pontuação em ponto flutuante do filme é ");
        System.out.println(s + a + d);
    }
}