package model;
/**
*
* @author Maycon Douglas
*/
public class ModelArea {

    private int idarea;
    private String areaDescricao;
    private int areaNivel;
    private int areaStatus;
    private String usuariocad;
    private String usuarioalt;
    private String datacad;
    private String dataalt;
    private int Count;

    /**
    * Construtor
    */
    public ModelArea(){}

    /**
    * seta o valor de idarea
    * @param pIdarea
    */
    public void setIdarea(int pIdarea){
        this.idarea = pIdarea;
    }
    /**
    * return idarea
    */
    public int getIdarea(){
        return this.idarea;
    }

    /**
    * seta o valor de areaDescricao
    * @param pAreaDescricao
    */
    public void setAreaDescricao(String pAreaDescricao){
        this.areaDescricao = pAreaDescricao;
    }
    /**
    * return areaDescricao
    */
    public String getAreaDescricao(){
        return this.areaDescricao;
    }

    /**
    * seta o valor de areaNivel
    * @param pAreaNivel
    */
    public void setAreaNivel(int pAreaNivel){
        this.areaNivel = pAreaNivel;
    }
    /**
    * return areaNivel
    */
    public int getAreaNivel(){
        return this.areaNivel;
    }

    /**
    * seta o valor de areaStatus
    * @param pAreaStatus
    */
    public void setAreaStatus(int pAreaStatus){
        this.areaStatus = pAreaStatus;
    }
    /**
    * return areaStatus
    */
    public int getAreaStatus(){
        return this.areaStatus;
    }

    /**
    * seta o valor de usuariocad
    * @param pUsuariocad
    */
    public void setUsuariocad(String pUsuariocad){
        this.usuariocad = pUsuariocad;
    }
    /**
    * return usuariocad
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
    * return usuarioalt
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
    * return datacad
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
    * return dataalt
    */
    public String getDataalt(){
        return this.dataalt;
    }

    @Override
    public String toString(){
        return "ModelArea {" + "::idarea = " + this.idarea + "::areaDescricao = " + this.areaDescricao + "::areaNivel = " + this.areaNivel + "::areaStatus = " + this.areaStatus + "::usuariocad = " + this.usuariocad + "::usuarioalt = " + this.usuarioalt + "::datacad = " + this.datacad + "::dataalt = " + this.dataalt +  "}";
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