package controller;

import model.ModelTransportadora;
import DAO.DAOTransportadora;
import java.util.ArrayList;

/**
*
* @author Maycon Douglas
*/
public class ControllerTransportadora {

    private DAOTransportadora daoTransportadora = new DAOTransportadora();

    /**
    * grava Transportadora
    * @param pModelTransportadora
    * @return int
    */
    public int salvarTransportadoraController(ModelTransportadora pModelTransportadora){
        return this.daoTransportadora.salvarTransportadoraDAO(pModelTransportadora);
    }

    /**
    * Verifica se ja existe Transportadora igual na BD
    * @param pTransp
    * return ModelTransportadora
    */
    public ModelTransportadora getConsultarTranspController(String pTranspRaz,int pEmpCod){
        return this.daoTransportadora.getTranspVerificaDAO(pTranspRaz,pEmpCod);
    }
    
    /**
    * Verifica se ja existe Transportadora igual na BD
    * @param pTransp
    * return ModelTransportadora
    */
    public ModelTransportadora getConsultarTranspAltController(String pTranspRaz,int pEmpCod,int pTranspCod){
        return this.daoTransportadora.getTranspVerificaAltDAO(pTranspRaz,pEmpCod,pTranspCod);
    }
    
    /**
    * recupera Transportadora
    * @param pEmpCod
    * @return ModelTransportadora
    */
    public ModelTransportadora getTransportadoraController(int pEmpCod,int pTranspCod){
        return this.daoTransportadora.getTransportadoraDAO(pEmpCod,pTranspCod);
    }

    /**
    * recupera uma lista deTransportadora
    * @param pEmpCod
    * @return ArrayList
    */
    public ArrayList<ModelTransportadora> getListaTransportadoraController(int pEmpCod){
        return this.daoTransportadora.getListaTransportadoraDAO(pEmpCod);
    }

    /**
    * atualiza Transportadora
    * @param pModelTransportadora
    * @return boolean
    */
    public boolean atualizarTransportadoraController(ModelTransportadora pModelTransportadora){
        return this.daoTransportadora.atualizarTransportadoraDAO(pModelTransportadora);
    }
    /**
    * atualiza Transportadora ( sem alterar o nome )
    * @param pModelTransportadora
    * @return boolean
    */
    public boolean atualizarTransportadora2Controller(ModelTransportadora pModelTransportadora){
        return this.daoTransportadora.atualizarTransportadora2DAO(pModelTransportadora);
    }

    /**
    * exclui Transportadora
    * @param pEmpCod
    * @return boolean
    */
    public boolean excluirTransportadoraController(int pEmpCod,int pTranspCod){
        return this.daoTransportadora.excluirTransportadoraDAO(pEmpCod, pTranspCod);
    }
}