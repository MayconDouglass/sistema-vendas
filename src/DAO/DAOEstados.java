package DAO;

import model.ModelEstados;
import Connect.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Maycon Douglas
*/
public class DAOEstados extends ConexaoMySql {

    /**
    * grava Estados
    * @param pModelEstados
    * @return int
    */
    public int salvarEstadosDAO(ModelEstados pModelEstados){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO estado ("
                    + "idestado,"
                    + "nome,"
                    + "uf"
                + ") VALUES ("
                    + "'" + pModelEstados.getIdestado() + "',"
                    + "'" + pModelEstados.getNome() + "',"
                    + "'" + pModelEstados.getUf() + "'"
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
    * recupera Estados
    * @param pIdestado
    * @return ModelEstados
    */
    public ModelEstados getEstadosDAO(int pIdestado){
        ModelEstados modelEstados = new ModelEstados();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idestado,"
                    + "nome,"
                    + "uf"
                 + " FROM"
                     + " estado"
                 + " WHERE"
                     + " idestado = '" + pIdestado + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelEstados.setIdestado(this.getResultSet().getInt(1));
                modelEstados.setNome(this.getResultSet().getString(2));
                modelEstados.setUf(this.getResultSet().getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelEstados;
    }

    /**
    * recupera uma lista de Estados
        * @return ArrayList
    */
    public ArrayList<ModelEstados> getListaEstadosDAO(){
        ArrayList<ModelEstados> listamodelEstados = new ArrayList();
        ModelEstados modelEstados = new ModelEstados();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idestado,"
                    + "nome,"
                    + "uf"
                 + " FROM"
                     + " estado"
                + ";"
            );

            while(this.getResultSet().next()){
                modelEstados = new ModelEstados();
                modelEstados.setIdestado(this.getResultSet().getInt(1));
                modelEstados.setNome(this.getResultSet().getString(2));
                modelEstados.setUf(this.getResultSet().getString(3));
                listamodelEstados.add(modelEstados);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelEstados;
    }

    /**
    * atualiza Estados
    * @param pModelEstados
    * @return boolean
    */
    public boolean atualizarEstadosDAO(ModelEstados pModelEstados){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE estado SET "
                    + "idestado = '" + pModelEstados.getIdestado() + "',"
                    + "nome = '" + pModelEstados.getNome() + "',"
                    + "uf = '" + pModelEstados.getUf() + "'"
                + " WHERE "
                    + "idestado = '" + pModelEstados.getIdestado() + "'"
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
    * exclui Estados
    * @param pIdestado
    * @return boolean
    */
    public boolean excluirEstadosDAO(int pIdestado){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM estado "
                + " WHERE "
                    + "idestado = '" + pIdestado + "'"
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