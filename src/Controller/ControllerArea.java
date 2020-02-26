package controller;

import model.ModelArea;
import DAO.DAOArea;
import java.util.ArrayList;

/**
*
* @author Maycon Douglas
*/
public class ControllerArea {

    private DAOArea daoArea = new DAOArea(); 

    /**
    * grava Area
    * @param pModelArea
    * return int
    */
    public int salvarAreaController(ModelArea pModelArea){
        return this.daoArea.salvarAreaDAO(pModelArea);
    }

    /**
    * recupera Area
    * @param pIdarea
    * return ModelArea
    */
    public ModelArea getAreaController(int pIdarea){
        return this.daoArea.getAreaDAO(pIdarea);
    }
    /**
    * Verifica se ja existe area com a descricao igual na BD
    * @param pArea
    * return ModelArea
    */
    public ModelArea getAreaVerificaDuplicidadeController(String pArea){
        return this.daoArea.getAreaVerificaDuplicidadeDAO(pArea);
    }
    
    /**
    * recupera Area
    * @param pNomeArea
    * return ModelArea
    */
    public ModelArea getAreaNomeController(String pNomeArea){ 
        return this.daoArea.getAreaNomeDAO(pNomeArea);
    }

    /**
    * recupera uma lista deArea
    * @param pIdarea
    * return ArrayList
    */
    public ArrayList<ModelArea> getListaAreaController(){
        return this.daoArea.getListaAreaDAO();
    }
    /**
    * recupera uma lista deArea
    * @param pStatus
    * 1 - ativo
    * 0 - inativo
    * return ArrayList
    */
    public ArrayList<ModelArea> getListaAreaStatusController(int pStatus){
        return this.daoArea.getListaAreaStatusDAO(pStatus);
    }

    /**
    * atualiza Area
    * @param pModelArea
    * return boolean
    */
    public boolean atualizarAreaController(ModelArea pModelArea){
        return this.daoArea.atualizarAreaDAO(pModelArea);
    }

    /**
    * exclui Area
    * @param pIdarea
    * return boolean
    */
    public boolean excluirAreaController(int pIdarea){
        return this.daoArea.excluirAreaDAO(pIdarea);
    }
}