package controller;

import model.ModelAcesso;
import DAO.DAOAcesso;
import java.util.ArrayList;

/**
*
* @author Maycon Douglas
*/
public class ControllerAcesso {

    private DAOAcesso daoAcesso = new DAOAcesso();

    /**
    * grava Acesso
    * @param pModelAcesso 
    * return int
    */
    public int salvarAcessoController(ModelAcesso pModelAcesso){
        return this.daoAcesso.salvarAcessoDAO(pModelAcesso);
    }

    /**
    * recupera Acesso
    * @param pIdacesso
    * return ModelAcesso
    */
    public ModelAcesso getAcessoController(int pIdacesso){
        return this.daoAcesso.getAcessoDAO(pIdacesso);
    }
    /**
    * recupera Acesso
    * @param pNomePerfil
    * @param pMenu
    * @param pIdacesso
    * return ModelAcesso
    */
    public ModelAcesso getValidarAcessoController(String pNomePerfil, String pMenu,int pIdacesso){
        return this.daoAcesso.getValidarAcessoDAO(pNomePerfil, pMenu, pIdacesso);
    }
    /**
    * recupera Acesso
    * @param pIdacesso
    * return ModelAcesso
    */
    public ModelAcesso getAcessoAlterarController(int pIdPerfil, int pIdKey, String pNome){
        return this.daoAcesso.getAcessoAlterarDAO(pIdPerfil,pIdKey,pNome);
    }

    /**
    * recupera uma lista deAcesso
    * @param pIdacesso
    * return ArrayList
    */
    public ArrayList<ModelAcesso> getListaAcessoController(){
        return this.daoAcesso.getListaAcessoDAO();
    }

    /**
    * atualiza Acesso
    * @param pModelAcesso
    * return boolean
    */
    public boolean atualizarAcessoController(ModelAcesso pModelAcesso){
        return this.daoAcesso.atualizarAcessoDAO(pModelAcesso);
    }

    /**
    * exclui Acesso
    * @param pIdacesso
    * return boolean
    */
    public boolean excluirAcessoController(int pIdacesso){
        return this.daoAcesso.excluirAcessoDAO(pIdacesso);
    }
    
    public boolean salvarListaAcessoController(ArrayList<ModelAcesso> plistaModelAcesso) {
        return this.daoAcesso.salvarListaAcessoDAO(plistaModelAcesso);
    }
    public boolean atualizarListaAcessoController(ArrayList<ModelAcesso> plistaModelAcesso) {
        return this.daoAcesso.atListaAcessoDAO(plistaModelAcesso);
    }
}