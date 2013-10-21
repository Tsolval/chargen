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
package net.tsolval.chargen.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@XmlRootElement
@Table(name = "RPG_CHARACTER")
public class Character implements Serializable {
	private static final long serialVersionUID = 4571926805008858141L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@NotEmpty
	private String name;

	@NotNull
	@NotEmpty
	private String player;

	@NotNull
	@NotEmpty
	private String campaign;

	private Set<Attribute> attributes;

	public Character() {

	}

	public Character(String name, String player, String campaign) {
		setName(name);
		setPlayer(player);
		setCampaign(campaign);
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}

	/**
	 * @param player
	 *            the player to set
	 */
	public void setPlayer(String player) {
		this.player = player;
	}

	/**
	 * @return the campaign
	 */
	public String getCampaign() {
		return campaign;
	}

	/**
	 * @param campaign
	 *            the campaign to set
	 */
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	/**
	 * @return the attributes
	 */
	public Set<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public void setAttributes(Set<Attribute> attributes) {
		this.attributes = attributes;
	}
}
