package net.tsolval.rpg.character;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Represents a character's derived statistics.
 * 
 * @author tsolval
 */
@Entity
@Table(name = "CHARACTER_STATS")
public class CharacterStats {
	@Id
	@Column(name = "CHARACTER_ID")
	private Integer characterId;
	@Column(name = "HP")
	private Integer hp;
	@Column(name = "SDC")
	private Integer sdc;
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "CHARACTER_ID", referencedColumnName = "ID")
	private Character character;

	/**
	 * @return the hp
	 */
	public Integer getHp() {
		return hp;
	}

	/**
	 * @param hp
	 *            the hp to set
	 */
	public void setHp(Integer hp) {
		this.hp = hp;
	}

	/**
	 * @return the sdc
	 */
	public Integer getSdc() {
		return sdc;
	}

	/**
	 * @param sdc
	 *            the sdc to set
	 */
	public void setSdc(Integer sdc) {
		this.sdc = sdc;
	}

}
