package controller;

import model.ModelEstados;
import DAO.DAOEstados;
import java.util.ArrayList;

/**
*
* @author Maycon Douglas
*/
public class ControllerEstados {

    private DAOEstados daoEstados = new DAOEstados();

    /**
    * grava Estados
    * @param pModelEstados
    * @return int
    */
    public int salvarEstadosController(ModelEstados pModelEstados){
        return this.daoEstados.salvarEstadosDAO(pModelEstados);
    }

    /**
    * recupera Estados
    * @param pIdestado
    * @return ModelEstados
    */
    public ModelEstados getEstadosController(int pIdestado){
        return this.daoEstados.getEstadosDAO(pIdestado);
    }

    /**
    * recupera uma lista deEstados
    * @param pIdestado
    * @return ArrayList
    */
    public ArrayList<ModelEstados> getListaEstadosController(){
        return this.daoEstados.getListaEstadosDAO();
    }

    /**
    * atualiza Estados
    * @param pModelEstados
    * @return boolean
    */
    public boolean atualizarEstadosController(ModelEstados pModelEstados){
        return this.daoEstados.atualizarEstadosDAO(pModelEstados);
    }

    /**
    * exclui Estados
    * @param pIdestado
    * @return boolean
    */
    public boolean excluirEstadosController(int pIdestado){
        return this.daoEstados.excluirEstadosDAO(pIdestado);
    }
}