package DAO;

import model.ModelRoteiro;
import Connect.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Maycon Douglas
 */
public class DAORoteiro extends ConexaoMySql {

    /**
     * grava Roteiro
     *
     * @param pModelRoteiro
     * @return int
     */
    public int salvarRoteiroDAO(ModelRoteiro pModelRoteiro) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO cliroteiro ("
                    + "idroteiro,"
                    + "empcod,"
                    + "rot_desc,"
                    + "transp_padrao,"
                    + "rot_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + ") VALUES ("
                    + "'" + pModelRoteiro.getIdroteiro() + "',"
                    + "'" + pModelRoteiro.getEmpcod() + "',"
                    + "'" + pModelRoteiro.getRotDesc() + "',"
                    + "'" + pModelRoteiro.getTranspPadrao() + "',"
                    + "'" + pModelRoteiro.getRotStatus() + "',"
                    + "'" + pModelRoteiro.getUsuariocad() + "',"
                    + "'" + pModelRoteiro.getUsuarioalt() + "',"
                    + "'" + pModelRoteiro.getDatacad() + "',"
                    + "'" + pModelRoteiro.getDataalt() + "'"
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
     * recupera Roteiro
     *
     * @param pIdroteiro
     * @return ModelRoteiro
     */
    public ModelRoteiro getRoteiroDAO(int pIdroteiro) {
        ModelRoteiro modelRoteiro = new ModelRoteiro();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idroteiro,"
                    + "empcod,"
                    + "rot_desc,"
                    + "transp_padrao,"
                    + "rot_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + " FROM"
                    + " cliroteiro"
                    + " WHERE"
                    + " idroteiro = '" + pIdroteiro + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelRoteiro.setIdroteiro(this.getResultSet().getInt(1));
                modelRoteiro.setEmpcod(this.getResultSet().getInt(2));
                modelRoteiro.setRotDesc(this.getResultSet().getString(3));
                modelRoteiro.setTranspPadrao(this.getResultSet().getInt(4));
                modelRoteiro.setRotStatus(this.getResultSet().getInt(5));
                modelRoteiro.setUsuariocad(this.getResultSet().getString(6));
                modelRoteiro.setUsuarioalt(this.getResultSet().getString(7));
                modelRoteiro.setDatacad(this.getResultSet().getString(8));
                modelRoteiro.setDataalt(this.getResultSet().getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelRoteiro;
    }

    /**
     * recupera Roteiro da empresa
     *
     * @param pIdroteiro
     * @param pEmpCod
     * @return ModelRoteiro
     */
    public ModelRoteiro getRoteiroEmpDAO(int pIdroteiro, int pEmpCod) {
        ModelRoteiro modelRoteiro = new ModelRoteiro();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idroteiro,"
                    + "empcod,"
                    + "rot_desc,"
                    + "transp_padrao,"
                    + "rot_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + " FROM"
                    + " cliroteiro"
                    + " WHERE"
                    + " idroteiro = '" + pIdroteiro + "'"
                    + " AND"
                    + " empcod = '" + pEmpCod + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelRoteiro.setIdroteiro(this.getResultSet().getInt(1));
                modelRoteiro.setEmpcod(this.getResultSet().getInt(2));
                modelRoteiro.setRotDesc(this.getResultSet().getString(3));
                modelRoteiro.setTranspPadrao(this.getResultSet().getInt(4));
                modelRoteiro.setRotStatus(this.getResultSet().getInt(5));
                modelRoteiro.setUsuariocad(this.getResultSet().getString(6));
                modelRoteiro.setUsuarioalt(this.getResultSet().getString(7));
                modelRoteiro.setDatacad(this.getResultSet().getString(8));
                modelRoteiro.setDataalt(this.getResultSet().getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelRoteiro;
    }

    /**
     * Verifica se ja existe Roteiro igual na BD
     *
     * @param pRoteiro
     * @param pEmpCod
     * @return
     */
    public ModelRoteiro getRoteiroVerificaDAO(String pRoteiro, int pEmpCod) {
        ModelRoteiro modelRoteiro = new ModelRoteiro();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "count(idRoteiro)"
                    + " FROM"
                    + " cliroteiro"
                    + " WHERE"
                    + " rot_desc = '" + pRoteiro + "'"
                    + " AND empcod = '" + pEmpCod + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelRoteiro.setCount(this.getResultSet().getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelRoteiro;
    }

    /**
     * recupera uma lista de Roteiro
     *
     * @return ArrayList
     */
    public ArrayList<ModelRoteiro> getListaRoteiroDAO() {
        ArrayList<ModelRoteiro> listamodelRoteiro = new ArrayList();
        ModelRoteiro modelRoteiro = new ModelRoteiro();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idroteiro,"
                    + "empcod,"
                    + "rot_desc,"
                    + "transp_padrao,"
                    + "rot_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + " FROM"
                    + " cliroteiro"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelRoteiro = new ModelRoteiro();
                modelRoteiro.setIdroteiro(this.getResultSet().getInt(1));
                modelRoteiro.setEmpcod(this.getResultSet().getInt(2));
                modelRoteiro.setRotDesc(this.getResultSet().getString(3));
                modelRoteiro.setTranspPadrao(this.getResultSet().getInt(4));
                modelRoteiro.setRotStatus(this.getResultSet().getInt(5));
                modelRoteiro.setUsuariocad(this.getResultSet().getString(6));
                modelRoteiro.setUsuarioalt(this.getResultSet().getString(7));
                modelRoteiro.setDatacad(this.getResultSet().getString(8));
                modelRoteiro.setDataalt(this.getResultSet().getString(9));
                listamodelRoteiro.add(modelRoteiro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelRoteiro;
    }

    /**
     * recupera uma lista de Roteiro
     *
     * @return ArrayList
     */
    public ArrayList<ModelRoteiro> getListaRoteiroEmpDAO(int pEmpCod) {
        ArrayList<ModelRoteiro> listamodelRoteiro = new ArrayList();
        ModelRoteiro modelRoteiro;
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idroteiro,"
                    + "empcod,"
                    + "rot_desc,"
                    + "transp_padrao,"
                    + "rot_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + " FROM"
                    + " cliroteiro"
                    + " WHERE "
                    + "empcod = '" + pEmpCod + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelRoteiro = new ModelRoteiro();
                modelRoteiro.setIdroteiro(this.getResultSet().getInt(1));
                modelRoteiro.setEmpcod(this.getResultSet().getInt(2));
                modelRoteiro.setRotDesc(this.getResultSet().getString(3));
                modelRoteiro.setTranspPadrao(this.getResultSet().getInt(4));
                modelRoteiro.setRotStatus(this.getResultSet().getInt(5));
                modelRoteiro.setUsuariocad(this.getResultSet().getString(6));
                modelRoteiro.setUsuarioalt(this.getResultSet().getString(7));
                modelRoteiro.setDatacad(this.getResultSet().getString(8));
                modelRoteiro.setDataalt(this.getResultSet().getString(9));
                listamodelRoteiro.add(modelRoteiro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelRoteiro;
    }

    /**
     * atualiza Roteiro
     *
     * @param pModelRoteiro
     * @return boolean
     */
    public boolean atualizarRoteiroEmpDAO(ModelRoteiro pModelRoteiro) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE cliroteiro SET "
                    + "idroteiro = '" + pModelRoteiro.getIdroteiro() + "',"
                    + "empcod = '" + pModelRoteiro.getEmpcod() + "',"
                    + "rot_desc = '" + pModelRoteiro.getRotDesc() + "',"
                    + "transp_padrao = '" + pModelRoteiro.getTranspPadrao() + "',"
                    + "rot_status = '" + pModelRoteiro.getRotStatus() + "',"
                    + "usuarioalt = '" + pModelRoteiro.getUsuarioalt() + "',"
                    + "dataalt = '" + pModelRoteiro.getDataalt() + "'"
                    + " WHERE "
                    + "idroteiro = '" + pModelRoteiro.getIdroteiro() + "'"
                    + " AND "
                    + "empcod = '" + pModelRoteiro.getEmpcod() + "'"
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
     * exclui Roteiro
     *
     * @param pIdroteiro
     * @return boolean
     */
    public boolean excluirRoteiroDAO(int pIdroteiro) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM cliroteiro "
                    + " WHERE "
                    + "idroteiro = '" + pIdroteiro + "'"
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
