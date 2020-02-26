package model;
/**
*
* @author Maycon Douglas
*/
public class ModelCidades {

    private int idCidade;
    private String descricao;
    private String uf;
    private int codigoIbge;
    private String ddd; 
    private int cout;
    

    /**
    * Construtor
    */
    public ModelCidades(){}

    /**
    * seta o valor de idCidade
    * @param pIdCidade
    */
    public void setIdCidade(int pIdCidade){
        this.idCidade = pIdCidade;
    }
    /**
    * @return idCidade
    */
    public int getIdCidade(){
        return this.idCidade;
    }

    /**
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * @return descricao
    */
    public String getDescricao(){
        return this.descricao;
    }

    /**
    * seta o valor de uf
    * @param pUf
    */
    public void setUf(String pUf){
        this.uf = pUf;
    }
    /**
    * @return uf
    */
    public String getUf(){
        return this.uf;
    }

    /**
    * seta o valor de codigoIbge
    * @param pCodigoIbge
    */
    public void setCodigoIbge(int pCodigoIbge){
        this.codigoIbge = pCodigoIbge;
    }
    /**
    * @return codigoIbge
    */
    public int getCodigoIbge(){
        return this.codigoIbge;
    }

    /**
    * seta o valor de ddd
    * @param pDdd
    */
    public void setDdd(String pDdd){
        this.ddd = pDdd;
    }
    /**
    * @return ddd
    */
    public String getDdd(){
        return this.ddd;
    }

    @Override
    public String toString(){
        return "ModelCidades {" + "::idCidade = " + this.idCidade + "::descricao = " + this.descricao + "::uf = " + this.uf + "::codigoIbge = " + this.codigoIbge + "::ddd = " + this.ddd +  "}";
    }

    /**
     * @return the cout
     */
    public int getCout() {
        return cout;
    }

    /**
     * @param cout the cout to set
     */
    public void setCout(int cout) {
        this.cout = cout;
    }
}