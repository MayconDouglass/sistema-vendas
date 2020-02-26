package DAO;

import model.ModelUsuario;
import Connect.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Maycon Douglas
 */
public class DAOUsuario extends ConexaoMySql {

    /**
     * grava Usuario
     *
     * @param pModelUsuario return int
     */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO setusuario ("
                    + "iduser,"
                    + "nome,"
                    + "area,"
                    + "perfil,"
                    + "email,"
                    + "login,"
                    + "senha,"
                    + "aniversario,"
                    + "status"
                    + ") VALUES ("
                    + "'" + pModelUsuario.getIduser() + "',"
                    + "'" + pModelUsuario.getNome() + "',"
                    + "'" + pModelUsuario.getArea() + "',"
                    + "'" + pModelUsuario.getPerfil() + "',"
                    + "'" + pModelUsuario.getEmail() + "',"
                    + "'" + pModelUsuario.getLogin() + "',"
                    + "'" + pModelUsuario.getSenha() + "',"
                    + "'" + pModelUsuario.getAniversario() + "',"
                    + "'" + pModelUsuario.getStatus() + "'"
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
     * recupera Usuario
     *
     * @param pIduser return ModelUsuario
     */
    public ModelUsuario getUsuarioDAO(int pIduser) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nome,"
                    + "area,"
                    + "perfil,"
                    + "email,"
                    + "login,"
                    + "senha,"
                    + "aniversario,"
                    + "status"
                    + " FROM"
                    + " setusuario"
                    + " WHERE"
                    + " iduser = '" + pIduser + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario.setIduser(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
                modelUsuario.setArea(this.getResultSet().getInt(3));
                modelUsuario.setPerfil(this.getResultSet().getInt(4));
                modelUsuario.setEmail(this.getResultSet().getString(5));
                modelUsuario.setLogin(this.getResultSet().getString(6));
                modelUsuario.setSenha(this.getResultSet().getString(7));
                modelUsuario.setAniversario(this.getResultSet().getString(8));
                modelUsuario.setStatus(this.getResultSet().getInt(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
     * recupera Usuario pelo login
     *
     * @param pLogin return ModelUsuario
     */
    public ModelUsuario getUsuarioLoginDAO(String pLogin) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nome,"
                    + "area,"
                    + "perfil,"
                    + "email,"
                    + "login,"
                    + "senha,"
                    + "aniversario,"
                    + "status"
                    + " FROM"
                    + " setusuario"
                    + " WHERE"
                    + " login = '" + pLogin + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario.setIduser(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
                modelUsuario.setArea(this.getResultSet().getInt(3));
                modelUsuario.setPerfil(this.getResultSet().getInt(4));
                modelUsuario.setEmail(this.getResultSet().getString(5));
                modelUsuario.setLogin(this.getResultSet().getString(6));
                modelUsuario.setSenha(this.getResultSet().getString(7));
                modelUsuario.setAniversario(this.getResultSet().getString(8));
                modelUsuario.setStatus(this.getResultSet().getInt(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
     * Verifica se ja existe login igual na BD
     *
     * @param pLogin
     * @return
     */
    public ModelUsuario getUsuarioVerificaLoginDAO(String pLogin) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "count(login)"
                    + " FROM"
                    + " setusuario"
                    + " WHERE"
                    + " login = '" + pLogin + "'"
                     + ";"
            );

            while (this.getResultSet().next()) {
               modelUsuario.setValidacao(this.getResultSet().getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }
    
    /**
     * Validar login e senha usuário
     *
     * @param pModelUsuario
     * @return
     */
    public boolean getValidarUsuarioDAO(ModelUsuario pModelUsuario) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nome,"
                    + "area,"
                    + "perfil,"
                    + "email,"
                    + "login,"
                    + "senha,"
                    + "aniversario,"
                    + "status"
                    + " FROM"
                    + " setusuario"
                    + " WHERE login = '" + pModelUsuario.getLogin() + "'"
                    + " AND senha = '" + pModelUsuario.getSenha() + "'"
                    + " AND status = '1'"
                    + ";"
            );
            return getResultSet().next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera uma lista de Usuario return ArrayList
     */
    public ArrayList<ModelUsuario> getListaUsuarioDAO() {
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nome,"
                    + "area,"
                    + "perfil,"
                    + "email,"
                    + "login,"
                    + "senha,"
                    + "aniversario,"
                    + "status"
                    + " FROM"
                    + " setusuario"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario = new ModelUsuario();
                modelUsuario.setIduser(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
                modelUsuario.setArea(this.getResultSet().getInt(3));
                modelUsuario.setPerfil(this.getResultSet().getInt(4));
                modelUsuario.setEmail(this.getResultSet().getString(5));
                modelUsuario.setLogin(this.getResultSet().getString(6));
                modelUsuario.setSenha(this.getResultSet().getString(7));
                modelUsuario.setAniversario(this.getResultSet().getString(8));
                modelUsuario.setStatus(this.getResultSet().getInt(9));
                listamodelUsuario.add(modelUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
     * atualiza Usuario
     *
     * @param pModelUsuario return boolean
     */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE setusuario SET "
                    + "iduser = '" + pModelUsuario.getIduser() + "',"
                    + "nome = '" + pModelUsuario.getNome() + "',"
                    + "area = '" + pModelUsuario.getArea() + "',"
                    + "perfil = '" + pModelUsuario.getPerfil() + "',"
                    + "email = '" + pModelUsuario.getEmail() + "',"
                    + "login = '" + pModelUsuario.getLogin() + "',"
                    + "senha = '" + pModelUsuario.getSenha() + "',"
                    + "aniversario = '" + pModelUsuario.getAniversario() + "',"
                    + "status = '" + pModelUsuario.getStatus() + "'"
                    + " WHERE "
                    + "iduser = '" + pModelUsuario.getIduser() + "'"
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
     * exclui Usuario
     *
     * @param pIduser return boolean
     */
    public boolean excluirUsuarioDAO(int pIduser) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM setusuario "
                    + " WHERE "
                    + "iduser = '" + pIduser + "'"
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
