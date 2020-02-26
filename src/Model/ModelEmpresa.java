package model;
/**
*
* @author Maycon Douglas
*/
public class ModelEmpresa {

    private int empCod;
    private String empEstabelecimento;
    private String empRazao;
    private String empFantasia;
    private String empCNPJ;
    private String empIE;
    private int empQtdLicenca;
    private String empExpiracao;
    private String cadastro;
    private String empEmailPop;
    private int empEmailStatus;
    private int empEmailPorta;
    private String empEmailSmtp;
    private String empEmailLogin;
    private String empEmailSenha;
    private String empFechamentoDia;
    private int empStatus;
    private int count;

    /**
    * Construtor
    */
    public ModelEmpresa(){}

    /**
    * seta o valor de empCod
    * @param pEmpCod
    */
    public void setEmpCod(int pEmpCod){
        this.empCod = pEmpCod;
    }
    /**
    * @return empCod
    */
    public int getEmpCod(){
        return this.empCod;
    }

    /**
    * seta o valor de empEstabelecimento
    * @param pEmpEstabelecimento
    */
    public void setEmpEstabelecimento(String pEmpEstabelecimento){
        this.empEstabelecimento = pEmpEstabelecimento;
    }
    /**
    * @return empEstabelecimento
    */
    public String getEmpEstabelecimento(){
        return this.empEstabelecimento;
    }

    /**
    * seta o valor de empRazao
    * @param pEmpRazao
    */
    public void setEmpRazao(String pEmpRazao){
        this.empRazao = pEmpRazao;
    }
    /**
    * @return empRazao
    */
    public String getEmpRazao(){
        return this.empRazao;
    }

    /**
    * seta o valor de empFantasia
    * @param pEmpFantasia
    */
    public void setEmpFantasia(String pEmpFantasia){
        this.empFantasia = pEmpFantasia;
    }
    /**
    * @return empFantasia
    */
    public String getEmpFantasia(){
        return this.empFantasia;
    }

    /**
    * seta o valor de empCNPJ
    * @param pEmpCnpj
    */
    public void setEmpCNPJ(String pEmpCnpj){
        this.empCNPJ = pEmpCnpj;
    }
    /**
    * @return empCNPJ
    */
    public String getEmpCNPJ(){
        return this.empCNPJ;
    }

    /**
    * seta o valor de empIE
    * @param pEmpIe
    */
    public void setEmpIE(String pEmpIe){
        this.empIE = pEmpIe;
    }
    /**
    * @return empIE
    */
    public String getEmpIE(){
        return this.empIE;
    }

    /**
    * seta o valor de empQtdLicenca
    * @param pEmpQtdLicenca
    */
    public void setEmpQtdLicenca(int pEmpQtdLicenca){
        this.empQtdLicenca = pEmpQtdLicenca;
    }
    /**
    * @return empQtdLicenca
    */
    public int getEmpQtdLicenca(){
        return this.empQtdLicenca;
    }

    /**
    * seta o valor de cadastro
    * @param pCadastro
    */
    public void setCadastro(String pCadastro){
        this.cadastro = pCadastro;
    }
    /**
    * @return cadastro
    */
    public String getCadastro(){
        return this.cadastro;
    }

    /**
    * seta o valor de empEmailPop
    * @param pEmpEmailPop
    */
    public void setEmpEmailPop(String pEmpEmailPop){
        this.empEmailPop = pEmpEmailPop;
    }
    /**
    * @return empEmailPop
    */
    public String getEmpEmailPop(){
        return this.empEmailPop;
    }

    /**
    * seta o valor de empEmailStatus
    * @param pEmpEmailStatus
    */
    public void setEmpEmailStatus(int pEmpEmailStatus){
        this.empEmailStatus = pEmpEmailStatus;
    }
    /**
    * @return empEmailStatus
    */
    public int getEmpEmailStatus(){
        return this.empEmailStatus;
    }

    /**
    * seta o valor de empEmailPorta
    * @param pEmpEmailPorta
    */
    public void setEmpEmailPorta(int pEmpEmailPorta){
        this.empEmailPorta = pEmpEmailPorta;
    }
    /**
    * @return empEmailPorta
    */
    public int getEmpEmailPorta(){
        return this.empEmailPorta;
    }

    /**
    * seta o valor de empEmailSmtp
    * @param pEmpEmailSmtp
    */
    public void setEmpEmailSmtp(String pEmpEmailSmtp){
        this.empEmailSmtp = pEmpEmailSmtp;
    }
    /**
    * @return empEmailSmtp
    */
    public String getEmpEmailSmtp(){
        return this.empEmailSmtp;
    }

    /**
    * seta o valor de empEmailLogin
    * @param pEmpEmailLogin
    */
    public void setEmpEmailLogin(String pEmpEmailLogin){
        this.empEmailLogin = pEmpEmailLogin;
    }
    /**
    * @return empEmailLogin
    */
    public String getEmpEmailLogin(){
        return this.empEmailLogin;
    }

    /**
    * seta o valor de empEmailSenha
    * @param pEmpEmailSenha
    */
    public void setEmpEmailSenha(String pEmpEmailSenha){
        this.empEmailSenha = pEmpEmailSenha;
    }
    /**
    * @return empEmailSenha
    */
    public String getEmpEmailSenha(){
        return this.empEmailSenha;
    }

    /**
    * seta o valor de empFechamentoDia
    * @param pEmpFechamentoDia
    */
    public void setEmpFechamentoDia(String pEmpFechamentoDia){
        this.empFechamentoDia = pEmpFechamentoDia;
    }
    /**
    * @return empFechamentoDia
    */
    public String getEmpFechamentoDia(){
        return this.empFechamentoDia;
    }

    /**
    * seta o valor de empStatus
    * @param pEmpStatus
    */
    public void setEmpStatus(int pEmpStatus){
        this.empStatus = pEmpStatus;
    }
    /**
    * @return empStatus
    */
    public int getEmpStatus(){
        return this.empStatus;
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

    /**
     * @return the empExpiracao
     */
    public String getEmpExpiracao() {
        return empExpiracao;
    }

    /**
     * @param empExpiracao the empExpiracao to set
     */
    public void setEmpExpiracao(String empExpiracao) {
        this.empExpiracao = empExpiracao;
    }
    
    @Override
    public String toString(){
        return "ModelEmpresa {" + "::empCod = " + this.empCod + "::empEstabelecimento = " + this.empEstabelecimento + "::empRazao = " + this.empRazao + "::empFantasia = " + this.empFantasia + "::empCnpj = " + this.empCNPJ + "::empIe = " + this.empIE + "::empQtdLicenca = " + this.empQtdLicenca + "::empExpiracao = " + this.empExpiracao + "::cadastro = " + this.cadastro + "::empEmailPop = " + this.empEmailPop + "::empEmailStatus = " + this.empEmailStatus + "::empEmailPorta = " + this.empEmailPorta + "::empEmailSmtp = " + this.empEmailSmtp + "::empEmailLogin = " + this.empEmailLogin + "::empEmailSenha = " + this.empEmailSenha + "::empFechamentoDia = " + this.empFechamentoDia + "::empStatus = " + this.empStatus +  "}";
    }
}