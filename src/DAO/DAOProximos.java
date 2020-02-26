package DAO;

import model.ModelProximos;
import Connect.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Maycon Douglas
 */
public class DAOProximos extends ConexaoMySql {

    /**
     * grava Proximos
     *
     * @param pModelProximos return int
     */
    public int salvarProximosDAO(ModelProximos pModelProximos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO setproximos ("
                    + "idkey,"
                    + "descricao,"
                    + "proximo"
                    + ") VALUES ("
                    + "'" + pModelProximos.getIdkey() + "',"
                    + "'" + pModelProximos.getDescricao() + "',"
                    + "'" + pModelProximos.getProximo() + "'"
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
     * recupera Proximos
     *
     * @param pIdkey return ModelProximos
     */
    public ModelProximos getProximosDAO(int pIdkey) {
        ModelProximos modelProximos = new ModelProximos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idkey,"
                    + "descricao,"
                    + "proximo"
                    + " FROM"
                    + " setproximos"
                    + " WHERE"
                    + " idkey = '" + pIdkey + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProximos.setIdkey(this.getResultSet().getInt(1));
                modelProximos.setDescricao(this.getResultSet().getString(2));
                modelProximos.setProximo(this.getResultSet().getInt(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProximos;
    }

    /**
     * recupera Proximos
     *
     * @param pIdkey return ModelProximos
     * @param pProximo return ModelProximos
     */
    public boolean setProximosDAO(int pIdkey, int pProximo) {
        ModelProximos modelProximos = new ModelProximos();
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE setproximos "
                    + "SET proximo='" + pProximo + "'"
                    + " WHERE"
                    + " idkey = '" + pIdkey + "'"
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
     * recupera uma lista de Proximos return ArrayList
     */
    public ArrayList<ModelProximos> getListaProximosDAO() {
        ArrayList<ModelProximos> listamodelProximos = new ArrayList();
        ModelProximos modelProximos = new ModelProximos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idkey,"
                    + "descricao,"
                    + "proximo"
                    + " FROM"
                    + " setproximos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProximos = new ModelProximos();
                modelProximos.setIdkey(this.getResultSet().getInt(1));
                modelProximos.setDescricao(this.getResultSet().getString(2));
                modelProximos.setProximo(this.getResultSet().getInt(3));
                listamodelProximos.add(modelProximos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProximos;
    }

    /**
     * atualiza Proximos
     *
     * @param pModelProximos return boolean
     */
    public boolean atualizarProximosDAO(ModelProximos pModelProximos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE setproximos SET "
                    + "idkey = '" + pModelProximos.getIdkey() + "',"
                    + "descricao = '" + pModelProximos.getDescricao() + "',"
                    + "proximo = '" + pModelProximos.getProximo() + "'"
                    + " WHERE "
                    + "idkey = '" + pModelProximos.getIdkey() + "'"
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
     * atualiza Proximos
     *
     * @param pModelProximos return boolean
     */
    public boolean atualizarSetProximosDAO(ModelProximos pModelProximos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE setproximos SET "
                    + "proximo = '" + pModelProximos.getProximo() + "'"
                    + " WHERE "
                    + "idkey = '" + pModelProximos.getIdkey() + "'"
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
     * exclui Proximos
     *
     * @param pIdkey return boolean
     */
    public boolean excluirProximosDAO(int pIdkey) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM setproximos "
                    + " WHERE "
                    + "idkey = '" + pIdkey + "'"
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
