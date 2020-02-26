package controller;

import model.ModelUsuario;
import DAO.DAOUsuario;
import java.util.ArrayList;

/**
*
* @author Maycon Douglas
*/
public class ControllerUsuario {

    private DAOUsuario daoUsuario = new DAOUsuario();

    /**
    * grava Usuario
    * @param pModelUsuario
    * return int
    */
    public int salvarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pIduser
    * return ModelUsuario
    */
    public ModelUsuario getUsuarioController(int pIduser){
        return this.daoUsuario.getUsuarioDAO(pIduser);
    }
    
    /**
    * recupera Usuario
    * @param pLogin
    * return ModelUsuario
    */
    public ModelUsuario getUsuarioLoginController(String pLogin){
        return this.daoUsuario.getUsuarioLoginDAO(pLogin);
    }
    
    /**
    * Verifica se ja existe login igual na BD
    * @param pLogin
    * return ModelUsuario
    */
    public ModelUsuario getConsultarLoginController(String pLogin){
        return this.daoUsuario.getUsuarioVerificaLoginDAO(pLogin);
    }

     /**
     * Validar login e senha usuário
     *
     * @param pModelUsuario
     * @return
     */
    public boolean getValidarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.getValidarUsuarioDAO(pModelUsuario);
    }
    
    /**
    * recupera uma lista deUsuario
    * @param pIduser
    * return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioController(){
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * return boolean
    */
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * exclui Usuario
    * @param pIduser
    * return boolean
    */
    public boolean excluirUsuarioController(int pIduser){
        return this.daoUsuario.excluirUsuarioDAO(pIduser);
    }
}