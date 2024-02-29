public class Principal2 {
    public static void main (String argv[]){
        int script = 6, atuacao = 9, direcao = 8;
        
        System.out.print ("A pontuação de um filme é ");
        
        System.out.println(Filme3.pontuarFilme(script, atuacao, direcao));
        
        System.out.print("A pontuação do filme do james bond é ");
        System.out.println(JamesBondFilme1.pontuarFilme(script, atuacao, direcao));
        
    }
}