package model;
/**
*
* @author Maycon Douglas
*/
public class ModelRoteiro {

    private int idroteiro;
    private int empcod;
    private String rotDesc;
    private int transpPadrao;
    private int rotStatus;
    private String usuariocad;
    private String usuarioalt;
    private String datacad;
    private String dataalt;
    private int count;

    /**
    * Construtor
    */
    public ModelRoteiro(){}

    /**
    * seta o valor de idroteiro
    * @param pIdroteiro
    */
    public void setIdroteiro(int pIdroteiro){
        this.idroteiro = pIdroteiro;
    }
    /**
    * @return idroteiro
    */
    public int getIdroteiro(){
        return this.idroteiro;
    }

    /**
    * seta o valor de empcod
    * @param pEmpcod
    */
    public void setEmpcod(int pEmpcod){
        this.empcod = pEmpcod;
    }
    /**
    * @return empcod
    */
    public int getEmpcod(){
        return this.empcod;
    }

    /**
    * seta o valor de rotDesc
    * @param pRotDesc
    */
    public void setRotDesc(String pRotDesc){
        this.rotDesc = pRotDesc;
    }
    /**
    * @return rotDesc
    */
    public String getRotDesc(){
        return this.rotDesc;
    }

    /**
    * seta o valor de transpPadrao
    * @param pTranspPadrao
    */
    public void setTranspPadrao(int pTranspPadrao){
        this.transpPadrao = pTranspPadrao;
    }
    /**
    * @return transpPadrao
    */
    public int getTranspPadrao(){
        return this.transpPadrao;
    }

    /**
    * seta o valor de rotStatus
    * @param pRotStatus
    */
    public void setRotStatus(int pRotStatus){
        this.rotStatus = pRotStatus;
    }
    /**
    * @return rotStatus
    */
    public int getRotStatus(){
        return this.rotStatus;
    }

    /**
    * seta o valor de usuariocad
    * @param pUsuariocad
    */
    public void setUsuariocad(String pUsuariocad){
        this.usuariocad = pUsuariocad;
    }
    /**
    * @return usuariocad
    */
    public String getUsuariocad(){
        return this.usuariocad;
    }

    /**
    * seta o valor de usuarioalt
    * @param pUsuarioalt
    */
    public void setUsuarioalt(String pUsuarioalt){
        this.usuarioalt = pUsuarioalt;
    }
    /**
    * @return usuarioalt
    */
    public String getUsuarioalt(){
        return this.usuarioalt;
    }

    /**
    * seta o valor de datacad
    * @param pDatacad
    */
    public void setDatacad(String pDatacad){
        this.datacad = pDatacad;
    }
    /**
    * @return datacad
    */
    public String getDatacad(){
        return this.datacad;
    }

    /**
    * seta o valor de dataalt
    * @param pDataalt
    */
    public void setDataalt(String pDataalt){
        this.dataalt = pDataalt;
    }
    /**
    * @return dataalt
    */
    public String getDataalt(){
        return this.dataalt;
    }

    @Override
    public String toString(){
        return "ModelRoteiro {" + "::idroteiro = " + this.idroteiro + "::empcod = " + this.empcod + "::rotDesc = " + this.rotDesc + "::transpPadrao = " + this.transpPadrao + "::rotStatus = " + this.rotStatus + "::usuariocad = " + this.usuariocad + "::usuarioalt = " + this.usuarioalt + "::datacad = " + this.datacad + "::dataalt = " + this.dataalt +  "}";
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