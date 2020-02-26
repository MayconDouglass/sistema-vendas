package DAO;

import model.ModelAcesso;
import Connect.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Maycon Douglas
 */
public class DAOAcesso extends ConexaoMySql {

    /**
     * grava Acesso
     *
     * @param pModelAcesso return int
     */
    public int salvarAcessoDAO(ModelAcesso pModelAcesso) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO setacesso ("
                    + "idacesso,"
                    + "idperfil,"
                    + "nome,"
                    + "idkey,"
                    + "auth"
                    + ") VALUES ("
                    + "'" + pModelAcesso.getIdacesso() + "',"
                    + "'" + pModelAcesso.getIdperfil() + "',"
                    + "'" + pModelAcesso.getNome() + "',"
                    + "'" + pModelAcesso.getIdkey() + "',"
                    + "'" + pModelAcesso.getAuth() + "'"
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
     * recupera Acesso
     *
     * @param pIdacesso return ModelAcesso
     */
    public ModelAcesso getAcessoAlterarDAO(int pIdPerfil, int pIdKey, String pNome) {
        ModelAcesso modelAcesso = new ModelAcesso();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idacesso,"
                    + "idperfil,"
                    + "nome,"
                    + "idkey,"
                    + "auth"
                    + " FROM"
                    + " setacesso"
                    + " WHERE"
                    + " idkey = '" + pIdKey + "'"
                    + " AND idperfil = '" + pIdPerfil + "'"
                    + " AND nome = '" + pNome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAcesso.setIdacesso(this.getResultSet().getInt(1));
                modelAcesso.setIdperfil(this.getResultSet().getInt(2));
                modelAcesso.setNome(this.getResultSet().getString(3));
                modelAcesso.setIdkey(this.getResultSet().getString(4));
                modelAcesso.setAuth(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelAcesso;
    }

    /**
     * recupera Acesso
     *
     * @param pIdacesso return ModelAcesso
     */
    public ModelAcesso getAcessoDAO(int pIdacesso) {
        ModelAcesso modelAcesso = new ModelAcesso();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idacesso,"
                    + "idperfil,"
                    + "nome,"
                    + "idkey,"
                    + "auth"
                    + " FROM"
                    + " setacesso"
                    + " WHERE"
                    + " idacesso = '" + pIdacesso + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAcesso.setIdacesso(this.getResultSet().getInt(1));
                modelAcesso.setIdperfil(this.getResultSet().getInt(2));
                modelAcesso.setNome(this.getResultSet().getString(3));
                modelAcesso.setIdkey(this.getResultSet().getString(4));
                modelAcesso.setAuth(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelAcesso;
    }

    /**
     * recupera Acesso
     *
     * @param pNomePerfil return ModelAcesso
     * @param pMenu return ModelAcess
     * @param pIdKey return ModelAcess
     */
    public ModelAcesso getValidarAcessoDAO(String pNomePerfil, String pMenu, int pIdKey) {
        ModelAcesso modelAcesso = new ModelAcesso();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "a.idacesso,"
                    + "a.idperfil,"
                    + "a.nome,"
                    + "a.idkey,"
                    + "a.auth"
                    + " FROM setacesso a"
                    + " LEFT OUTER JOIN setperfil b"
                    + " ON b.idPerfil = a.idPerfil"
                    + " WHERE b.Per_Nome = '" + pNomePerfil + "'"
                    + " AND a.nome = '" + pMenu + "'"
                    + " AND a.idkey = '" + pIdKey + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAcesso.setIdacesso(this.getResultSet().getInt(1));
                modelAcesso.setIdperfil(this.getResultSet().getInt(2));
                modelAcesso.setNome(this.getResultSet().getString(3));
                modelAcesso.setIdkey(this.getResultSet().getString(4));
                modelAcesso.setAuth(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelAcesso;
    }

    /**
     * recupera uma lista de Acesso return ArrayList
     */
    public ArrayList<ModelAcesso> getListaAcessoDAO() {
        ArrayList<ModelAcesso> listamodelAcesso = new ArrayList();
        ModelAcesso modelAcesso = new ModelAcesso();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idacesso,"
                    + "idperfil,"
                    + "nome,"
                    + "idkey,"
                    + "auth"
                    + " FROM"
                    + " setacesso"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAcesso = new ModelAcesso();
                modelAcesso.setIdacesso(this.getResultSet().getInt(1));
                modelAcesso.setIdperfil(this.getResultSet().getInt(2));
                modelAcesso.setNome(this.getResultSet().getString(3));
                modelAcesso.setIdkey(this.getResultSet().getString(4));
                modelAcesso.setAuth(this.getResultSet().getInt(5));
                listamodelAcesso.add(modelAcesso);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelAcesso;
    }

    /**
     * atualiza Acesso
     *
     * @param pModelAcesso return boolean
     */
    public boolean atualizarAcessoDAO(ModelAcesso pModelAcesso) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE setacesso SET "
                    + "idacesso = '" + pModelAcesso.getIdacesso() + "',"
                    + "idperfil = '" + pModelAcesso.getIdperfil() + "',"
                    + "nome = '" + pModelAcesso.getNome() + "',"
                    + "idkey = '" + pModelAcesso.getIdkey() + "',"
                    + "auth = '" + pModelAcesso.getAuth() + "'"
                    + " WHERE "
                    + "idacesso = '" + pModelAcesso.getIdacesso() + "'"
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
     * exclui Acesso
     *
     * @param pIdacesso return boolean
     */
    public boolean excluirAcessoDAO(int pIdacesso) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM setacesso "
                    + " WHERE "
                    + "idacesso = '" + pIdacesso + "'"
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
     * exclui Acesso
     *
     * @param pIdacesso return boolean
     */
    public boolean excluirAcessoPerfilAcessoDAO(int pIdPerfil) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM setacesso "
                    + " WHERE "
                    + "idperfil = '" + pIdPerfil + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean salvarListaAcessoDAO(ArrayList<ModelAcesso> plistaModelAcesso) {
        try {
            this.conectar();
            int cont = plistaModelAcesso.size();
            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                        "INSERT INTO setacesso ("
                        + "idperfil,"
                        + "nome,"
                        + "idkey,"
                        + "auth"
                        + ") VALUES ("
                        + "'" + plistaModelAcesso.get(i).getIdperfil() + "',"
                        + "'" + plistaModelAcesso.get(i).getNome() + "',"
                        + "'" + plistaModelAcesso.get(i).getIdkey() + "',"
                        + "'" + plistaModelAcesso.get(i).getAuth() + "'"
                        + ");"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean atListaAcessoDAO(ArrayList<ModelAcesso> plistaModelAcesso) {
        try {
            this.conectar();
            int cont = plistaModelAcesso.size();
            for (int i = 0; i < cont; i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE `setacesso` SET `Auth` = '" + plistaModelAcesso.get(i).getAuth() + "'"
                        + " WHERE idPerfil = '" + plistaModelAcesso.get(i).getIdperfil() + "'"
                        + " AND nome = '" + plistaModelAcesso.get(i).getNome() + "'"
                        + " AND idkey = '" + plistaModelAcesso.get(i).getIdkey() + "'"
                        + ";"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * atualiza Acesso
     *
     * @param pModelAcesso return boolean
     */
    public boolean atualizarListaAcessoDAO(ArrayList<ModelAcesso> plistaModelAcesso) {
        try {
            this.conectar();
            int cont = plistaModelAcesso.size();
            for (int i = 0; i < cont; i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE setacesso"
                        + "SET auth = '" + plistaModelAcesso.get(i).getAuth() + "'"
                        + " idacesso = '" + plistaModelAcesso.get(i).getIdacesso() + "'"
                        + " WHERE idperfil = '" + plistaModelAcesso.get(i).getIdperfil() + "'"
                        + " AND nome = '" + plistaModelAcesso.get(i).getNome() + "'"
                        + " AND idkey = = '" + plistaModelAcesso.get(i).getIdkey() + "'"
                        + ";"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
