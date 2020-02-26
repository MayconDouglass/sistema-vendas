package controller;

import model.ModelCidades;
import DAO.DAOCidades;
import java.util.ArrayList;

/**
*
* @author Maycon Douglas
*/
public class ControllerCidades {

    private DAOCidades daoCidades = new DAOCidades();

    /**
    * grava Cidades
    * @param pModelCidades
    * @return int
    */
    public int salvarCidadesController(ModelCidades pModelCidades){
        return this.daoCidades.salvarCidadesDAO(pModelCidades);//
    }

    /**
    * recupera Cidades
    * @param pIdCidade
    * @return ModelCidades
    */
    public ModelCidades getCidadesController(int pIdCidade){
        return this.daoCidades.getCidadesDAO(pIdCidade);
    }

    /**
    * recupera uma lista deCidades
    * @param pIdCidade
    * @return ArrayList
    */
    public ArrayList<ModelCidades> getListaCidadesController(){
        return this.daoCidades.getListaCidadesDAO();
    }

    /**
    * atualiza Cidades
    * @param pModelCidades
    * @return boolean
    */
    public boolean atualizarCidadesController(ModelCidades pModelCidades){
        return this.daoCidades.atualizarCidadesDAO(pModelCidades);
    }

    /**
    * exclui Cidades
    * @param pIdCidade
    * @return boolean
    */
    public boolean excluirCidadesController(int pIdCidade){
        return this.daoCidades.excluirCidadesDAO(pIdCidade);
    }
}