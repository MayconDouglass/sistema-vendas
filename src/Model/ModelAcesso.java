package model;
/**
*
* @author Maycon Douglas
*/
public class ModelAcesso {

    private int idacesso;
    private int idperfil;
    private String nome;
    private String idkey;
    private int auth;
    private int count;

    /**
    * Construtor
    */
    public ModelAcesso(){}

    /**
    * seta o valor de idacesso
    * @param pIdacesso
    */
    public void setIdacesso(int pIdacesso){
        this.idacesso = pIdacesso;
    }
    /**
    * return idacesso
    */
    public int getIdacesso(){
        return this.idacesso;
    }

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
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de idkey
    * @param pIdkey
    */
    public void setIdkey(String pIdkey){
        this.idkey = pIdkey;
    }
    /**
    * return idkey
    */
    public String getIdkey(){
        return this.idkey;
    }

    /**
    * seta o valor de auth
    * @param pAuth
    */
    public void setAuth(int pAuth){
        this.auth = pAuth;
    }
    /**
    * return auth
    */
    public int getAuth(){
        return this.auth;
    }

    @Override
    public String toString(){
        return "ModelAcesso {" + "::idacesso = " + this.idacesso + "::idperfil = " + this.idperfil + "::nome = " + this.nome + "::idkey = " + this.idkey + "::auth = " + this.auth +  "}";
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