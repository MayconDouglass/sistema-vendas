package model;
/**
*
* @author Maycon Douglas
*/
public class ModelPerfil {

    private int idperfil;
    private String perNome;
    private String usuLogin;
    private int status;
    private int Count;

    /**
    * Construtor
    */
    public ModelPerfil(){}

    /**
    * seta o valor de idperfil
    * @param pIdperfil
    */
    public void setIdperfil(int pIdperfil){
        this.idperfil = pIdperfil;
    }
    /**
    * return idperfil
    */
    public int getIdperfil(){
        return this.idperfil;
    }

    /**
    * seta o valor de perNome
    * @param pPerNome
    */
    public void setPerNome(String pPerNome){
        this.perNome = pPerNome;
    }
    /**
    * return perNome
    */
    public String getPerNome(){
        return this.perNome;
    }

    /**
    * seta o valor de status
    * @param pStatus
    */
    public void setStatus(int pStatus){
        this.status = pStatus;
    }
    /**
    * return status
    */
    public int getStatus(){
        return this.status;
    }

    @Override
    public String toString(){
        return "ModelPerfil {" + "::idperfil = " + this.idperfil + "::perNome = " + this.perNome + "::status = " + this.status +  "}";
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

    /**
     * @return the usuLogin
     */
    public String getUsuLogin() {
        return usuLogin;
    }

    /**
     * @param usuLogin the usuLogin to set
     */
    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }
}