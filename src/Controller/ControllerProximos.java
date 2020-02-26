package controller;

import model.ModelProximos;
import DAO.DAOProximos;
import java.util.ArrayList;

/**
*
* @author Maycon Douglas
*/
public class ControllerProximos {

    private DAOProximos daoProximos = new DAOProximos();

    /**
    * grava Proximos
    * @param pModelProximos
    * return int
    */
    public int salvarProximosController(ModelProximos pModelProximos){
        return this.daoProximos.salvarProximosDAO(pModelProximos);
    }

    /**
    * recupera Proximos
    * @param pIdkey
    * return ModelProximos
    */
    public ModelProximos getProximosController(int pIdkey){
        return this.daoProximos.getProximosDAO(pIdkey);
    }
    /**
    * recupera Proximos
    * @param pIdkey
    * @param pProximo
    * return ModelProximos
    */
    public boolean setProximosController(int pIdkey, int pProximo){
        return this.daoProximos.setProximosDAO(pIdkey, pProximo);
    }

    /**
    * recupera uma lista deProximos
    * @param pIdkey
    * return ArrayList
    */
    public ArrayList<ModelProximos> getListaProximosController(){
        return this.daoProximos.getListaProximosDAO();
    }

    /**
    * atualiza Proximos
    * @param pModelProximos
    * return boolean
    */
    public boolean atualizarProximosController(ModelProximos pModelProximos){
        return this.daoProximos.atualizarProximosDAO(pModelProximos);
    }
    /**
    * atualiza Proximos
    * @param pModelProximos
    * return boolean
    */
    public boolean atualizarSetProximosController(ModelProximos pModelProximos){
        return this.daoProximos.atualizarSetProximosDAO(pModelProximos);
    }

    /**
    * exclui Proximos
    * @param pIdkey
    * return boolean
    */
    public boolean excluirProximosController(int pIdkey){
        return this.daoProximos.excluirProximosDAO(pIdkey);
    }
}