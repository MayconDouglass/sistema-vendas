package model;
/**
*
* @author Maycon Douglas
*/
public class ModelProximos {

    private int idkey;
    private String descricao;
    private int proximo;
    private int Count;

    /**
    * Construtor
    */
    public ModelProximos(){}

    /**
    * seta o valor de idkey
    * @param pIdkey
    */
    public void setIdkey(int pIdkey){
        this.idkey = pIdkey;
    }
    /**
    * return idkey
    */
    public int getIdkey(){
        return this.idkey;
    }

    /**
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * return descricao
    */
    public String getDescricao(){
        return this.descricao;
    }

    /**
    * seta o valor de proximo
    * @param pProximo
    */
    public void setProximo(int pProximo){
        this.proximo = pProximo;
    }
    /**
    * return proximo
    */
    public int getProximo(){
        return this.proximo;
    }

    @Override
    public String toString(){
        return "ModelProximos {" + "::idkey = " + this.idkey + "::descricao = " + this.descricao + "::proximo = " + this.proximo +  "}";
    }

    /**
     * @return the Count
     */
    public int getCount() {
        return Count;
    }

    /**
     * @param Count the Count to set
     */
    public void setCount(int Count) {
        this.Count = Count;
    }
}