package com.dawes.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuarios", uniqueConstraints = { @UniqueConstraint(name = "USUARIOS_UK", columnNames = "User_Name") })
public class UsuarioVO {

	@Id
	@GeneratedValue
	@Column(name = "usuarios", nullable = false)
	private long userId;

	@Column(name = "User_Name", length = 36, nullable = false)
	private String userName;

	@Column(name = "Encrypted_Password", length = 128, nullable = false)
	private String encryptedPassword;
	
	@Column(name = "Enabled", length = 1, nullable = false)
	private boolean enabled;

	@OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<UsuarioRolVO> roles;

	public UsuarioVO(long userId, String userName, String encryptedPassword, boolean enabled,
			List<UsuarioRolVO> roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.encryptedPassword = encryptedPassword;
		this.enabled = enabled;
		this.roles = roles;
	}

	public UsuarioVO(String userName, String encryptedPassword, boolean enabled, List<UsuarioRolVO> roles) {
		super();
		this.userName = userName;
		this.encryptedPassword = encryptedPassword;
		this.enabled = enabled;
		this.roles = roles;
	}
	
	

	public UsuarioVO(String userName, String encryptedPassword, List<UsuarioRolVO> roles) {
		super();
		this.userName = userName;
		this.encryptedPassword = encryptedPassword;
		this.roles = roles;
	}

	public UsuarioVO() {
		super();
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<UsuarioRolVO> getRoles() {
		return roles;
	}

	public void setRoles(List<UsuarioRolVO> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result + ((encryptedPassword == null) ? 0 : encryptedPassword.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioVO other = (UsuarioVO) obj;
		if (enabled != other.enabled)
			return false;
		if (encryptedPassword == null) {
			if (other.encryptedPassword != null)
				return false;
		} else if (!encryptedPassword.equals(other.encryptedPassword))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioVO [userId=" + userId + ", userName=" + userName + ", encryptedPassword=" + encryptedPassword
				+ ", enabled=" + enabled + ", roles=" + roles + "]";
	}

	
}

	