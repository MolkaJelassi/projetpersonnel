package tn.esprit.beautifulminds.services.crud;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.beautifulminds.persistence.Training;

/**
 * Session Bean implementation class Training
 */
@Stateless

public class Trainingservices implements TrainingservicesRemote, TrainingservicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public Trainingservices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addTraining(Training training) {
		entityManager.persist(training);

	}

	@Override
	public Training findTrainingById(Integer idTraining) {
		return entityManager.find(Training.class, idTraining);
	}

	@Override
	public void deleteTraining(Training training) {
		entityManager.remove(entityManager.merge(training));

	}

	@Override
	public void updateTraining(Training training) {
		entityManager.merge(training);
	}

	@Override
	public List<Training> findAllTrainings() {
		return entityManager.createQuery("select t from Training t ").getResultList();
	}

}
