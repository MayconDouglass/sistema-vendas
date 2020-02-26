package DAO;

import model.ModelPerfil;
import Connect.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Maycon Douglas
 */
public class DAOPerfil extends ConexaoMySql {

    /**
     * grava Perfil
     *
     * @param pModelPerfil return int
     */
    public int salvarPerfilDAO(ModelPerfil pModelPerfil) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO setperfil ("
                    + "idperfil,"
                    + "per_nome,"
                    + "status"
                    + ") VALUES ("
                    + "'" + pModelPerfil.getIdperfil() + "',"
                    + "'" + pModelPerfil.getPerNome() + "',"
                    + "'" + pModelPerfil.getStatus() + "'"
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
     * recupera Perfil
     *
     * @param pIdperfil return ModelPerfil
     */
    public ModelPerfil getPerfilDAO(int pIdperfil) {
        ModelPerfil modelPerfil = new ModelPerfil();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idperfil,"
                    + "per_nome,"
                    + "status"
                    + " FROM"
                    + " setperfil"
                    + " WHERE"
                    + " idperfil = '" + pIdperfil + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelPerfil.setIdperfil(this.getResultSet().getInt(1));
                modelPerfil.setPerNome(this.getResultSet().getString(2));
                modelPerfil.setStatus(this.getResultSet().getInt(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelPerfil;
    }

    /**
     * recupera Perfil
     *
     * @param pNomePerfil return ModelPerfil
     */
    public ModelPerfil getPerfilNomeDAO(String pNomePerfil) {
        ModelPerfil modelPerfil = new ModelPerfil();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idperfil,"
                    + "per_nome,"
                    + "status"
                    + " FROM"
                    + " setperfil"
                    + " WHERE"
                    + " per_nome = '" + pNomePerfil + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelPerfil.setIdperfil(this.getResultSet().getInt(1));
                modelPerfil.setPerNome(this.getResultSet().getString(2));
                modelPerfil.setStatus(this.getResultSet().getInt(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelPerfil;
    }

    /**
     * recupera Perfil
     *
     * @param pNomePerfil return ModelPerfil
     */
    public ModelPerfil getUsuarioPerfilNomeDAO(String pNomeUsuario) {
        ModelPerfil modelPerfil = new ModelPerfil();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "a.Perfil,"
                    + "b.per_nome,"
                    + "a.login"
                    + " FROM"
                    + " setusuario a"
                    + " LEFT OUTER JOIN setperfil b"
                    + " ON b.idPerfil = a.Perfil"
                    + " WHERE"
                    + " a.login = '" + pNomeUsuario + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelPerfil.setIdperfil(this.getResultSet().getInt(1));
                modelPerfil.setPerNome(this.getResultSet().getString(2));
                modelPerfil.setUsuLogin(this.getResultSet().getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelPerfil;
    }

    /**
     * Verifica se ja existe Perfil com a descricao igual na BD
     *
     * @param pPerfil
     * @return
     */
    public ModelPerfil getPerfilVerificaDuplicidadeDAO(String pPerfil) {
        ModelPerfil modelPerfil = new ModelPerfil();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "count(per_nome),"
                    + "idperfil"
                    + " FROM"
                    + " setperfil"
                    + " WHERE"
                    + " per_nome = '" + pPerfil + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelPerfil.setCount(this.getResultSet().getInt(1));
                modelPerfil.setIdperfil(this.getResultSet().getInt(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelPerfil;
    }

    /**
     * recupera uma lista de Perfil return ArrayList
     */
    public ArrayList<ModelPerfil> getListaPerfilDAO() {
        ArrayList<ModelPerfil> listamodelPerfil = new ArrayList();
        ModelPerfil modelPerfil = new ModelPerfil();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idperfil,"
                    + "per_nome,"
                    + "status"
                    + " FROM"
                    + " setperfil"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelPerfil = new ModelPerfil();
                modelPerfil.setIdperfil(this.getResultSet().getInt(1));
                modelPerfil.setPerNome(this.getResultSet().getString(2));
                modelPerfil.setStatus(this.getResultSet().getInt(3));
                listamodelPerfil.add(modelPerfil);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelPerfil;
    }

    /**
     * recupera uma lista de Perfil return ArrayList 1 - Ativo 0 - Inativo
     */
    public ArrayList<ModelPerfil> getListaPerfilStatusDAO(int pStatus) {
        ArrayList<ModelPerfil> listamodelPerfil = new ArrayList();
        ModelPerfil modelPerfil = new ModelPerfil();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "idperfil,"
                    + "per_nome,"
                    + "status"
                    + " FROM"
                    + " setperfil"
                    + " WHERE status = '" + pStatus + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelPerfil = new ModelPerfil();
                modelPerfil.setIdperfil(this.getResultSet().getInt(1));
                modelPerfil.setPerNome(this.getResultSet().getString(2));
                modelPerfil.setStatus(this.getResultSet().getInt(3));
                listamodelPerfil.add(modelPerfil);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelPerfil;
    }

    /**
     * atualiza Perfil
     *
     * @param pModelPerfil return boolean
     */
    public boolean atualizarPerfilDAO(ModelPerfil pModelPerfil) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE setperfil SET "
                    + "per_nome = '" + pModelPerfil.getPerNome() + "',"
                    + "status = '" + pModelPerfil.getStatus() + "'"
                    + " WHERE "
                    + "idperfil = '" + pModelPerfil.getIdperfil() + "'"
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
     * exclui Perfil
     *
     * @param pIdperfil return boolean
     */
    public boolean excluirPerfilDAO(int pIdperfil) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM setperfil "
                    + " WHERE "
                    + "idperfil = '" + pIdperfil + "'"
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
