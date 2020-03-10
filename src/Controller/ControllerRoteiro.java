package controller;

import model.ModelRoteiro;
import DAO.DAORoteiro;
import java.util.ArrayList;

/**
*
* @author Maycon Douglas
*/
public class ControllerRoteiro {

    private DAORoteiro daoRoteiro = new DAORoteiro();

    /**
    * grava Roteiro
    * @param pModelRoteiro
    * @return int
    */
    public int salvarRoteiroController(ModelRoteiro pModelRoteiro){
        return this.daoRoteiro.salvarRoteiroDAO(pModelRoteiro);
    }

    /**
    * Verifica se ja existe Roteiro igual na BD
    * @param pRoteiro
    * return ModelRoteiro
    */
    public ModelRoteiro getConsultarRoteiroController(String pRoteiro,int pEmpCod){
        return this.daoRoteiro.getRoteiroVerificaDAO(pRoteiro,pEmpCod);
    }
    
    /**
    * recupera Roteiro
    * @param pIdroteiro
    * @return ModelRoteiro
    */
    public ModelRoteiro getRoteiroController(int pIdroteiro){
        return this.daoRoteiro.getRoteiroDAO(pIdroteiro);
    }
    /**
    * recupera Roteiro
    * @param pIdroteiro
    * @return ModelRoteiro
    */
    public ModelRoteiro getRoteiroEmpController(int pIdroteiro,int pEmpCod){
        return this.daoRoteiro.getRoteiroEmpDAO(pIdroteiro,pEmpCod);
    }

    /**
    * recupera uma lista deRoteiro
    * @param pIdroteiro
    * @return ArrayList
    */
    public ArrayList<ModelRoteiro> getListaRoteiroController(){
        return this.daoRoteiro.getListaRoteiroDAO();
    }
    /**
    * recupera uma lista deRoteiro
    * @param pIdroteiro
    * @return ArrayList
    */
    public ArrayList<ModelRoteiro> getListaRoteiroEmpController(int pEmpCod){
        return this.daoRoteiro.getListaRoteiroEmpDAO(pEmpCod);
    }

    /**
    * atualiza Roteiro
    * @param pModelRoteiro
    * @return boolean
    */
    public boolean atualizarRoteiroController(ModelRoteiro pModelRoteiro){
        return this.daoRoteiro.atualizarRoteiroEmpDAO(pModelRoteiro);
    }
    

    /**
    * exclui Roteiro
    * @param pIdroteiro
    * @return boolean
    */
    public boolean excluirRoteiroController(int pIdroteiro){
        return this.daoRoteiro.excluirRoteiroDAO(pIdroteiro);
    }
}