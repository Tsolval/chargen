/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the 
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tsolval.chargen.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import net.tsolval.rpg.character.Character;

import net.tsolval.rpg.character.palladium.PalladiumCharacter;

@ApplicationScoped
public class CharacterRepository {

	@Inject
	private EntityManager em;

	@Named
	@Produces
	public Character getCharacter() {
		TypedQuery<Character> query = em
				.createQuery(
						"SELECT c FROM Character c JOIN FETCH c.attributes where c.id=0",
						Character.class);
		return query.getSingleResult();
	}

	public List<PalladiumCharacter> findAllOrderedByName() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<PalladiumCharacter> criteria = cb
				.createQuery(PalladiumCharacter.class);
		Root<PalladiumCharacter> character = criteria
				.from(PalladiumCharacter.class);
		criteria.select(character).orderBy(cb.asc(character.get("name")));
		return em.createQuery(criteria).getResultList();
	}
}
