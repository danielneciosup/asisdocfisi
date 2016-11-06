package pe.edu.sistemas.core.dao;

import java.io.Serializable;
import java.util.List;

public interface AbstractDAO<Entidad, PK>
{
	public void insertar( Entidad entidad ) throws Exception;
	public void actualizar( Entidad entidad ) throws Exception;;
	public void eliminar( Serializable id ) throws Exception;;
	public Entidad obtenerEntidadPorId( Class<Entidad> clase, Serializable id ) throws Exception;;
	public List<Entidad> listarTodos( Class<Entidad> clase ) throws Exception;;
}
