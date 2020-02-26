package DAO;

import model.ModelCidades;
import Connect.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Maycon Douglas
*/
public class DAOCidades extends ConexaoMySql {

    /**
    * grava Cidades
    * @param pModelCidades
    * @return int
    */
    public int salvarCidadesDAO(ModelCidades pModelCidades){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO cidades ("
                    + "id_cidade,"
                    + "descricao,"
                    + "uf,"
                    + "codigo_ibge,"
                    + "ddd"
                + ") VALUES ("
                    + "'" + pModelCidades.getIdCidade() + "',"
                    + "'" + pModelCidades.getDescricao() + "',"
                    + "'" + pModelCidades.getUf() + "',"
                    + "'" + pModelCidades.getCodigoIbge() + "',"
                    + "'" + pModelCidades.getDdd() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Cidades
    * @param pIdCidade
    * @return ModelCidades
    */
    public ModelCidades getCidadesDAO(int pIdCidade){
        ModelCidades modelCidades = new ModelCidades();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cidade,"
                    + "descricao,"
                    + "uf,"
                    + "codigo_ibge,"
                    + "ddd"
                 + " FROM"
                     + " cidades"
                 + " WHERE"
                     + " id_cidade = '" + pIdCidade + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCidades.setIdCidade(this.getResultSet().getInt(1));
                modelCidades.setDescricao(this.getResultSet().getString(2));
                modelCidades.setUf(this.getResultSet().getString(3));
                modelCidades.setCodigoIbge(this.getResultSet().getInt(4));
                modelCidades.setDdd(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCidades;
    }

    /**
    * recupera uma lista de Cidades
        * @return ArrayList
    */
    public ArrayList<ModelCidades> getListaCidadesDAO(){
        ArrayList<ModelCidades> listamodelCidades = new ArrayList();
        ModelCidades modelCidades = new ModelCidades();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cidade,"
                    + "descricao,"
                    + "uf,"
                    + "codigo_ibge,"
                    + "ddd"
                 + " FROM"
                     + " cidades"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCidades = new ModelCidades();
                modelCidades.setIdCidade(this.getResultSet().getInt(1));
                modelCidades.setDescricao(this.getResultSet().getString(2));
                modelCidades.setUf(this.getResultSet().getString(3));
                modelCidades.setCodigoIbge(this.getResultSet().getInt(4));
                modelCidades.setDdd(this.getResultSet().getString(5));
                listamodelCidades.add(modelCidades);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCidades;
    }

    /**
    * atualiza Cidades
    * @param pModelCidades
    * @return boolean
    */
    public boolean atualizarCidadesDAO(ModelCidades pModelCidades){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE cidades SET "
                    + "id_cidade = '" + pModelCidades.getIdCidade() + "',"
                    + "descricao = '" + pModelCidades.getDescricao() + "',"
                    + "uf = '" + pModelCidades.getUf() + "',"
                    + "codigo_ibge = '" + pModelCidades.getCodigoIbge() + "',"
                    + "ddd = '" + pModelCidades.getDdd() + "'"
                + " WHERE "
                    + "id_cidade = '" + pModelCidades.getIdCidade() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Cidades
    * @param pIdCidade
    * @return boolean
    */
    public boolean excluirCidadesDAO(int pIdCidade){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM cidades "
                + " WHERE "
                    + "id_cidade = '" + pIdCidade + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}