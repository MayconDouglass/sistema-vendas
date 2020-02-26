package DAO;

import model.ModelArea;
import Connect.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Maycon Douglas
 */
public class DAOArea extends ConexaoMySql {

    /**
     * grava Area
     *
     * @param pModelArea return int
     */
    public int salvarAreaDAO(ModelArea pModelArea) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO setarea ("
                    + "idarea,"
                    + "area_descricao,"
                    + "area_nivel,"
                    + "area_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + ") VALUES ("
                    + "'" + pModelArea.getIdarea() + "',"
                    + "'" + pModelArea.getAreaDescricao() + "',"
                    + "'" + pModelArea.getAreaNivel() + "',"
                    + "'" + pModelArea.getAreaStatus() + "',"
                    + "'" + pModelArea.getUsuariocad() + "',"
                    + "'" + pModelArea.getUsuarioalt() + "',"
                    + "'" + pModelArea.getDatacad() + "',"
                    + "'" + pModelArea.getDataalt() + "'"
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
     * Verifica se ja existe area com a descricao igual na BD
     *
     * @param pArea
     * @return
     */
    public ModelArea getAreaVerificaDuplicidadeDAO(String pArea) {
        ModelArea modelArea = new ModelArea();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "count(area_descricao)"
                    + " FROM"
                    + " setarea"
                    + " WHERE"
                    + " area_descricao = '" + pArea + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelArea.setCount(this.getResultSet().getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelArea;
    }

    /**
     * recupera Area
     *
     * @param pIdarea return ModelArea
     */
    public ModelArea getAreaDAO(int pIdarea) {
        ModelArea modelArea = new ModelArea();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idarea,"
                    + "area_descricao,"
                    + "area_nivel,"
                    + "area_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + " FROM"
                    + " setarea"
                    + " WHERE"
                    + " idarea = '" + pIdarea + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelArea.setIdarea(this.getResultSet().getInt(1));
                modelArea.setAreaDescricao(this.getResultSet().getString(2));
                modelArea.setAreaNivel(this.getResultSet().getInt(3));
                modelArea.setAreaStatus(this.getResultSet().getInt(4));
                modelArea.setUsuariocad(this.getResultSet().getString(5));
                modelArea.setUsuarioalt(this.getResultSet().getString(6));
                modelArea.setDatacad(this.getResultSet().getString(7));
                modelArea.setDataalt(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelArea;
    }

    /**
     * recupera Area
     *
     * @param ppNomeArea return ModelArea
     */
    public ModelArea getAreaNomeDAO(String pNomeArea) {
        ModelArea modelArea = new ModelArea();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idarea,"
                    + "area_descricao,"
                    + "area_nivel,"
                    + "area_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + " FROM"
                    + " setarea"
                    + " WHERE"
                    + " area_descricao = '" + pNomeArea + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelArea.setIdarea(this.getResultSet().getInt(1));
                modelArea.setAreaDescricao(this.getResultSet().getString(2));
                modelArea.setAreaNivel(this.getResultSet().getInt(3));
                modelArea.setAreaStatus(this.getResultSet().getInt(4));
                modelArea.setUsuariocad(this.getResultSet().getString(5));
                modelArea.setUsuarioalt(this.getResultSet().getString(6));
                modelArea.setDatacad(this.getResultSet().getString(7));
                modelArea.setDataalt(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelArea;
    }

    /**
     * recupera uma lista de Area return ArrayList
     */
    public ArrayList<ModelArea> getListaAreaDAO() {
        ArrayList<ModelArea> listamodelArea = new ArrayList();
        ModelArea modelArea = new ModelArea();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idarea,"
                    + "area_descricao,"
                    + "area_nivel,"
                    + "area_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + " FROM"
                    + " setarea"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelArea = new ModelArea();
                modelArea.setIdarea(this.getResultSet().getInt(1));
                modelArea.setAreaDescricao(this.getResultSet().getString(2));
                modelArea.setAreaNivel(this.getResultSet().getInt(3));
                modelArea.setAreaStatus(this.getResultSet().getInt(4));
                modelArea.setUsuariocad(this.getResultSet().getString(5));
                modelArea.setUsuarioalt(this.getResultSet().getString(6));
                modelArea.setDatacad(this.getResultSet().getString(7));
                modelArea.setDataalt(this.getResultSet().getString(8));
                listamodelArea.add(modelArea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelArea;
    }

    /**
     * recupera uma lista de Area return ArrayList 1 - ativo 0 - inativo
     */
    public ArrayList<ModelArea> getListaAreaStatusDAO(int pStatus) {
        ArrayList<ModelArea> listamodelArea = new ArrayList();
        ModelArea modelArea = new ModelArea();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idarea,"
                    + "area_descricao,"
                    + "area_nivel,"
                    + "area_status,"
                    + "usuariocad,"
                    + "usuarioalt,"
                    + "datacad,"
                    + "dataalt"
                    + " FROM"
                    + " setarea"
                    + " WHERE area_status = '" + pStatus + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelArea = new ModelArea();
                modelArea.setIdarea(this.getResultSet().getInt(1));
                modelArea.setAreaDescricao(this.getResultSet().getString(2));
                modelArea.setAreaNivel(this.getResultSet().getInt(3));
                modelArea.setAreaStatus(this.getResultSet().getInt(4));
                modelArea.setUsuariocad(this.getResultSet().getString(5));
                modelArea.setUsuarioalt(this.getResultSet().getString(6));
                modelArea.setDatacad(this.getResultSet().getString(7));
                modelArea.setDataalt(this.getResultSet().getString(8));
                listamodelArea.add(modelArea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelArea;
    }

    /**
     * atualiza Area
     *
     * @param pModelArea return boolean
     */
    public boolean atualizarAreaDAO(ModelArea pModelArea) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE setarea SET "
                    + "idarea = '" + pModelArea.getIdarea() + "',"
                    + "area_descricao = '" + pModelArea.getAreaDescricao() + "',"
                    + "area_nivel = '" + pModelArea.getAreaNivel() + "',"
                    + "area_status = '" + pModelArea.getAreaStatus() + "',"
                    + "usuarioalt = '" + pModelArea.getUsuarioalt() + "',"
                    + "dataalt = '" + pModelArea.getDataalt() + "'"
                    + " WHERE "
                    + "idarea = '" + pModelArea.getIdarea() + "'"
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
     * exclui Area
     *
     * @param pIdarea return boolean
     */
    public boolean excluirAreaDAO(int pIdarea) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM setarea "
                    + " WHERE "
                    + "idarea = '" + pIdarea + "'"
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
