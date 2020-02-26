package DAO;

import model.ModelEmpresa;
import Connect.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Maycon Douglas
 */
public class DAOEmpresa extends ConexaoMySql {

    /**
     * grava Empresa
     *
     * @param pModelEmpresa
     * @return int
     */
    public int salvarEmpresaDAO(ModelEmpresa pModelEmpresa) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO setempresa ("
                    + "emp_cod,"
                    + "emp_estabelecimento,"
                    + "emp_razao,"
                    + "emp_fantasia,"
                    + "emp_cnpj,"
                    + "emp_ie,"
                    + "emp_qtd_licenca,"
                    + "emp_expiracao,"
                    + "emp_email_pop,"
                    + "emp_email_status,"
                    + "emp_email_porta,"
                    + "emp_email_smtp,"
                    + "emp_email_login,"
                    + "emp_email_senha,"
                    + "emp_fechamento_dia,"
                    + "emp_status"
                    + ") VALUES ("
                    + "'" + pModelEmpresa.getEmpCod() + "',"
                    + "'" + pModelEmpresa.getEmpEstabelecimento() + "',"
                    + "'" + pModelEmpresa.getEmpRazao() + "',"
                    + "'" + pModelEmpresa.getEmpFantasia() + "',"
                    + "'" + pModelEmpresa.getEmpCNPJ() + "',"
                    + "'" + pModelEmpresa.getEmpIE() + "',"
                    + "'" + pModelEmpresa.getEmpQtdLicenca() + "',"
                    + "'" + pModelEmpresa.getEmpExpiracao() + "',"
                    + "'" + pModelEmpresa.getEmpEmailPop() + "',"
                    + "'" + pModelEmpresa.getEmpEmailStatus() + "',"
                    + "'" + pModelEmpresa.getEmpEmailPorta() + "',"
                    + "'" + pModelEmpresa.getEmpEmailSmtp() + "',"
                    + "'" + pModelEmpresa.getEmpEmailLogin() + "',"
                    + "'" + pModelEmpresa.getEmpEmailSenha() + "',"
                    + "'" + pModelEmpresa.getEmpFechamentoDia() + "',"
                    + "'" + pModelEmpresa.getEmpStatus() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Empresa
     *
     * @param pEmpCod
     * @return ModelEmpresa
     */
    public ModelEmpresa getEmpresaDAO(int pEmpCod) {
        ModelEmpresa modelEmpresa = new ModelEmpresa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "emp_cod,"
                    + "emp_estabelecimento,"
                    + "emp_razao,"
                    + "emp_fantasia,"
                    + "emp_cnpj,"
                    + "emp_ie,"
                    + "emp_qtd_licenca,"
                    + "emp_expiracao,"
                    + "cadastro,"
                    + "emp_email_pop,"
                    + "emp_email_status,"
                    + "emp_email_porta,"
                    + "emp_email_smtp,"
                    + "emp_email_login,"
                    + "emp_email_senha,"
                    + "emp_fechamento_dia,"
                    + "emp_status"
                    + " FROM"
                    + " setempresa"
                    + " WHERE"
                    + " emp_cod = '" + pEmpCod + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelEmpresa.setEmpCod(this.getResultSet().getInt(1));
                modelEmpresa.setEmpEstabelecimento(this.getResultSet().getString(2));
                modelEmpresa.setEmpRazao(this.getResultSet().getString(3));
                modelEmpresa.setEmpFantasia(this.getResultSet().getString(4));
                modelEmpresa.setEmpCNPJ(this.getResultSet().getString(5));
                modelEmpresa.setEmpIE(this.getResultSet().getString(6));
                modelEmpresa.setEmpQtdLicenca(this.getResultSet().getInt(7));
                modelEmpresa.setEmpExpiracao(this.getResultSet().getString(8));
                modelEmpresa.setCadastro(this.getResultSet().getString(9));
                modelEmpresa.setEmpEmailPop(this.getResultSet().getString(10));
                modelEmpresa.setEmpEmailStatus(this.getResultSet().getInt(11));
                modelEmpresa.setEmpEmailPorta(this.getResultSet().getInt(12));
                modelEmpresa.setEmpEmailSmtp(this.getResultSet().getString(13));
                modelEmpresa.setEmpEmailLogin(this.getResultSet().getString(14));
                modelEmpresa.setEmpEmailSenha(this.getResultSet().getString(15));
                modelEmpresa.setEmpFechamentoDia(this.getResultSet().getString(16));
                modelEmpresa.setEmpStatus(this.getResultSet().getInt(17));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelEmpresa;
    }

    /**
     * Verifica se ja existe login igual na BD
     *
     * @param pLogin
     * @return
     */
    public ModelEmpresa getEmpresaCountValidationDAO(String pEmpresa) {
        ModelEmpresa modelEmpresa = new ModelEmpresa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "count(emp_razao)"
                    + " FROM"
                    + " setempresa"
                    + " WHERE"
                    + " emp_razao = '" + pEmpresa + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelEmpresa.setCount(this.getResultSet().getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelEmpresa;
    }

    /**
     * recupera uma lista de Empresa
     *
     * @return ArrayList
     */
    public ArrayList<ModelEmpresa> getListaEmpresaDAO() {
        ArrayList<ModelEmpresa> listamodelEmpresa = new ArrayList();
        ModelEmpresa modelEmpresa = new ModelEmpresa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "emp_cod,"
                    + "emp_estabelecimento,"
                    + "emp_razao,"
                    + "emp_fantasia,"
                    + "emp_cnpj,"
                    + "emp_ie,"
                    + "emp_qtd_licenca,"
                    + "emp_expiracao,"
                    + "cadastro,"
                    + "emp_email_pop,"
                    + "emp_email_status,"
                    + "emp_email_porta,"
                    + "emp_email_smtp,"
                    + "emp_email_login,"
                    + "emp_email_senha,"
                    + "emp_fechamento_dia,"
                    + "emp_status"
                    + " FROM"
                    + " setempresa"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelEmpresa = new ModelEmpresa();
                modelEmpresa.setEmpCod(this.getResultSet().getInt(1));
                modelEmpresa.setEmpEstabelecimento(this.getResultSet().getString(2));
                modelEmpresa.setEmpRazao(this.getResultSet().getString(3));
                modelEmpresa.setEmpFantasia(this.getResultSet().getString(4));
                modelEmpresa.setEmpCNPJ(this.getResultSet().getString(5));
                modelEmpresa.setEmpIE(this.getResultSet().getString(6));
                modelEmpresa.setEmpQtdLicenca(this.getResultSet().getInt(7));
                modelEmpresa.setEmpExpiracao(this.getResultSet().getString(8));
                modelEmpresa.setCadastro(this.getResultSet().getString(9));
                modelEmpresa.setEmpEmailPop(this.getResultSet().getString(10));
                modelEmpresa.setEmpEmailStatus(this.getResultSet().getInt(11));
                modelEmpresa.setEmpEmailPorta(this.getResultSet().getInt(12));
                modelEmpresa.setEmpEmailSmtp(this.getResultSet().getString(13));
                modelEmpresa.setEmpEmailLogin(this.getResultSet().getString(14));
                modelEmpresa.setEmpEmailSenha(this.getResultSet().getString(15));
                modelEmpresa.setEmpFechamentoDia(this.getResultSet().getString(16));
                modelEmpresa.setEmpStatus(this.getResultSet().getInt(17));
                listamodelEmpresa.add(modelEmpresa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelEmpresa;
    }

    /**
     * recupera uma lista de Empresa
     *
     * @return ArrayList
     */
    public ArrayList<ModelEmpresa> getListaEmpresaAtivasDAO() {
        ArrayList<ModelEmpresa> listamodelEmpresa = new ArrayList();
        ModelEmpresa modelEmpresa = new ModelEmpresa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "emp_cod,"
                    + "emp_estabelecimento,"
                    + "emp_razao,"
                    + "emp_fantasia,"
                    + "emp_cnpj,"
                    + "emp_ie,"
                    + "emp_qtd_licenca,"
                    + "emp_expiracao,"
                    + "cadastro,"
                    + "emp_email_pop,"
                    + "emp_email_status,"
                    + "emp_email_porta,"
                    + "emp_email_smtp,"
                    + "emp_email_login,"
                    + "emp_email_senha,"
                    + "emp_fechamento_dia,"
                    + "emp_status"
                    + " FROM"
                    + " setempresa"
                    + " WHERE emp_status = '1'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelEmpresa = new ModelEmpresa();
                modelEmpresa.setEmpCod(this.getResultSet().getInt(1));
                modelEmpresa.setEmpEstabelecimento(this.getResultSet().getString(2));
                modelEmpresa.setEmpRazao(this.getResultSet().getString(3));
                modelEmpresa.setEmpFantasia(this.getResultSet().getString(4));
                modelEmpresa.setEmpCNPJ(this.getResultSet().getString(5));
                modelEmpresa.setEmpIE(this.getResultSet().getString(6));
                modelEmpresa.setEmpQtdLicenca(this.getResultSet().getInt(7));
                modelEmpresa.setEmpExpiracao(this.getResultSet().getString(8));
                modelEmpresa.setCadastro(this.getResultSet().getString(9));
                modelEmpresa.setEmpEmailPop(this.getResultSet().getString(10));
                modelEmpresa.setEmpEmailStatus(this.getResultSet().getInt(11));
                modelEmpresa.setEmpEmailPorta(this.getResultSet().getInt(12));
                modelEmpresa.setEmpEmailSmtp(this.getResultSet().getString(13));
                modelEmpresa.setEmpEmailLogin(this.getResultSet().getString(14));
                modelEmpresa.setEmpEmailSenha(this.getResultSet().getString(15));
                modelEmpresa.setEmpFechamentoDia(this.getResultSet().getString(16));
                modelEmpresa.setEmpStatus(this.getResultSet().getInt(17));
                listamodelEmpresa.add(modelEmpresa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelEmpresa;
    }

    /**
     * atualiza Empresa
     *
     * @param pModelEmpresa
     * @return boolean
     */
    public boolean atualizarEmpresaDAO(ModelEmpresa pModelEmpresa) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE setempresa SET "
                    + "emp_cod = '" + pModelEmpresa.getEmpCod() + "',"
                    + "emp_estabelecimento = '" + pModelEmpresa.getEmpEstabelecimento() + "',"
                    + "emp_razao = '" + pModelEmpresa.getEmpRazao() + "',"
                    + "emp_fantasia = '" + pModelEmpresa.getEmpFantasia() + "',"
                    + "emp_cnpj = '" + pModelEmpresa.getEmpCNPJ() + "',"
                    + "emp_ie = '" + pModelEmpresa.getEmpIE() + "',"
                    + "emp_qtd_licenca = '" + pModelEmpresa.getEmpQtdLicenca() + "',"
                    + "emp_expiracao = '" + pModelEmpresa.getEmpExpiracao() + "',"
                    + "emp_email_pop = '" + pModelEmpresa.getEmpEmailPop() + "',"
                    + "emp_email_status = '" + pModelEmpresa.getEmpEmailStatus() + "',"
                    + "emp_email_porta = '" + pModelEmpresa.getEmpEmailPorta() + "',"
                    + "emp_email_smtp = '" + pModelEmpresa.getEmpEmailSmtp() + "',"
                    + "emp_email_login = '" + pModelEmpresa.getEmpEmailLogin() + "',"
                    + "emp_email_senha = '" + pModelEmpresa.getEmpEmailSenha() + "',"
                    + "emp_fechamento_dia = '" + pModelEmpresa.getEmpFechamentoDia() + "',"
                    + "emp_status = '" + pModelEmpresa.getEmpStatus() + "'"
                    + " WHERE "
                    + "emp_cod = '" + pModelEmpresa.getEmpCod() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Empresa
     *
     * @param pEmpCod
     * @return boolean
     */
    public boolean excluirEmpresaDAO(int pEmpCod) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM setempresa "
                    + " WHERE "
                    + "emp_cod = '" + pEmpCod + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
