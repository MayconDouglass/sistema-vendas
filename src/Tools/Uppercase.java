package Tools;

public class Uppercase {

    /**
     *
     * @param pString
     * @return
     */
    public String Uppercase(String pString) {
        String posicao = "";
        String mais = "";
        String tudo = "";
        String maiuscula2 = "";
        String retorno = new String();
        posicao = "" + pString.charAt(0);//pega a primeira letra que sera maiuscula
        String pos = posicao.toUpperCase();    //transforma em maiuscula
        int tamanho = pString.length();//ve o tamanho da frase
        for (int i = 1; i < pString.length(); i++) {  //coloca o for de acordo com o tamanho
            mais = mais + pString.charAt(i); //acrescenta as letras
            if (pString.charAt(i) == ' ') {  //se houver um espaço a próxima vai ser transformada em maisucula.
                String maiuscula = "" + pString.charAt(i + 1);//pega a próxima apos o espaço  
                maiuscula2 = maiuscula.toUpperCase();       //transforma em maiuscula.
                mais = mais + maiuscula2;//acrescenta a maiuscula a palavra completa, que se chama mais
                i = i + 1; //soma um, pois uma letra minuscula foi substituida e ja foi acrescentada                                 
            }
        }
        tudo = pos + mais;
        retorno = (tudo);
        return (retorno);
    }
}
