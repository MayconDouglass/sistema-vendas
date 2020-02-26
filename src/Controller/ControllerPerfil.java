package controller;

import model.ModelPerfil;
import DAO.DAOPerfil;
import java.util.ArrayList;

/**
*
* @author Maycon Douglas
*/
public class ControllerPerfil {

    private DAOPerfil daoPerfil = new DAOPerfil(); 

    /**
    * grava Perfil
    * @param pModelPerfil
    * return int
    */
    public int salvarPerfilController(ModelPerfil pModelPerfil){
        return this.daoPerfil.salvarPerfilDAO(pModelPerfil);
    }

    /**
    * recupera Perfil
    * @param pIdperfil
    * return ModelPerfil
    */
    public ModelPerfil getPerfilController(int pIdperfil){
        return this.daoPerfil.getPerfilDAO(pIdperfil);
    }
    /**
    * recupera Perfil
    * @param pNomePerfil
    * return ModelPerfil
    */
    public ModelPerfil getPerfilNomeController(String pNomePerfil){
        return this.daoPerfil.getPerfilNomeDAO(pNomePerfil);
    }
    /**
    * recupera Perfil
    * @param pNomePerfil
    * return ModelPerfil
    */
    public ModelPerfil getUsuarioPerfilNomeController(String pNomePerfil){
        return this.daoPerfil.getUsuarioPerfilNomeDAO(pNomePerfil);
    }
    /**
    * valida Perfil
    * @param pPerfil
    * return ModelPerfil
    */
    public ModelPerfil getPerfilVerificaDuplicidadeController(String pPerfil){
        return this.daoPerfil.getPerfilVerificaDuplicidadeDAO(pPerfil);
    }

    /**
    * recupera uma lista dePerfil
    * @param pIdperfil
    * return ArrayList
    */
    public ArrayList<ModelPerfil> getListaPerfilController(){
        return this.daoPerfil.getListaPerfilDAO();
    }
    /**
    * recupera uma lista dePerfil
    * @param pStatus
    * 1 - Ativo
    * 0 - Inativo
    * return ArrayList
    */
    public ArrayList<ModelPerfil> getListaPerfilStatusController(int pStatus){
        return this.daoPerfil.getListaPerfilStatusDAO(pStatus);
    }

    /**
    * atualiza Perfil
    * @param pModelPerfil
    * return boolean
    */
    public boolean atualizarPerfilController(ModelPerfil pModelPerfil){
        return this.daoPerfil.atualizarPerfilDAO(pModelPerfil);
    }

    /**
    * exclui Perfil
    * @param pIdperfil
    * return boolean
    */
    public boolean excluirPerfilController(int pIdperfil){
        return this.daoPerfil.excluirPerfilDAO(pIdperfil);
    }
}