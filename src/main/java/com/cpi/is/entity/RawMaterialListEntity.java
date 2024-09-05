package com.cpi.is.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

import com.cpi.is.entity.maintenance.DispatchTypeEntity;
import com.cpi.is.entity.maintenance.MaterialCodeEntity;

@Entity
@Table(name = "qkc_raw_material_list")
public class RawMaterialListEntity {

    @Id
    @Column (name="MATERIAL_ID_LIST")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer materialListId;
    @Column (name="MATERIAL_CD")
    private String materialCd;
    private Integer quantity;
    @Column (name="USER_ID")
    private Integer userId;
    @Column (name="DATE_RECEIVE")
    @Temporal(TemporalType.DATE)
    private Date dateReceive;
    @Column (name="BRANCH_ID")
    private Integer branchId;
    
    @ManyToOne
	@JoinColumn(name="material_cd", insertable=false, updatable=false)
	private MaterialCodeEntity materialName;

	public RawMaterialListEntity() {
		super();
	}
    
	public RawMaterialListEntity(Integer materialListId, String materialCd, Integer quantity, Integer userId,
			Date dateReceive, Integer branchId) {
		super();
		this.materialListId = materialListId;
		this.materialCd = materialCd;
		this.quantity = quantity;
		this.userId = userId;
		this.dateReceive = dateReceive;
		this.branchId = branchId;
	}
    
    // Getters and Setters

    public Integer getMaterialListId() {
        return materialListId;
    }

    public void setMaterialListId(Integer materialListId) {
        this.materialListId = materialListId;
    }

    public String getMaterialCd() {
        return materialCd;
    }

    public void setMaterialCd(String materialCd) {
        this.materialCd = materialCd;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDateReceive() {
        return dateReceive;
    }

    public void setDateReceive(Date dateReceive) {
        this.dateReceive = dateReceive;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
    
    public MaterialCodeEntity getMaterialName() {
		return materialName;
	}

	public void setMaterialName(MaterialCodeEntity materialName) {
		this.materialName = materialName;
	}

	@Override
	public String toString() {
		return "RawMaterialListEntity [materialListId=" + materialListId + ", materialCd=" + materialCd + ", quantity="
				+ quantity + ", userId=" + userId + ", dateReceive=" + dateReceive + ", branchId=" + branchId + "]";
	}
    
}
