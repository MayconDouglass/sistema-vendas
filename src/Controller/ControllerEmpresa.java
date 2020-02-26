package controller;

import model.ModelEmpresa;
import DAO.DAOEmpresa;
import java.util.ArrayList; 

/**
*
* @author Maycon Douglas
*/
public class ControllerEmpresa {

    private DAOEmpresa daoEmpresa = new DAOEmpresa();

    /**
    * grava Empresa
    * @param pModelEmpresa
    * @return int
    */
    public int salvarEmpresaController(ModelEmpresa pModelEmpresa){
        return this.daoEmpresa.salvarEmpresaDAO(pModelEmpresa);
    }

    /**
    * recupera Empresa
    * @param pEmpCod
    * @return ModelEmpresa
    */
    public ModelEmpresa getEmpresaController(int pEmpCod){
        return this.daoEmpresa.getEmpresaDAO(pEmpCod);
    }
    /**
    * Valida existencia de empresa com a mesma razao social no sistema
    * @param pRazaoSocial 
    * @return ModelEmpresa
    */
    public ModelEmpresa getValidarEmpresaController(String pRazaoSocial){
        return this.daoEmpresa.getEmpresaCountValidationDAO(pRazaoSocial);
    }

    /**
    * recupera uma lista deEmpresa
    * @param pEmpCod
    * @return ArrayList
    */
    public ArrayList<ModelEmpresa> getListaEmpresaController(){
        return this.daoEmpresa.getListaEmpresaDAO();
    }
    /**
    * recupera uma lista deEmpresa ativas
    * @param pEmpCod
    * @return ArrayList
    */
    public ArrayList<ModelEmpresa> getListaEmpresaAtivasController(){
        return this.daoEmpresa.getListaEmpresaAtivasDAO();
    }

    /**
    * atualiza Empresa
    * @param pModelEmpresa
    * @return boolean
    */
    public boolean atualizarEmpresaController(ModelEmpresa pModelEmpresa){
        return this.daoEmpresa.atualizarEmpresaDAO(pModelEmpresa);
    }

    /**
    * exclui Empresa
    * @param pEmpCod
    * @return boolean
    */
    public boolean excluirEmpresaController(int pEmpCod){
        return this.daoEmpresa.excluirEmpresaDAO(pEmpCod);
    }
}