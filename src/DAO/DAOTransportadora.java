package DAO;

import model.ModelTransportadora;
import Connect.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Maycon Douglas
 */
public class DAOTransportadora extends ConexaoMySql {

    /**
     * grava Transportadora
     *
     * @param pModelTransportadora
     * @return int
     */
    public int salvarTransportadoraDAO(ModelTransportadora pModelTransportadora) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO comtransportadoras ("
                    + "emp_cod,"
                    + "transp_cod,"
                    + "transp_raz,"
                    + "transp_fan,"
                    + "transp_logr,"
                    + "transp_comp,"
                    + "transp_bair,"
                    + "transp_cid,"
                    + "transp_est,"
                    + "transp_cep,"
                    + "transp_pessoa,"
                    + "transp_cgccpf,"
                    + "transp_inscuf,"
                    + "transp_fone1,"
                    + "transp_fone2,"
                    + "transp_fone3,"
                    + "transp_contato,"
                    + "transp_carro,"
                    + "transp_placa,"
                    + "transp_plauf,"
                    + "transp_munic,"
                    + "email,"
                    + "observacao,"
                    + "transp_status,"
                    + "transp_numero"
                    + ") VALUES ("
                    + "'" + pModelTransportadora.getEmpCod() + "',"
                    + "'" + pModelTransportadora.getTranspCod() + "',"
                    + "'" + pModelTransportadora.getTranspRaz() + "',"
                    + "'" + pModelTransportadora.getTranspFan() + "',"
                    + "'" + pModelTransportadora.getTranspLogr() + "',"
                    + "'" + pModelTransportadora.getTranspComp() + "',"
                    + "'" + pModelTransportadora.getTranspBair() + "',"
                    + "'" + pModelTransportadora.getTranspCid() + "',"
                    + "'" + pModelTransportadora.getTranspEst() + "',"
                    + "'" + pModelTransportadora.getTranspCep() + "',"
                    + "'" + pModelTransportadora.getTranspPessoa() + "',"
                    + "'" + pModelTransportadora.getTranspCgccpf() + "',"
                    + "'" + pModelTransportadora.getTranspInscuf() + "',"
                    + "'" + pModelTransportadora.getTranspFone1() + "',"
                    + "'" + pModelTransportadora.getTranspFone2() + "',"
                    + "'" + pModelTransportadora.getTranspFone3() + "',"
                    + "'" + pModelTransportadora.getTranspContato() + "',"
                    + "'" + pModelTransportadora.getTranspCarro() + "',"
                    + "'" + pModelTransportadora.getTranspPlaca() + "',"
                    + "'" + pModelTransportadora.getTranspPlacauf() + "',"
                    + "'" + pModelTransportadora.getTranspMunic() + "',"
                    + "'" + pModelTransportadora.getEmail() + "',"
                    + "'" + pModelTransportadora.getObservacao() + "',"
                    + "'" + pModelTransportadora.getTranspStatus() + "',"
                    + "'" + pModelTransportadora.getTranspNumero()+ "'"
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
     * recupera Transportadora
     *
     * @param pEmpCod
     * @return ModelTransportadora
     */
    public ModelTransportadora getTransportadoraDAO(int pEmpCod, int pTranspCod) {
        ModelTransportadora modelTransportadora = new ModelTransportadora();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "emp_cod,"
                    + "transp_cod,"
                    + "transp_raz,"
                    + "transp_fan,"
                    + "transp_logr,"
                    + "transp_comp,"
                    + "transp_bair,"
                    + "transp_cid,"
                    + "transp_est,"
                    + "transp_cep,"
                    + "transp_pessoa,"
                    + "transp_cgccpf,"
                    + "transp_inscuf,"
                    + "transp_fone1,"
                    + "transp_fone2,"
                    + "transp_fone3,"
                    + "transp_contato,"
                    + "transp_carro,"
                    + "transp_placa,"
                    + "transp_plauf,"
                    + "transp_munic,"
                    + "email,"
                    + "observacao,"
                    + "transp_status,"
                    + "transp_numero"
                    + " FROM"
                    + " comtransportadoras"
                    + " WHERE"
                    + " emp_cod = '" + pEmpCod + "'"
                    + " AND transp_cod = '" + pTranspCod + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelTransportadora.setEmpCod(this.getResultSet().getInt(1));
                modelTransportadora.setTranspCod(this.getResultSet().getInt(2));
                modelTransportadora.setTranspRaz(this.getResultSet().getString(3));
                modelTransportadora.setTranspFan(this.getResultSet().getString(4));
                modelTransportadora.setTranspLogr(this.getResultSet().getString(5));
                modelTransportadora.setTranspComp(this.getResultSet().getString(6));
                modelTransportadora.setTranspBair(this.getResultSet().getString(7));
                modelTransportadora.setTranspCid(this.getResultSet().getInt(8));
                modelTransportadora.setTranspEst(this.getResultSet().getInt(9));
                modelTransportadora.setTranspCep(this.getResultSet().getString(10));
                modelTransportadora.setTranspPessoa(this.getResultSet().getString(11));
                modelTransportadora.setTranspCgccpf(this.getResultSet().getString(12));
                modelTransportadora.setTranspInscuf(this.getResultSet().getString(13));
                modelTransportadora.setTranspFone1(this.getResultSet().getString(14));
                modelTransportadora.setTranspFone2(this.getResultSet().getString(15));
                modelTransportadora.setTranspFone3(this.getResultSet().getString(16));
                modelTransportadora.setTranspContato(this.getResultSet().getString(17));
                modelTransportadora.setTranspCarro(this.getResultSet().getString(18));
                modelTransportadora.setTranspPlaca(this.getResultSet().getString(19));
                modelTransportadora.setTranspPlacauf(this.getResultSet().getString(20));
                modelTransportadora.setTranspMunic(this.getResultSet().getString(21));
                modelTransportadora.setEmail(this.getResultSet().getString(22));
                modelTransportadora.setObservacao(this.getResultSet().getString(23));
                modelTransportadora.setTranspStatus(this.getResultSet().getInt(24));
                modelTransportadora.setTranspNumero(this.getResultSet().getInt(25));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelTransportadora;
    }

    /**
     * Verifica se ja existe Transportadora igual na BD
     *
     * @param pTransp
     * @param pEmpCod 
     * @return
     */
    public ModelTransportadora getTranspVerificaDAO(String pTransp, int pEmpCod) {
        ModelTransportadora modelTransportadora = new ModelTransportadora();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "count(transp_raz)"
                    + " FROM"
                    + " comtransportadoras"
                    + " WHERE"
                    + " transp_raz = '" + pTransp + "'"
                    + " AND emp_cod = '" + pEmpCod + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelTransportadora.setCount(this.getResultSet().getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelTransportadora;
    }

    /**
     * recupera uma lista de Transportadora
     *
     * @return ArrayList
     */
    public ArrayList<ModelTransportadora> getListaTransportadoraDAO(int pEmpCod) {
        ArrayList<ModelTransportadora> listamodelTransportadora = new ArrayList();
        ModelTransportadora modelTransportadora = new ModelTransportadora();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "emp_cod,"
                    + "transp_cod,"
                    + "transp_raz,"
                    + "transp_fan,"
                    + "transp_logr,"
                    + "transp_comp,"
                    + "transp_bair,"
                    + "transp_cid,"
                    + "transp_est,"
                    + "transp_cep,"
                    + "transp_pessoa,"
                    + "transp_cgccpf,"
                    + "transp_inscuf,"
                    + "transp_fone1,"
                    + "transp_fone2,"
                    + "transp_fone3,"
                    + "transp_contato,"
                    + "transp_carro,"
                    + "transp_placa,"
                    + "transp_plauf,"
                    + "transp_munic,"
                    + "email,"
                    + "observacao,"
                    + "transp_status"
                    + " FROM"
                    + " comtransportadoras"
                    + " WHERE emp_cod = '" + pEmpCod + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelTransportadora = new ModelTransportadora();
                modelTransportadora.setEmpCod(this.getResultSet().getInt(1));
                modelTransportadora.setTranspCod(this.getResultSet().getInt(2));
                modelTransportadora.setTranspRaz(this.getResultSet().getString(3));
                modelTransportadora.setTranspFan(this.getResultSet().getString(4));
                modelTransportadora.setTranspLogr(this.getResultSet().getString(5));
                modelTransportadora.setTranspComp(this.getResultSet().getString(6));
                modelTransportadora.setTranspBair(this.getResultSet().getString(7));
                modelTransportadora.setTranspCid(this.getResultSet().getInt(8));
                modelTransportadora.setTranspEst(this.getResultSet().getInt(9));
                modelTransportadora.setTranspCep(this.getResultSet().getString(10));
                modelTransportadora.setTranspPessoa(this.getResultSet().getString(11));
                modelTransportadora.setTranspCgccpf(this.getResultSet().getString(12));
                modelTransportadora.setTranspInscuf(this.getResultSet().getString(13));
                modelTransportadora.setTranspFone1(this.getResultSet().getString(14));
                modelTransportadora.setTranspFone2(this.getResultSet().getString(15));
                modelTransportadora.setTranspFone3(this.getResultSet().getString(16));
                modelTransportadora.setTranspContato(this.getResultSet().getString(17));
                modelTransportadora.setTranspCarro(this.getResultSet().getString(18));
                modelTransportadora.setTranspPlaca(this.getResultSet().getString(19));
                modelTransportadora.setTranspPlacauf(this.getResultSet().getString(20));
                modelTransportadora.setTranspMunic(this.getResultSet().getString(21));
                modelTransportadora.setEmail(this.getResultSet().getString(22));
                modelTransportadora.setObservacao(this.getResultSet().getString(23));
                modelTransportadora.setTranspStatus(this.getResultSet().getInt(24));
                listamodelTransportadora.add(modelTransportadora);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelTransportadora;
    }

    /**
     * atualiza Transportadora
     *
     * @param pModelTransportadora
     * @return boolean
     */
    public boolean atualizarTransportadoraDAO(ModelTransportadora pModelTransportadora) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE comtransportadoras SET "
                    + "emp_cod = '" + pModelTransportadora.getEmpCod() + "',"
                    + "transp_cod = '" + pModelTransportadora.getTranspCod() + "',"
                    + "transp_raz = '" + pModelTransportadora.getTranspRaz() + "',"
                    + "transp_fan = '" + pModelTransportadora.getTranspFan() + "',"
                    + "transp_logr = '" + pModelTransportadora.getTranspLogr() + "',"
                    + "transp_numero = '" + pModelTransportadora.getTranspNumero()+ "',"
                    + "transp_comp = '" + pModelTransportadora.getTranspComp() + "',"
                    + "transp_bair = '" + pModelTransportadora.getTranspBair() + "',"
                    + "transp_cid = '" + pModelTransportadora.getTranspCid() + "',"
                    + "transp_est = '" + pModelTransportadora.getTranspEst() + "',"
                    + "transp_cep = '" + pModelTransportadora.getTranspCep() + "',"
                    + "transp_pessoa = '" + pModelTransportadora.getTranspPessoa() + "',"
                    + "transp_cgccpf = '" + pModelTransportadora.getTranspCgccpf() + "',"
                    + "transp_inscuf = '" + pModelTransportadora.getTranspInscuf() + "',"
                    + "transp_fone1 = '" + pModelTransportadora.getTranspFone1() + "',"
                    + "transp_fone2 = '" + pModelTransportadora.getTranspFone2() + "',"
                    + "transp_fone3 = '" + pModelTransportadora.getTranspFone3() + "',"
                    + "transp_contato = '" + pModelTransportadora.getTranspContato() + "',"
                    + "transp_carro = '" + pModelTransportadora.getTranspCarro() + "',"
                    + "transp_placa = '" + pModelTransportadora.getTranspPlaca() + "',"
                    + "transp_plauf = '" + pModelTransportadora.getTranspPlacauf() + "',"
                    + "transp_munic = '" + pModelTransportadora.getTranspMunic() + "',"
                    + "email = '" + pModelTransportadora.getEmail() + "',"
                    + "observacao = '" + pModelTransportadora.getObservacao() + "',"
                    + "transp_status = '" + pModelTransportadora.getTranspStatus() + "'"
                    + " WHERE "
                    + "emp_cod = '" + pModelTransportadora.getEmpCod() + "'"
                    + " AND transp_cod = '" + pModelTransportadora.getTranspCod() + "'"
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
     * exclui Transportadora
     *
     * @param pEmpCod
     * @return boolean
     */
    public boolean excluirTransportadoraDAO(int pEmpCod, int pTranspCod) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM comtransportadoras "
                    + " WHERE "
                    + "emp_cod = '" + pEmpCod + "'"
                    + " AND transp_cod = '" + pTranspCod + "'"
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
