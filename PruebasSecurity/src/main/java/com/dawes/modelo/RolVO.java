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
@Table(name = "usuarios", uniqueConstraints = {@UniqueConstraint(name = "ROLES_UK" , columnNames = "Role_Name")})
public class RolVO {

	@Id
	@GeneratedValue
	@Column(name = "Role_Id", nullable = false)
	private Long roleId;
	
	@Column(name = "Role_Name", length = 30, nullable = false)
	private String roleName;
	
	@OneToMany(mappedBy = "rol", fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, orphanRemoval = true)
	private List<UsuarioRolVO> roles;

	public RolVO(Long roleId, String roleName, List<UsuarioRolVO> roles) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roles = roles;
	}

	public RolVO(String roleName, List<UsuarioRolVO> roles) {
		super();
		this.roleName = roleName;
		this.roles = roles;
	}

	public RolVO() {
		super();
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
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
		RolVO other = (RolVO) obj;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RolVO [roleId=" + roleId + ", roleName=" + roleName + ", roles=" + roles + "]";
	}
	
	

	
	
}
