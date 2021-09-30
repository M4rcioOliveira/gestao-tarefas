package br.com.esig.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.esig.domain.Tarefa;
import br.com.esig.domain.enums.Responsavel;


@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	
	@Query(value = "SELECT * from tarefa where descricao = ?1", nativeQuery = true)
	List<Tarefa> findByDescricao(String descricao);
	
	@Query(value = "SELECT * from tarefa where titulo = ?1", nativeQuery = true)
	List<Tarefa> findByTitulo(String titulo);
	
	@Query(value = "SELECT * from tarefa where responsavel = ?1", nativeQuery = true)
	List<Tarefa> findByResponsavel(String  responsavel);
	
	@Query(value = "SELECT * from tarefa where prioridade = ?1", nativeQuery = true)
	List<Tarefa> findByPrioridade(String  prioridade);
	
	

}
