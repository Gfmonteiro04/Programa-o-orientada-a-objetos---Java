public class Filme2{
    public static void main(String argv[]){
        int script = 6, atuacao = 9, direcao = 8;
            mostrarPontuacaoFilme (script, atuacao, direcao);
    }
    public static void mostrarPontuacaoFilme (int s, int a, int d){
        System.out.print("A pntuação do filme é ");
        System.out.print(s + a + d);
    }
}