package model; 
/**
*
* @author Maycon Douglas
*/
public class ModelUsuario {

    private int iduser;
    private String nome;
    private int area;
    private int perfil;
    private String email;
    private String login;
    private String senha;
    private String aniversario;
    private int status;
    private int validacao;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de iduser
    * @param pIduser
    */
    public void setIduser(int pIduser){
        this.iduser = pIduser;
    }
    /**
    * return iduser
    */
    public int getIduser(){
        return this.iduser;
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
    * seta o valor de area
    * @param pArea
    */
    public void setArea(int pArea){
        this.area = pArea;
    }
    /**
    * return area
    */
    public int getArea(){
        return this.area;
    }

    /**
    * seta o valor de perfil
    * @param pPerfil
    */
    public void setPerfil(int pPerfil){
        this.perfil = pPerfil;
    }
    /**
    * return perfil
    */
    public int getPerfil(){
        return this.perfil;
    }

    /**
    * seta o valor de email
    * @param pEmail
    */
    public void setEmail(String pEmail){
        this.email = pEmail;
    }
    /**
    * return email
    */
    public String getEmail(){
        return this.email;
    }

    /**
    * seta o valor de login
    * @param pLogin
    */
    public void setLogin(String pLogin){
        this.login = pLogin;
    }
    /**
    * return login
    */
    public String getLogin(){
        return this.login;
    }

    /**
    * seta o valor de senha
    * @param pSenha
    */
    public void setSenha(String pSenha){
        this.senha = pSenha;
    }
    /**
    * return senha
    */
    public String getSenha(){
        return this.senha;
    }

    /**
    * seta o valor de aniversario
    * @param pAniversario
    */
    public void setAniversario(String pAniversario){
        this.aniversario = pAniversario;
    }
    /**
    * return aniversario
    */
    public String getAniversario(){
        return this.aniversario;
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
        return "ModelUsuario {" + "::iduser = " + this.iduser + "::nome = " + this.nome + "::area = " + this.area + "::perfil = " + this.perfil + "::email = " + this.email + "::login = " + this.login + "::senha = " + this.senha + "::aniversario = " + this.aniversario + "::status = " + this.status +  "}";
    }

    /**
     * @return the validacao
     */
    public int getValidacao() {
        return validacao;
    }

    /**
     * @param validacao the validacao to set
     */
    public void setValidacao(int validacao) {
        this.validacao = validacao;
    }
}