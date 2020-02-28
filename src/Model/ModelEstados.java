package model;
/**
*
* @author Maycon Douglas
*/
public class ModelEstados {

    private int idestado;
    private String nome;
    private String uf;
    private int count;
    

    /**
    * Construtor
    */
    public ModelEstados(){}

    /**
    * seta o valor de idestado
    * @param pIdestado
    */
    public void setIdestado(int pIdestado){
        this.idestado = pIdestado;
    }
    /**
    * @return idestado
    */
    public int getIdestado(){
        return this.idestado;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
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

    @Override
    public String toString(){
        return "ModelEstados {" + "::idestado = " + this.idestado + "::nome = " + this.nome + "::uf = " + this.uf +  "}";
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
}